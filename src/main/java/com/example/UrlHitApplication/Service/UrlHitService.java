package com.example.UrlHitApplication.Service;

import com.example.UrlHitApplication.Model.Visitor;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    static int count = 0;
    public Visitor getVisit(){
        Visitor visitor = new Visitor(++count);
        return visitor;
    }
}
