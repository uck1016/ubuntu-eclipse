package com.onlineMediCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
@Controller
public class DefaultController {
 
@RequestMapping("/welcome")
public ModelAndView helloWorld() {
 
String message = "<br><div align='center'>"
+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from CrunchifyHelloWorld.java **********<br><br>";
return new ModelAndView("welcome", "message", message);
}
@RequestMapping("/login")
public ModelAndView login() {
 
String message = "<br><div align='center'>"
+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from CrunchifyHelloWorld.java **********<br><br>";
return new ModelAndView("login", "message", message);
}
}