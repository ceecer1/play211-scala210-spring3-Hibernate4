import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-scala-spring-hibernate"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
      "org.springframework" % "spring-context" % "3.1.2.RELEASE",
      "org.springframework" % "spring-orm" % "3.1.2.RELEASE",
      "org.springframework" % "spring-jdbc" % "3.1.2.RELEASE",
      "org.springframework" % "spring-tx" % "3.1.2.RELEASE",
      "org.springframework" % "spring-test" % "3.1.2.RELEASE" % "test",
      "org.hibernate" % "hibernate-entitymanager" % "4.1.9.Final",
      "cglib" % "cglib" % "2.2.2",
      "log4j" % "log4j" % "1.2.16",
      "commons-dbcp" % "commons-dbcp" % "1.2"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
