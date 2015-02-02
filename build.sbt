name := "Geotrellis Kernel Density"

scalaVersion := "2.10.0"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-optimize")

parallelExecution := false

libraryDependencies ++= Seq(
    "javax.media" % "jai_core" % "1.1.3" from "http://repo.opengeo.org/javax/media/jai_core/1.1.3/jai_core-1.1.3.jar",
    "org.geotools" % "gt-main" % "8.0-M4",
    "org.geotools" % "gt-coverage" % "8.0-M4",
    "org.geotools" % "gt-coveragetools" % "8.0-M4",
    "net.liftweb" % "lift-json_2.10" % "3.0-SNAPSHOT" from "https://oss.sonatype.org/content/repositories/snapshots/net/liftweb/lift-json_2.10/3.0-SNAPSHOT/lift-json_2.10-3.0-SNAPSHOT.jar",
    "com.azavea.geotrellis" %% "geotrellis" % "0.8.0-RC2"
)

resolvers ++= Seq(Resolver.sonatypeRepo("releases"),
                  Resolver.sonatypeRepo("snapshots"),
                  "Geotools" at "http://download.osgeo.org/webdav/geotools/")

mainClass in (Compile, run) := Some("geotrellis.rest.WebRunner")
