import AssemblyKeys._

assemblySettings

name := "example-scala-local-helloworld"

organization := "org.sample"

libraryDependencies ++= Seq(
  "io.prediction" %% "core" % "0.8.6" % "provided",
  "io.prediction" %% "data" % "0.8.6" % "provided",
  "org.apache.spark" %% "spark-core" % "1.2.0" % "provided")
