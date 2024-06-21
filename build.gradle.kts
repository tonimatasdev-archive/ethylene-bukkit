plugins {
    java
    `maven-publish`
}

group = "dev.tonimatas"
version = "dev-env"

base.archivesName.set("ethylene-bukkit")
java.toolchain.languageVersion = JavaLanguageVersion.of(21)

repositories {
    mavenCentral()
}

dependencies {
    // Bukkit Libs
    implementation("org.jetbrains:annotations:21.0.0")
    implementation("org.yaml:snakeyaml:2.2")
    implementation("org.apache.maven:maven-resolver-provider:3.9.6")
    implementation("org.apache.maven.resolver:maven-resolver-connector-basic:1.9.18")
    implementation("org.apache.maven.resolver:maven-resolver-transport-http:1.9.18")
    
    // Minecraft Libs
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.guava:guava:32.1.2-jre")
    implementation("org.joml:joml:1.10.5")
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            artifact(tasks.jar)
        }
    }
}
