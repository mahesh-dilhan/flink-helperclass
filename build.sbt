name := "scala-flink-fn"

version := "0.1"

scalaVersion := "2.12.13"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % "1.13.1",
  "org.apache.flink" %% "flink-streaming-scala" % "1.13.1"
)