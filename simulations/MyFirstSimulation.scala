import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._

class MyFirstSimulation extends Simulation {

	val httpProtocol = http.baseURL("https://www.google.fr")

	val scn = scenario("Global scenario")
        .exec(http("GET google home").get("/"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
