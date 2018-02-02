sys.props.get("plugin.version") match {
  case Some(v) => addSbtPlugin("com.blstream" % "sbt-search-maven-plugin" % v)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}
