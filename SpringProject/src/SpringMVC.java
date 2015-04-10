import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index")
public class SpringMVC {
	
	public void print(ModelMap m)
	{
		m.addAttribute("msg", "hello world");
	}

}
