
name := "IteRace-client"

version := "0.1"

organization := "Example Organization"

scalaVersion := "2.10.0"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true

mainClass := Some("iterace.IteRace")

javaOptions += "-Xmx4G" 

libraryDependencies ++= Seq(
"University of Illinois" %% "iterace" % "0.5", 
"com.novocode" % "junit-interface" % "0.10" % "test")