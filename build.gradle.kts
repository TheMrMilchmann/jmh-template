plugins {
    alias(libs.plugins.jmh)
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

jmh {
    jmhVersion = libs.versions.jmh
}
