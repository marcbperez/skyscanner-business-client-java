/**
 *
 */
package marcbperez.skyscannerbusinessclient;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author marcbperez
 *
 */
public class TravelFlightsCache {

	public String baseUrl = "http://partners.api.skyscanner.net/apiservices";
	public String version = "v1.0";
	public String apiKey;
	public Request request;
	public JSONObject parsed;

	/**
	 *
	 * @param apiKey
	 * @param request
	 */
	public TravelFlightsCache(String apiKey, Request request) {
		this.apiKey = apiKey;
		this.request = request;
	}

	/**
	 *
	 * @param market
	 * @param currency
	 * @param locale
	 * @param originPlace
	 * @param destinationPlace
	 * @param outboundPartialDate
	 * @param inboundPartialDate
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getCheapestQuotes(String market, String currency,
			String locale, String originPlace, String destinationPlace,
			String outboundPartialDate, String inboundPartialDate) throws
			MalformedURLException, IOException, JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("browsequotes");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);
		crumbs.add(originPlace);
		crumbs.add(destinationPlace);
		crumbs.add(outboundPartialDate);
		crumbs.add(inboundPartialDate);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", apiKey);

		HashMap<String, String> properties = new HashMap<String, String>();
		properties.put("charset", "utf-8");
		properties.put("Accept", "application/json");

		request.buildUrl(baseUrl, crumbs, parameters);
		request.connect(properties);
		parsed = new JSONObject(request.get());

		return parsed;
	}

	/**
	 *
	 * @param market
	 * @param currency
	 * @param locale
	 * @param originPlace
	 * @param destinationPlace
	 * @param outboundPartialDate
	 * @param inboundPartialDate
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getCheapestPriceByRoute(String market, String currency,
			String locale, String originPlace, String destinationPlace,
			String outboundPartialDate, String inboundPartialDate) throws
			MalformedURLException, IOException, JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("browseroutes");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);
		crumbs.add(originPlace);
		crumbs.add(destinationPlace);
		crumbs.add(outboundPartialDate);
		crumbs.add(inboundPartialDate);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", apiKey);

		HashMap<String, String> properties = new HashMap<String, String>();
		properties.put("charset", "utf-8");
		properties.put("Accept", "application/json");

		request.buildUrl(baseUrl, crumbs, parameters);
		request.connect(properties);
		parsed = new JSONObject(request.get());

		return parsed;
	}

	/**
	 *
	 * @param market
	 * @param currency
	 * @param locale
	 * @param originPlace
	 * @param destinationPlace
	 * @param outboundPartialDate
	 * @param inboundPartialDate
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getCheapestPriceByDate(String market, String currency,
			String locale, String originPlace, String destinationPlace,
			String outboundPartialDate, String inboundPartialDate) throws
			MalformedURLException, IOException, JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("browsedates");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);
		crumbs.add(originPlace);
		crumbs.add(destinationPlace);
		crumbs.add(outboundPartialDate);
		crumbs.add(inboundPartialDate);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", apiKey);

		HashMap<String, String> properties = new HashMap<String, String>();
		properties.put("charset", "utf-8");
		properties.put("Accept", "application/json");

		request.buildUrl(baseUrl, crumbs, parameters);
		request.connect(properties);
		parsed = new JSONObject(request.get());

		return parsed;
	}

	/**
	 *
	 * @param market
	 * @param currency
	 * @param locale
	 * @param originPlace
	 * @param destinationPlace
	 * @param outboundPartialDate
	 * @param inboundPartialDate
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getGridPricesByDate(String market, String currency,
			String locale, String originPlace, String destinationPlace,
			String outboundPartialDate, String inboundPartialDate) throws
			MalformedURLException, IOException, JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("browsegrid");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);
		crumbs.add(originPlace);
		crumbs.add(destinationPlace);
		crumbs.add(outboundPartialDate);
		crumbs.add(inboundPartialDate);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", apiKey);

		HashMap<String, String> properties = new HashMap<String, String>();
		properties.put("charset", "utf-8");
		properties.put("Accept", "application/json");

		request.buildUrl(baseUrl, crumbs, parameters);
		request.connect(properties);
		parsed = new JSONObject(request.get());

		return parsed;
	}

}
