package org.example.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/test")
public class TestAction {

	@GetMapping("")
	ModelAndView index() {
		return new ModelAndView("test/index");
	}

	@GetMapping("/test")
	ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "中文");
		mav.setViewName("test/test");
		return mav;
	}

}
