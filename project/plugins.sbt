addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

libraryDependencies += {
  "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
}

// Scripted plugin needs to declare this as a dependency
libraryDependencies += "jline" % "jline" % "2.11"
