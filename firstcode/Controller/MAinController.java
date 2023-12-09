package com.example.Sts.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MAinController {

	@RequestMapping("/test")
	public String Home() {
		return "this is home page";
	}
}
