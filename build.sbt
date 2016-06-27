val scalatest = "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

lazy val root = (project in file(".")).
  settings(
	libraryDependencies += scalatest
  )
