package br.com.example.fullstack

import br.com.example.fullstack.configuration.Protocol
import br.com.example.fullstack.home.WebStoreHome
import io.gatling.core.Predef._

class BasicSimulation extends Simulation {

  //  val searchFeeder = csv("pre-prod/search_worlds.csv").random

  val browsingScenario = scenario("Browsing Journey")
    .exec(WebStoreHome.enter)

  setUp(
    browsingScenario.inject(
      atOnceUsers(1)
    )
  ).protocols(Protocol.HTTP)
    .assertions(global.successfulRequests.percent.is(100))
}
