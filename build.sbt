name := "circe-configuration"

organization := "pl.immutables"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation")

scalaOrganization in ThisBuild := "org.typelevel"

val circeVersion = "0.7.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-java8",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-generic-extras"
).map(_ % circeVersion)

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
