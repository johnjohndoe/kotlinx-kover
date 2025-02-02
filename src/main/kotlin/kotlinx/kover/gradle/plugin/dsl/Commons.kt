/*
 * Copyright 2017-2023 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.kover.gradle.plugin.dsl

/**
 * TODO
 */
public const val DEPENDENCY_CONFIGURATION_NAME = "kover"

/**
 * TODO
 */
public const val PROJECT_EXTENSION_NAME = "kover"

/**
 * TODO
 */
public const val REGULAR_REPORT_EXTENSION_NAME = "koverReport"

/**
 * TODO
 */
public const val ANDROID_EXTENSION_NAME = "koverAndroid"

/**
 * Name of the XML report generation task for Kotlin JVM and Kotlin multiplatform projects.
 */
public const val REGULAR_XML_REPORT_NAME = "koverXmlReport"

/**
 * Name of the HTML report generation task for Kotlin JVM and Kotlin multiplatform projects.
 */
public const val REGULAR_HTML_REPORT_NAME = "koverHtmlReport"

/**
 * Name of the verification task for Kotlin JVM and Kotlin multiplatform projects.
 */
public const val REGULAR_VERIFY_REPORT_NAME = "koverVerify"

public interface KoverClassDefinitions {
    public fun classes(vararg names: String)
    public fun classes(names: Iterable<String>)

    public fun packages(vararg names: String)
    public fun packages(names: Iterable<String>)
}

public interface KoverTaskDefinitions {
    public fun tasks(vararg name: String)
    public fun tasks(names: Iterable<String>)
}
