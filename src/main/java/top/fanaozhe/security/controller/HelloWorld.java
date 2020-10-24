package top.fanaozhe.security.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author faz
 * @create 2020-10-24-11:05
 */
@RestController
/*@RequestMapping("/api")*/
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }

    @RequestMapping("/admin/hello")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/user/hello")
    public String user(){
        return "user";
    }
}
