package com.wildcodeschool.whereIsTheDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class WhereIsTheDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhereIsTheDoctorApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return 	  "<ul>"
				+ 	"<li><a href='/doctor/1'>William Hartnell</a></li>"
				+ 	"<li><a href='/doctor/2'>David Tennant</a></li>"
				+ 	"<li><a href='/doctor/3'>Jodie Whittaker</a></li>"
				+ 	"<li><a href='/doctor/4'>Patrick Troughton</a></li>"
				+ "</ul>";
	}
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "David Tennant";
	}
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jodie Whittaker";
	}
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Patrick Troughton";
	}
}
