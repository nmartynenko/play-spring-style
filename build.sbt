import play.Play.autoImport._
import PlayKeys._

//project settings

name := "sample-crud-play-spring-style"

version := "1.3"

//dependencies resolvers

resolvers ++= Seq(
  "Sonatype" at "http://search.maven.org/remotecontent?filepath=",
  "Spring milestones" at "https://repo.springsource.org/libs-milestone"
)

//Scala's compiler and runtime settings

scalaVersion := "2.10.4"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation"
)

//dependencies settings

libraryDependencies ++= {
  val springVersion = "4.0.5.RELEASE"
  val hibernateVersion = "4.3.5.Final"
  Seq(
    //test dependencies
    "junit" % "junit" % "4.11" % "test",
    "com.jayway.jsonpath" % "json-path" % "0.9.1" % "test",
    "org.springframework" % "spring-test" % springVersion % "test",
    //runtime dependencies
    //Spring dependencies
    "org.springframework" % "spring-aop" % springVersion,
    "org.springframework" % "spring-context-support" % springVersion,
    "org.springframework" % "spring-orm" % springVersion,
    "org.springframework" % "spring-webmvc" % springVersion,
    "org.springframework.security" % "spring-security-config" % "3.2.4.RELEASE",
    "org.springframework.data" % "spring-data-jpa" % "1.6.0.RELEASE",
    "org.springframework.scala" %% "spring-scala" % "1.0.0.RC1",
    //hibernate dependencies
    "org.hibernate" % "hibernate-core" % hibernateVersion,
    "org.hibernate" % "hibernate-ehcache" % hibernateVersion,
    "org.hibernate" % "hibernate-entitymanager" % hibernateVersion,
    "org.hsqldb" % "hsqldb" % "2.3.2",
    //jackson
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.3.3",
    //validation
    "net.sf.oval" % "oval" % "1.84",
    //enable JDBC module for the project
    jdbc,
    cache
  )
}

//apply plugin settings

lazy val spring_style = (project in file(".")).enablePlugins(PlayScala)