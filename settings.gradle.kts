rootProject.name = "modelix.composite"

includeBuild("../modelix.core")
includeBuild("../modelix.dashboard")
includeBuild("../modelix.editor")
includeBuild("../modelix.incremental")
includeBuild("../modelix.kubernetes")
includeBuild("../modelix.mps-api")
includeBuild("../modelix.mps-build-tools")
// TODO: modelix.mps-plugins still uses org.jetbrains.intellij 1.x, which is incompatible with Gradle 9.
//  Re-enable after migrating it to the IntelliJ Platform Gradle Plugin 2.x.
// includeBuild("../modelix.mps-plugins")
includeBuild("../modelix.openapi")
