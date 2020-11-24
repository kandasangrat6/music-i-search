package musici.search;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApiController {

	@RequestMapping("/api/search")
	public String search() {
    ApiSpotify spotify = new ApiSpotify();
    String res = spotify.getToken();
    System.out.println("spotify.getToken() => " + res);
		return "spotify.getToken() => " + res;
	}

}