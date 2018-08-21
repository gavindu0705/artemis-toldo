package com.dxy.artemis.toldo.controllers;


import com.dxy.artemis.toldo.dao.pojo.Product;
import com.dxy.artemis.toldo.batch.Hello;
import com.dxy.artemis.toldo.batch.Hello2;
import com.dxy.artemis.toldo.service.ProductService;
import com.dxy.artemis.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public void index() {
        Hello hello = new Hello();
        hello.say("xiaoyu");

        Hello2 hello2 = new Hello2();
        hello2.say2("xiaoyu22222");
    }

    @RequestMapping(value = "/list")
    public void list(ModelMap modelMap, String name) {
        DateUtil.format(new Date());
        List<Product> list = productService.findProducts();
        System.out.println(list.size());
        modelMap.addAttribute("products", list);
    }


}
