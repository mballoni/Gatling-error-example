package br.com.example.fullstack.home


import io.gatling.core.Predef._
import io.gatling.http.Predef._

object WebStoreHome {

  val enter = http("home_enter")
    .get("/")
    .header("Pragma", "no-cache")
    .check(status.is(200))
}
