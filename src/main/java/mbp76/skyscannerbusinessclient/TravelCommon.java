/**
 *
 */
package marcbperez.skyscannerbusinessclient;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author marcbperez
 *
 */
public class TravelCommon {

	public String baseUrl = "http://partners.api.skyscanner.net/apiservices";
	public String version = "v1.0";
	public String apiKey;
	public Request request;
	public JSONObject parsed;

	/**
	 *
	 */
	public TravelCommon(String apiKey, Request request) {
		this.apiKey = apiKey;
		this.request = request;
	}

	/**
	 *
	 * @return
	 */
	public String shortApiKey() {
		return apiKey.substring(0, 16);
	}

	/**
	 *
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getCurrencies() throws MalformedURLException, IOException,
			JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("reference");
		crumbs.add(version);
		crumbs.add("currencies");

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
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getLocales() throws MalformedURLException, IOException,
			JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("reference");
		crumbs.add(version);
		crumbs.add("locales");

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
	 * @param locale
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getMarkets(String locale) throws MalformedURLException,
			IOException, JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("reference");
		crumbs.add(version);
		crumbs.add("countries");
		crumbs.add(locale);

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
	 * @param query
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getLocationAutosuggest(String market, String currency,
			String locale, String query) throws MalformedURLException, IOException,
			JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("autosuggest");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", apiKey);
		parameters.put("query", query);

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
	 * @param locationId
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getLocationInformation(String market, String currency,
			String locale, String locationId) throws MalformedURLException,
			IOException, JSONException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("autosuggest");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", apiKey);
		parameters.put("id", locationId);

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
	 */
	public URL getReferralUrl(String market, String currency, String locale,
			String originPlace, String destinationPlace, String outboundPartialDate,
			String inboundPartialDate) throws MalformedURLException {
		ArrayList<String> crumbs = new ArrayList<String>();
		crumbs.add("referral");
		crumbs.add(version);
		crumbs.add(market);
		crumbs.add(currency);
		crumbs.add(locale);
		crumbs.add(originPlace);
		crumbs.add(destinationPlace);
		crumbs.add(outboundPartialDate);
		crumbs.add(inboundPartialDate);

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("apiKey", shortApiKey());

		request.buildUrl(baseUrl, crumbs, parameters);

		return request.url;
	}

}
