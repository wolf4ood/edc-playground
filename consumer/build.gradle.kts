plugins {
    `java-library`
    id("application")
}

val edcGroup: String by project
val edcVersion: String by project


dependencies {
    implementation("${edcGroup}:control-plane-core:${edcVersion}")
    implementation("${edcGroup}:api-observability:${edcVersion}")
    implementation("${edcGroup}:configuration-filesystem:${edcVersion}")
    implementation("${edcGroup}:iam-mock:${edcVersion}")
    implementation("${edcGroup}:auth-tokenbased:${edcVersion}")
    implementation("${edcGroup}:management-api:${edcVersion}")
    implementation("${edcGroup}:ids:${edcVersion}")
//    implementation("${edcGroup}:transfer-pull-http-receiver:${edcVersion}")
    implementation("${edcGroup}:transfer-pull-http-dynamic-receiver:${edcVersion}")

//    implementation("${edcGroup}:data-plane-core:${edcVersion}")
//    implementation("${edcGroup}:data-plane-api:${edcVersion}")
    implementation("${edcGroup}:vault-filesystem:${edcVersion}")


    implementation("${edcGroup}:transfer-data-plane:${edcVersion}")
    implementation("${edcGroup}:data-plane-selector-client:${edcVersion}")
    implementation("${edcGroup}:data-plane-selector-api:${edcVersion}")
    implementation("${edcGroup}:data-plane-selector-core:${edcVersion}")






}

application {
    mainClass.set("org.eclipse.edc.boot.system.runtime.BaseRuntime")
}
