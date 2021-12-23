plugins {
	`kotlin-dsl`
	`java-gradle-plugin`
}


group = "land.cog.include-build"

repositories {
	mavenCentral()
}

gradlePlugin {
	plugins.register("common-plugin") {
		id = "common-plugin"
		implementationClass = "land.cog.build.CommonPlugin"
	}
}

dependencies {
	compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
}
