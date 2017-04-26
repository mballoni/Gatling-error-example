package br.com.example.fullstack

import br.com.example.fullstack.configuration.Protocol
import br.com.example.fullstack.home.WebStoreHome
import io.gatling.core.Predef._

class BasicSimulation extends Simulation {

  val browsingScenario = scenario("Browsing Journey")
    .exec(WebStoreHome.enter)

  setUp(
    browsingScenario.inject(
      atOnceUsers(1)
    )
  ).protocols(Protocol.HTTP)
}
