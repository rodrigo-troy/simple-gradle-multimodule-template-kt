# Gradle, Kotlin, Spring Skeleton
[![Run Gradle on PRs](https://github.com/mrclrchtr/gradle-kotlin-spring/actions/workflows/gradle-build-pr.yml/badge.svg)](https://github.com/mrclrchtr/gradle-kotlin-spring/actions/workflows/gradle-build-pr.yml)

Do you already know how to set up a Gradle multi-project / multi-module with Kotlin DSL and Spring Dependency
Management?

I have set up an example here, in which I have abstracted the most important logical components and packed them into
individual buildSrc modules. This makes the build very modular and also very clear. What do you think?

It has the following details:

- Java 17
- Gradle 8.5
  - buildSrc
  - Kotlin DSL
  - Version Catalog (libs.versions.toml)
- Kotlin 1.9.22
- Spring Boot 3.2.2
- Detekt 1.23.5
- Dokka 1.9.10
- Spring Dependency-Management

## Run it!

The factory:

    gradlew :message-factory:bootRun

The Dashboard:

    gradlew :message-dashboard:bootRun

And now visit <http://localhost:8080/dashboard/Mr.Bean>

You can enter every name in place of "Mr.Bean". 
