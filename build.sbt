ThisBuild / version := "0.1.0-SNAPSHOT"

name := "SparkApp"

scalaVersion := "2.12.18"

libraryDependencies ++= Seq(

  // Spark dependencies
  "org.apache.spark" %% "spark-core" % "3.5.0",
  "org.apache.spark" %% "spark-sql" % "3.5.0",

  // Vulnerable dependency for testing
  "org.apache.logging.log4j" % "log4j-core" % "2.14.0"

)