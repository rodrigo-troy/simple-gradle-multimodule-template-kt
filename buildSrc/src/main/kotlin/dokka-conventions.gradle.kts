plugins {
    id("org.jetbrains.dokka")
}

dependencies {
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin")
}

tasks.dokkaJavadoc {
    outputDirectory.set(project.layout.buildDirectory.dir("javadoc"))
}
