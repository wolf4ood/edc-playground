plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

val snapshotUrl = "https://oss.sonatype.org/content/repositories/snapshots/"



dependencies {

}



allprojects {
    repositories {
        mavenLocal()
        maven {
            url = uri(snapshotUrl)
        }
        mavenCentral()
        maven {
            url = uri("https://maven.iais.fraunhofer.de/artifactory/eis-ids-public/")
        }
    }
}
