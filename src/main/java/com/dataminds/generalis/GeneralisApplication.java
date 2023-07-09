package com.dataminds.generalis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Locale;


@SpringBootApplication
public class GeneralisApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GeneralisApplication.class, args);
//		Test test = new Test();
//		System.out.print(test.getTest());
	}

	@Controller
	public class GettingController {
		@RequestMapping(value="/greeting")
		public String requestGetting(@RequestParam(name="name", required = false, defaultValue = "Word") String name, Model model){
			model.addAttribute("name", StringUtils.toUpperCase(name, Locale.ENGLISH));
			return "greeting";
		}
	}
}

