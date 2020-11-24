package musici.search;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.time.Instant;

public class ApiSpotify {
  
  public String getToken() {
    ApplicationContext context = new ClassPathXmlApplicationContext("tokenbean.xml");
    TokenBean token = (TokenBean)context.getBean("TokenBean");
    if (token.spotifyToken == null) {
      long now = Instant.now().toEpochMilli();
      token.spotifyToken = Long.toString(now);;
    }
    System.out.println("getToken => " + token.spotifyToken);
		return token.spotifyToken;
	}

	public String search() {
		return "👋";
	}

}