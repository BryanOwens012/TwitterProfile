import java.io.IOException;
import java.net.MalformedURLException;

import twitter4j.JSONException;

public class Main {

	public static void main(String[] args) throws MalformedURLException,
			IOException, JSONException {

		TwitterProfile obama = new TwitterProfile("@BarackObama");
		System.out.println(obama.getID());
	}
}
