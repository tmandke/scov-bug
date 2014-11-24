import sbt.Keys._
import sbt._
import scoverage.ScoverageSbtPlugin

object WierdBuild extends Build {
  lazy val root = Project(id = "root", base = file("."))
    .settings (publish := { }, publishLocal := { }) aggregate(core, example)

  lazy val core = Project(id = "core", base = file("core"))
    .settings(
      name := "scov-bug-test-core",
      organization := "org.wierdness",
      scalaVersion := "2.10.4",
      version := "0.0.0.1",
      scalacOptions := Seq(
        "-deprecation",
        "-encoding", "UTF-8",
        "-feature",
        "-Xfatal-warnings",
        "-unchecked"
      ),
      ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 100,
      ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true,
      libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
    )

  lazy val example = Project(id = "example", base = file("example"))
    .settings(
      name := "scov-bug-test-example",
      organization := "org.wierdness",
      scalaVersion := "2.10.4",
      version := "0.0.0.1",
      scalacOptions := Seq(
        "-deprecation",
        "-encoding", "UTF-8",
        "-feature",
        "-Xfatal-warnings",
        "-unchecked"
      ),
      ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 100,
      ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true,
      libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
    ).dependsOn(core)
}
