organization := "org.reactivemongo"

name := "ReactiveMongo-BSON"

version := "0.9"

scalaVersion := "2.9.3"

//scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlog-implicits", "-Yinfer-debug")

// scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlog-implicits", "-Yinfer-debug", "-Xprint:typer")

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers ++= Seq("releases"  at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies += "org.specs2" %% "specs2" % "1.12.4.1" % "test"

scalacOptions in (Compile, doc) ++= Opts.doc.title("ReactiveMongo-BSON API")

scalacOptions in (Compile, doc) ++= Opts.doc.version("0.1-SNAPSHOT")
