package com.example.UrlHitApplication.Controller;

import com.example.UrlHitApplication.Model.Visitor;
import com.example.UrlHitApplication.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count")
public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;
    @GetMapping("/count")
    public Visitor getCount(){
        return urlHitService.getVisit();
    }
}
