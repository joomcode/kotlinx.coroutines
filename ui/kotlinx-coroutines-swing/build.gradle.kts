/*
 * Copyright 2016-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

apply(from = rootProject.file("gradle/atomicfu.gradle"))

dependencies {
    testCompile(project(":kotlinx-coroutines-jdk8"))
}
