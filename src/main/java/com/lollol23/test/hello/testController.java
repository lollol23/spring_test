package com.lollol23.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class testController {
	@ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World~~";
    }
}
