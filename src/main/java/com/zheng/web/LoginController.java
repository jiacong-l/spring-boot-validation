package com.zheng.web;

import com.zheng.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by zhenglian on 2016/10/15.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(Model model) {

        model.addAttribute("user", new User());

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(@Valid User user, BindingResult result, Model model) {
        model.addAttribute("user", user);

        result.rejectValue("username", "misFormat", "用户已经存在!");

        if(result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for(ObjectError error : errors) {
                System.out.println(error.getCode() + "----------" + error.getDefaultMessage());
            }

            return "login";
        }

        return "login";

    }

}
