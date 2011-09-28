name := "Name"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.9.0" % "1.6.1",
  "com.codecommit" %% "anti-xml" % "0.2",
  "org.specs2" %% "specs2" % "1.6.1",
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test"
)

resolvers ++= Seq("snapshots" at "http://scala-tools.org/repo-snapshots",
                  "releases"  at "http://scala-tools.org/repo-releases")
