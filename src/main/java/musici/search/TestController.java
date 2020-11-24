package musici.search;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

  @GetMapping(value = "/test")
	public String test(@RequestParam(name="name", required=false, defaultValue="Test Page") String name, Model model) {
		model.addAttribute("name", name);
		return "test";
	}

}