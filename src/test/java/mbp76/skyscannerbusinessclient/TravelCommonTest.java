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
 *
 * @author marcbperez
 *
 */
public class TravelCommonTest {

	public String notNullMessage = "Result should not be null";

	public String market = "UK";
	public String currency = "GBP";
	public String locale = "en-GB";
	public String originPlace = "BCN-sky";
	public String destinationPlace = "LGW-sky";
	public String outboundPartialDate = "2016-11-01";
	public String inboundPartialDate = "2016-11-10";

	public String apiKey = "prtl6749387986743898559646983194";

	@Test
	public void testGetCurrencies() throws MalformedURLException, IOException,
			JSONException {
		TravelCommon tc = new TravelCommon(apiKey, new Request());
		tc.getCurrencies();

		assertNotNull(notNullMessage, tc.parsed);
	}

	@Test
	public void testGetLocales() throws MalformedURLException, IOException,
			JSONException {
		TravelCommon tc = new TravelCommon(apiKey, new Request());
		tc.getLocales();

		assertNotNull(notNullMessage, tc.parsed);
	}

	@Test
	public void testGetMarkets() throws MalformedURLException, IOException,
			JSONException {
		TravelCommon tc = new TravelCommon(apiKey, new Request());
		tc.getMarkets(locale);

		assertNotNull(notNullMessage, tc.parsed);
	}

	@Test
	public void testGetLocationAutosuggest() throws MalformedURLException,
			IOException, JSONException {
		TravelCommon tc = new TravelCommon(apiKey, new Request());
		tc.getLocationAutosuggest(market, currency, locale, "lon");

		assertNotNull(notNullMessage, tc.parsed);
	}

	@Test
	public void testGetLocationInformation() throws MalformedURLException,
			IOException, JSONException {
		TravelCommon tc = new TravelCommon(apiKey, new Request());
		tc.getLocationInformation(market, currency, locale, originPlace);

		assertNotNull(notNullMessage, tc.parsed);
	}

	@Test
	public void testGetReferralUrl() throws MalformedURLException {
		TravelCommon tc = new TravelCommon(apiKey, new Request());
		tc.getReferralUrl(market, currency, locale, originPlace, destinationPlace,
			outboundPartialDate, inboundPartialDate);

		assertNotNull(notNullMessage, tc.request.url);
	}

}
