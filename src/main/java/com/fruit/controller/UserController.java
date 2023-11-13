package com.fruit.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController extends BaseController {

  @RequestMapping("/user/toLogin.action")
  public String toLogin() {
    return "/login.jsp";
  }

  @RequestMapping("/user/toHome.action")
  public String toHome() {
    return "/home.jsp";
  }

  @RequestMapping("/user/login.action")
  public String login(Model model, HttpServletRequest request, String username, String password) {
    if (username.equals("admin") && password.equals("123456")) {
      request.getSession().setAttribute("user", username);
      return "/home.jsp";
    }
    model.addAttribute("errorMsg", "用户名或密码错误，请重新输入！");
    return "/login.jsp";
  }

}
