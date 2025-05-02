plugins {
    base
    //id("com.google.cloud.tools.jib") version "3.4.5"
}

// Skaffold expects this task to be present in the root project,
// but since this is a composite build it's to propagated beyond the included builds.
tasks.register("_skaffoldFailIfJibOutOfDate")
