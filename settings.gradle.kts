pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":test_module")
include(":login_module")
include(":di")
include(":phone_tablet")
include(":phone_tablet:api")
include(":phone_tablet:impl")
include(":boloswina")
include(":android_library")
