package com.tianyp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author typ
 *
 */
@RestController
public class DemoController {
    
    @Value("${size}")
    private int size;
        
    @RequestMapping(value="/holle",method = RequestMethod.GET)
    public String say(){
        System.out.println("123");
        return "holle  word"+size;
    }
}
