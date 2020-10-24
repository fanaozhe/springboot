package top.fanaozhe.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import top.fanaozhe.security.entity.User;
import top.fanaozhe.security.service.impl.UserService;

/**
 * @author faz
 * @create 2020-10-24-15:02
 */
public class SecurityController {
    @Autowired
    UserService userService;
    @RequestMapping("/security")
    public UserDetails security(){
        UserDetails userDetails = userService.loadUserByUsername("root");
        return userDetails;
    }
}
