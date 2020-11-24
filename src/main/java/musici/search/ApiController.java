package musici.search;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApiController {

	@RequestMapping("/api/search")
	public String search() {
		return "👋";
	}

}