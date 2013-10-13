package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    @Qualifier("helloService")
    private HelloService helloService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(@RequestParam(required = false, defaultValue = "X") String m, ModelMap model)
    {
        String msg = "Hello world!";
        if ("1".equalsIgnoreCase(m)){
            msg = helloService.getPropertyUsingValueAnnotationFromSecurity();
        } else if ("2".equalsIgnoreCase(m)){
            msg = helloService.getPropertyUsingValueAnnotationFromOverride();
        } else if ("3".equalsIgnoreCase(m)){
            msg = helloService.getPropertyUsingReloadablePropertyAnnotationFromSecurity();
        } else if ("4".equalsIgnoreCase(m)){
            msg = Boolean.toString(helloService.getPropertyUsingReloadablePropertyAnnotationFromOverride());
        }

		model.addAttribute("message", msg);
		return "hello";
	}
}