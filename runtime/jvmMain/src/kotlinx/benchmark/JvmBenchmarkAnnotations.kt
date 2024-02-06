package kotlinx.benchmark

actual typealias Scope = org.openjdk.jmh.annotations.Scope

actual typealias State = org.openjdk.jmh.annotations.State

actual typealias Setup = org.openjdk.jmh.annotations.Setup

actual typealias TearDown = org.openjdk.jmh.annotations.TearDown

actual typealias Benchmark = org.openjdk.jmh.annotations.Benchmark

// TODO: This annotation is redundant in K2: KT-59561
//  K2 currently produces warning for its use.
@Suppress("NO_ACTUAL_CLASS_MEMBER_FOR_EXPECTED_CLASS")
actual typealias BenchmarkMode = org.openjdk.jmh.annotations.BenchmarkMode

actual typealias Mode = org.openjdk.jmh.annotations.Mode

actual typealias OutputTimeUnit = org.openjdk.jmh.annotations.OutputTimeUnit

// TODO: This annotation is redundant in K2: KT-59561
//  K2 currently produces warning for its use.
@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias BenchmarkTimeUnit = java.util.concurrent.TimeUnit

actual typealias Warmup = org.openjdk.jmh.annotations.Warmup

@Suppress("ACTUAL_ANNOTATION_CONFLICTING_DEFAULT_ARGUMENT_VALUE")
actual typealias Measurement = org.openjdk.jmh.annotations.Measurement

// TODO: This annotation is redundant in K2: KT-59561
//  K2 currently produces warning for its use.
@Suppress("NO_ACTUAL_CLASS_MEMBER_FOR_EXPECTED_CLASS")
actual typealias Param = org.openjdk.jmh.annotations.Param