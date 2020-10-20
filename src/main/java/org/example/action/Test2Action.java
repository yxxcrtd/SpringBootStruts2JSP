package org.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test2")
public class Test2Action {

	@GetMapping("/test")
	ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "test2中文");
		mav.setViewName("test2/test");
		return mav;
	}

}
