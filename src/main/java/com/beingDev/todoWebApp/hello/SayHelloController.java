package com.beingDev.todoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class SayHelloController {
    //'say-hello' ==> "Hello what are you learning today ?"
    // when say-hello URL is hit it should respond with above text as a response

    //It is an annotation that binds Url request to the method
    // http://localhost:8080/say-hello
    //response body returns what exactly that is returned by the current function
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello what are you learning today ?";
    }


    // http://localhost:8080/say-hello-html
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        String sb = "<html lang=\"en\">" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<title>Title</title>" +
                "</head>" +
                "<body>" +
                "<p>My First Html with body</p>" +
                "</body>" +
                "</html>";

        return sb;
    }


    //"say-hello-jsp" ==> sayHello.jsp
    // http://localhost:8080/say-hello-jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}








