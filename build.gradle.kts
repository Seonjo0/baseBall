plugins {
    application

    id("com.diffplug.spotless") version "6.25.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

sourceSets {
    main {
        java {
            srcDir("src")
        }
    }
}

application {
    mainClass = "BaseballGame"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

spotless {
    java {
        importOrder("java|javax", "", "com|org", "")

        removeUnusedImports()

        palantirJavaFormat("2.50.0")
        formatAnnotations()
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktlint()
    }
}
