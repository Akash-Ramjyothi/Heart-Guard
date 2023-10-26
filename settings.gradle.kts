pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

//      Adding Jitpack
        maven { url = uri("https://jitpack.io") }
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

//      Adding Jitpack
        maven { url = uri("https://jitpack.io") }
        jcenter()
    }
}

rootProject.name = "Heart Guard v1"
include(":app")
 