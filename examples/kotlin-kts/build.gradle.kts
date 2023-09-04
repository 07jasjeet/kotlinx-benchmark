@file:Suppress("UnstableApiUsage")

import kotlinx.benchmark.gradle.*
import org.jetbrains.kotlin.allopen.gradle.*
import org.jetbrains.kotlin.gradle.tasks.*


plugins {
    java
    kotlin("jvm")
    kotlin("plugin.allopen") version "2.0.255-SNAPSHOT"
    id("org.jetbrains.kotlinx.benchmark")
}

sourceSets.all {
    java.setSrcDirs(listOf("$name/src"))
    resources.setSrcDirs(listOf("$name/resources"))
}

configure<AllOpenExtension> {
    annotation("org.openjdk.jmh.annotations.State")
}

dependencies {
    implementation(project(":kotlinx-benchmark-runtime"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

benchmark {
    configurations {
        named("main") {
            iterationTime = 5
            iterationTimeUnit = "sec"
            
        }
    }
    targets {
        register("main") {
            this as JvmBenchmarkTarget
            jmhVersion = "1.21"
        }
    }
}