package com.letus179.company.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author xfyin
 * @date 2019-07-16
 */
@Controller
public class TestController {

	@RequestMapping("/show")
	public String test() {
		return "test";
	}
}
