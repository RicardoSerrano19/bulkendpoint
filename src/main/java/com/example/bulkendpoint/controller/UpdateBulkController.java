package com.example.bulkendpoint.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateBulkController {

    @PostMapping(path = "/updateProductListener")
    public String UpdateProductListener(@RequestBody String string){
        return string;
    }
}
