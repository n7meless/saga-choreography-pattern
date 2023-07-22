plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

allprojects {
    group = "dev.n7meless"
}

subprojects {
    repositories {
        mavenCentral()
    }
}
