import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import twitter4j.JSONException;
import twitter4j.JSONObject;

public class TwitterProfile {

	private String myTwitterID_URL;
	private String fullJsonText;
	private JSONObject json;

	public TwitterProfile(String screenName) throws MalformedURLException,
			IOException, JSONException {
		this.myTwitterID_URL = "http://mytwitterid.com/api/?screen_name="
				+ screenName.substring(1);
		InputStream is = new URL(myTwitterID_URL).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is,
					"UTF-8"));
			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = rd.read()) != -1) {
				sb.append((char) cp);
			}
			fullJsonText = sb.toString();
			String jsonText = fullJsonText.substring(1, sb.toString().length()); // substring
																					// is
																					// to
																					// get
																					// rid
																					// of
																					// the
																					// opening/closing
																					// [
																					// &
																					// ]
			json = new JSONObject(jsonText);
		} finally {
			is.close();
		}
	}

	public String getCreatedAt() throws JSONException {
		return json.getString("created_at");
	}

	public String getDescription() throws JSONException {
		return json.getString("description");
	}

	public String getFollowersCount() throws JSONException {
		return json.getString("followers_count");
	}

	public String getFriendsCount() throws JSONException {
		return json.getString("friends_count");
	}

	public String getID() throws JSONException {
		return json.getString("id_str");
	}

	public String getLanguage() throws JSONException {
		return json.getString("lang");
	}

	public String getLocation() throws JSONException {
		return json.getString("location");
	}

	public String getName() throws JSONException {
		return json.getString("name");
	}

	public String getProfileBackgroundImageURL() throws JSONException {
		return json.getString("profile_background_image_url");
	}

	public String getProfileBannerURL() throws JSONException {
		return json.getString("profile_banner_url");
	}

	public String getProfileImageURL() throws JSONException {
		return json.getString("profile_image_url");
	}

	public String getScreenName() throws JSONException {
		return json.getString("screen_name");
	}

	public String getTimeZone() throws JSONException {
		return json.getString("time_zone");
	}

	public String getURL() throws JSONException {
		return json.getString("url");
	}

	public String getVerified() throws JSONException { // returns "True" or
														// "False"
		return json.getString("verified");
	}

	public String getMyTwitterIDURL() {
		return myTwitterID_URL;
	}

	public String getFullJsonText() {
		return fullJsonText;
	}

	public JSONObject getJsonObject() {
		return json;
	}

}