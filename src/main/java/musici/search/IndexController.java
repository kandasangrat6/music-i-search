package musici.search;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "Hello! 👋 Welcome to music-i-serach project!<br /><br />" + 
            "<h3><a href='/test'>Test Page</a></h3>";
	}

}