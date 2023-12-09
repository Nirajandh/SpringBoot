package com.Devtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=1057;
		int b=25422;
		int c=21;
		return "THE sum is:"+(a+b+c);
	}

}
