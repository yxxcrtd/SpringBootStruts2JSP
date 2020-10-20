package org.example.action;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexAction {

	@Autowired
	private UserService userService;

	@GetMapping("")
	ModelAndView index() {
		return new ModelAndView("index", "users", userService.findALL());
	}

}
