package com.tcs.opi.app.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class UIController {
  @RequestMapping
  public String test() {
    return "/WEB-INF/test.jsp";
  }
}