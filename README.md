# kotlin-project-template
A Kotlin/JVM Project Template with Gradle.

### Clone
[![Use This Template](https://git.io/UseThisTemplate)](https://github.com/cog25/kotlin-project-template/generate)  
or
```sh
npx degit cog25/kotlin-project-template new-kotlin-project
```

## Overall structure
- [`gradle/libs.versions.toml`](gradle/libs.versions.toml): where all dependencies are defined
- [`includeBuild`](includeBuild): some wrappers lie here(see [utils.kt](includeBuild/src/main/kotlin/com/lhwdev/build/utils.kt))
- [`core`](modules/core): example module with Kotlin JVM.  
  When renaming / duplicating this module, add argument in `includeAll()` in [settings.gradle.kts](settings.gradle.kts).
