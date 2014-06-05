
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class MyFirstSimulation extends Simulation {

	val httpConf = httpConfig.baseURL("https://www.google.fr")

	val chain_0 =
		exec(http("GET google home")
					.get("/")
			)

	val scn = scenario("Global scenario")
		.exec(chain_0)

	setUp(scn.users(1).protocolConfig(httpConf))
}