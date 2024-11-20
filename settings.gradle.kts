rootProject.name = "modelix.composite"

includeBuild("../modelix.core")
//includeBuild("modelix.core/bulk-model-sync-gradle-test")
//includeBuild("modelix.core/model-api-gen-gradle-test")
//includeBuild("modelix.core/model-client-js-test")
includeBuild("../modelix.incremental")
includeBuild("../modelix.kubernetes")
includeBuild("../modelix.mps-build-tools")
includeBuild("../modelix.mps-plugins")
includeBuild("../modelix.text-editor")
includeBuild("../modelix.workspaces")
