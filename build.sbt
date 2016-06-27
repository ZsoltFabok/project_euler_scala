lazy val commonSettings = Seq(
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test"
  )
