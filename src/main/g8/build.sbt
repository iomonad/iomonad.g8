import Dependencies._

/* Global configuration */
lazy val root = (project in file(".")).
  settings(
	  inThisBuild(List(
		  organization := "io.trosa",
		  scalaVersion := "2.12.2",
		  version := "0.0.1"
	  )),
	  name := "avian",
	  libraryDependencies ++= Seq(
                  scalaTest % Test
          )
  )

/* Scala lang related */
scalacOptions += "-deprecation"
scalacOptions += "-feature"

/* Code coverage configuration */
coverageEnabled := true
coverageMinimum := 70
coverageFailOnMinimum := false
coverageHighlighting := true
