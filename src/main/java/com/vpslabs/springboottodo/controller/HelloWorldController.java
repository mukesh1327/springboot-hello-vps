package com.vpslabs.springboottodo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    private static final String IMAGE_URL = "/images/";

    @Value("${app.title}")
    private String appTitle;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/vpsdemo/{imageName}")
    public String getImageHtml(@PathVariable String imageName) {
        String imagePath = IMAGE_URL + imageName;
        return "<html>" +
                "<head><title>Image Viewer</title></head>" +
                "<body>" +
                "<h1>" + appTitle + "</h1>" +
                "<h2>App modernization</h2>" +
                "<img src='" + imagePath + "' alt='Image' width='500'/>" +
                "</body>" +
                "</html>";
    }
}
