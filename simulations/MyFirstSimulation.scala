import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import io.gatling.http.Headers.Values._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class MyFirstSimulation extends Simulation {

	val httpProtocol = http.baseURL("https://www.google.fr")

	val scn = scenario("Global scenario")
        .exec(http("GET google home").get("/"))

	setUp(scn.inject(atOnce(1 user))).protocols(httpProtocol)
}
