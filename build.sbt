import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"

lazy val commonSettings = Seq(
  scalacOptions ++= "-deprecation" :: "-feature" :: "-Xlint" :: Nil,
  scalacOptions in (Compile, console) ~= {_.filterNot(_ == "-Xlint")},
  scalafmtOnCompile := true
)

lazy val root = (project in file("."))
  .settings(
    name := "scala-s99",
    commonSettings,
    libraryDependencies += scalaTest % Test
  )
