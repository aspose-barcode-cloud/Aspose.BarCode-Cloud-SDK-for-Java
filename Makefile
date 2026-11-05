SRC=./src

.PHONY: all
all: format build test lint

.PHONY: fix
fix:
	./scripts/fix-region-point.bash
	./scripts/annotate-deprecated.bash

.PHONY: format
format:
	./scripts/format.bash

.PHONY: lint
lint:
	./scripts/checkstyle.bash

.PHONY: build
build:
	mvn compile -Dmaven.test.skip=true
	mvn dependency:copy-dependencies -DoutputDirectory=target/lib/

.PHONY: test
test: cover
	mvn dependency:copy-dependencies -DoutputDirectory=target/lib/
	./scripts/run_snippets.sh

# `mvn test` enforces the 80% line gate with jacoco:check (see pom.xml); the shared
# scripts/coverage.py prints the percentage, applies COVERAGE_THRESHOLD (default 80)
# and writes coverage/coverage-{badge,summary}.json.
.PHONY: cover
cover:
	mvn test
	mkdir -p coverage
	cp target/site/jacoco/jacoco.xml coverage/jacoco.xml
	python3 scripts/coverage.py jacoco coverage/jacoco.xml

.PHONY: display-updates
display-updates:
	mvn versions:display-plugin-updates versions:display-dependency-updates

.PHONY: update
update:
	mvn versions:update-properties

.PHONY: insert-example
insert-example:
	./scripts/insert-example.bash

.PHONY: format-doc
format-doc:
	# Trim trailing empty line
	sed -i -e '$${/^$$/d;}' README.md

.PHONY: after-gen
after-gen: fix format insert-example format-doc
