/**
 *
 */
package marcbperez.skyscannerbusinessclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marcbperez
 *
 */
public class Request {
	public URL url;
	public HttpURLConnection connection;

	/**
	 *
	 */
	public Request() {
		// Request constructor method.
	}

	/**
	 *
	 * @param base
	 * @param crumbs
	 * @param parameters
	 * @return
	 * @throws MalformedURLException
	 */
	public URL buildUrl(String base, ArrayList<String> crumbs,
			HashMap<String, String> parameters) throws MalformedURLException {
		String location = base;

		for (String crumb : crumbs)
			location += "/" + crumb;

		location += "?";

		for (HashMap.Entry<String, String> parameter : parameters.entrySet())
			location += "&" + parameter.getKey() + "=" + parameter.getValue();

		url = new URL(location);

		return url;
	}

	/**
	 *
	 * @param properties
	 * @return
	 * @throws IOException
	 */
	public HttpURLConnection connect(HashMap<String, String> properties)
			throws IOException {
		connection = (HttpURLConnection) url.openConnection();

		for (HashMap.Entry<String, String> property : properties.entrySet()) {
			connection.setRequestProperty(property.getKey(), property.getValue());
		}

		return connection;
	}

	/**
	 *
	 * @return
	 * @throws IOException
	 */
	public String get() throws IOException {
		InputStreamReader sr = new InputStreamReader(connection.getInputStream());
		BufferedReader br = new BufferedReader(sr);
		String line = null;
		String content = "";

		while ((line = br.readLine()) != null) {
			content += line;
		}

		sr.close();
		br.close();

		return content;
	}

}
