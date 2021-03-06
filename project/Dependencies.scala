import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest"         %% "scalatest"        % "3.0.5"
  lazy val scalaCheck = "org.scalacheck"       %% "scalacheck"       % "1.14.0"
  lazy val akkaStreams = "com.typesafe.akka"   %% "akka-stream"      % "2.5.13"
  lazy val cats = "org.typelevel"              %% "cats-core"        % "1.1.0"
  lazy val catsLaws = "org.typelevel"          %% "cats-laws"        % "1.1.0"
  lazy val catsEffectLaws = "org.typelevel"    %% "cats-effect-laws" % "0.10"
  lazy val discipline = "org.typelevel"        %% "discipline"       % "0.9.0"
  lazy val monixReactive = "io.monix"          %% "monix-reactive"   % "3.0.0-RC1"
  lazy val monixTail = "io.monix"              %% "monix-tail"       % "3.0.0-RC1"
  lazy val fs2 = "co.fs2"                      %% "fs2-io"           % "0.10.5"
  lazy val shapeless = "com.chuusai"           %% "shapeless"        % "2.3.3"
  lazy val simulacrum = "com.github.mpilquist" %% "simulacrum"       % "0.12.0"
}
