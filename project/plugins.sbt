// in project/plugins.sbt:
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "0.7.2")
// yty to solve Could not find Jetty NPN/ALPN or Conscrypt as installed JDK providers error
addSbtPlugin("com.lightbend.sbt" % "sbt-javaagent" % "0.1.4") // ALPN agent