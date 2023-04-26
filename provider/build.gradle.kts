plugins {
    `java-library`
    id("application")
}

val edcGroup: String by project
val edcVersion: String by project


dependencies {
    api("${edcGroup}:data-plane-spi:${edcVersion}")
//    api("${edcGroup}:data-plane-transfer-spi:${edcVersion}")
    api("${edcGroup}:data-plane-selector-spi:${edcVersion}")
    api("${edcGroup}:control-plane-api-client-spi:${edcVersion}")



    implementation("${edcGroup}:control-plane-core:${edcVersion}")
    implementation("${edcGroup}:data-plane-core:${edcVersion}")
    implementation("${edcGroup}:api-observability:${edcVersion}")
    implementation("${edcGroup}:configuration-filesystem:${edcVersion}")
    implementation("${edcGroup}:vault-filesystem:${edcVersion}")
    implementation("${edcGroup}:iam-mock:${edcVersion}")
    implementation("${edcGroup}:auth-tokenbased:${edcVersion}")
    implementation("${edcGroup}:management-api:${edcVersion}")
    implementation("${edcGroup}:ids:${edcVersion}")

    implementation("${edcGroup}:transfer-data-plane:${edcVersion}")
    implementation("${edcGroup}:data-plane-selector-client:${edcVersion}")
    implementation("${edcGroup}:data-plane-selector-api:${edcVersion}")
    implementation("${edcGroup}:data-plane-selector-core:${edcVersion}")
    implementation("${edcGroup}:data-plane-api:${edcVersion}")
    implementation("${edcGroup}:data-plane-http:${edcVersion}")

//    implementation("org.eclipse.tractusx.edc:business-partner-validation:0.3.3-SNAPSHOT")


//    implementation("${edcGroup}:control-plane-api:${edcVersion}")
//    implementation("${edcGroup}:control-plane-api-client:${edcVersion}")

//    implementation("org.postgresql:postgresql:42.4.0")
//    implementation("${edcGroup}:sql-pool-apache-commons:${edcVersion}")
//    implementation("${edcGroup}:sql-lease:${edcVersion}")
//    implementation("${edcGroup}:transaction-local:${edcVersion}")
//    implementation("${edcGroup}:asset-index-sql:${edcVersion}")
//    implementation("${edcGroup}:contract-definition-store-sql:${edcVersion}")
//    implementation("${edcGroup}:contract-negotiation-store-sql:${edcVersion}")
//    implementation("${edcGroup}:policy-definition-store-sql:${edcVersion}")
//    implementation("${edcGroup}:transfer-process-store-sql:${edcVersion}")



}

application {
    mainClass.set("org.eclipse.edc.boot.system.runtime.BaseRuntime")
}
