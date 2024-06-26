package com.kindsonthegenius.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/index2")
	public String widget() {
		return "index2";
	}

	@GetMapping("/layout")
	public String layout() {
		return "layout";
	}

	@GetMapping("/hr")
	public String hr() {
		return "/hr/index";
	}

	@GetMapping("/fleet")
	public String fleet() {
		return "/fleet/index";
	}

	@GetMapping("/helpdesk")
	public String helpdesk() {
		return "/helpdesk/index";
	}

	@GetMapping("/accounts")
	public String accounts() {
		return "/accounts/index";
	}

	@GetMapping("/payroll")
	public String payroll() {
		return "/payroll/index";
	}

	@GetMapping("/parameters")
	public String parameters() {
		return "/parameters/index";
	}
}
