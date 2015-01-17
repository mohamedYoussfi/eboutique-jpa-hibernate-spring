package org.sid.eboutique.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/login")
  public String login(){
	  return "login";
  }
	@RequestMapping(value="/logout")
	  public String logout(){
		  return "login";
	  }
}
