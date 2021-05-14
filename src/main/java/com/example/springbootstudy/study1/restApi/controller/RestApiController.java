package com.example.springbootstudy.study1.restApi.controller;

import com.example.springbootstudy.study1.restApi.dao.RestApiDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping(value = "/student")
    public RestApiDao getApi(@RequestParam(value = "no", defaultValue = "1") int no,
                             @RequestParam(value = "name", defaultValue = "hiyoon") String name)
    {
        return new RestApiDao(no, name);
    }
}
