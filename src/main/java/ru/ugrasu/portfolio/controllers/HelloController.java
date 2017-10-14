package ru.ugrasu.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
/**
 * Created by Марсель on 01.10.2017.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", produces = APPLICATION_JSON_UTF8_VALUE,
            method = GET)
    public String hello() {
        return "{\"message\":\"Hello World\"}";
    }

    @RequestMapping(value = "/hello", params = {"name"}, method = GET,
            produces = APPLICATION_JSON_UTF8_VALUE)
    public String hello(@RequestParam("name") String name) {
        return "{\"message\":\"Hello " + name + "\"}";
    }
}
