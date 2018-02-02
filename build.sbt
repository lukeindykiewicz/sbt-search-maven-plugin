organization := "com.blstream"

name := "sbt-search-maven-plugin"

description := "Sbt plugin to search with search.maven.org"

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

version := "0.2.0-SNAPSHOT"

crossSbtVersions := List("0.13.16", "1.1.0")

scalaVersion := {
  (sbtBinaryVersion in pluginCrossBuild).value match {
    case "0.13" => "2.10.6"
    case _      => "2.12.4"
  }
}

sbtPlugin := true

scriptedSettings

scriptedLaunchOpts += ("-Dplugin.version=" + version.value)

libraryDependencies ++= {
  val liftJsonCrossVersion =
    (sbtBinaryVersion in pluginCrossBuild).value match {
      case "0.13" =>  "2.6.2"
      case _      =>  "3.2.0"
    }

  Seq(
    "net.liftweb" %% "lift-json" % liftJsonCrossVersion,
    "org.specs2"  %% "specs2-core" % "3.9.4" % "test")
}

scalariformSettings
