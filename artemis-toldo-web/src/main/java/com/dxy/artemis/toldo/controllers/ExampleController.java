package com.dxy.artemis.toldo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @RequestMapping(value = "/list")
    public String index() {
        return "/example/list";
    }

    @RequestMapping(value = "/create")
    public String create() {
        return "/example/create";
    }
}
