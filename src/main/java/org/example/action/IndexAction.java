package org.example.action;

import lombok.extern.slf4j.Slf4j;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
public class IndexAction {

	@Autowired
	private UserService userService;

	@GetMapping("")
	ModelAndView index() {
		log.info("====log.info===123===");
		return new ModelAndView("index", "users", userService.findALL(1, 5));
	}

}
