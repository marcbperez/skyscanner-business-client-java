/**
 *
 */
package marcbperez.skyscannerbusinessclient;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;
import org.junit.Test;

/**
 * @author marcbperez
 *
 */
public class TravelFlightsCacheTest {

	public String notNullMessage = "Result should not be null";

	public String market = "UK";
	public String currency = "GBP";
	public String locale = "en-GB";
	public String originPlace = "BCN-sky";
	public String destinationPlace = "LGW-sky";
	public String outboundPartialDate = "2017-12-01";
	public String inboundPartialDate = "2017-12-30";

	public String apiKey = "prtl6749387986743898559646983194";

	@Test
	public void testGetCheapestQuotes() throws MalformedURLException, IOException,
			JSONException {
		TravelFlightsCache fc = new TravelFlightsCache(apiKey, new Request());
		fc.getCheapestQuotes(market, currency, locale, originPlace,
			destinationPlace, outboundPartialDate, inboundPartialDate);

		assertNotNull(notNullMessage, fc.parsed);
	}

	@Test
	public void testGetCheapestPriceByRoute() throws MalformedURLException,
			IOException, JSONException {
		TravelFlightsCache fc = new TravelFlightsCache(apiKey, new Request());
		fc.getCheapestPriceByRoute(market, currency, locale, originPlace,
			destinationPlace, outboundPartialDate, inboundPartialDate);

		assertNotNull(notNullMessage, fc.parsed);
	}

	@Test
	public void testGetCheapestPriceByDate() throws MalformedURLException,
			IOException, JSONException {
		TravelFlightsCache fc = new TravelFlightsCache(apiKey, new Request());
		fc.getCheapestPriceByDate(market, currency, locale, originPlace,
			destinationPlace, outboundPartialDate, inboundPartialDate);

		assertNotNull(notNullMessage, fc.parsed);
	}

	@Test
	public void testGetGridPricesByDate() throws MalformedURLException,
			IOException, JSONException {
		TravelFlightsCache fc = new TravelFlightsCache(apiKey, new Request());
		fc.getGridPricesByDate(market, currency, locale, originPlace,
			destinationPlace, outboundPartialDate, inboundPartialDate);

		assertNotNull(notNullMessage, fc.parsed);
	}

}
