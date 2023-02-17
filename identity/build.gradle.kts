plugins {
    `java-library`
    id("application")
}

val edcGroup: String by project
val edcVersion: String by project


dependencies {

    implementation("${edcGroup}:boot:${edcVersion}")
    implementation("${edcGroup}:connector-core:${edcVersion}")
    implementation("${edcGroup}:configuration-filesystem:${edcVersion}")


    implementation("${edcGroup}:api-observability:${edcVersion}")
    implementation("${edcGroup}:identity-did-web:${edcVersion}")
    implementation("${edcGroup}:identity-did-core:${edcVersion}")
    implementation("${edcGroup}:identity-hub-api:${edcVersion}")
    implementation("${edcGroup}:identity-hub:${edcVersion}")
    implementation("${edcGroup}:identity-hub-credentials-verifier:${edcVersion}")

}

application {
    mainClass.set("org.eclipse.edc.boot.system.runtime.BaseRuntime")
}
