package com.dreamchain.skeleton.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dreamchain.skeleton.service.LoginBeanService;

@Controller
@RequestMapping(LoginBeanController.URL)
public class LoginBeanController {
	static final String URL = "/login";
	
	@Autowired
	LoginBeanService loginBeanService;
	
	@RequestMapping(method = RequestMethod.GET)
	public void get(Model model, @ModelAttribute LoginBeanCommand loginBeanCommand) {
		model.addAttribute("userGrid", loginBeanCommand);
	}
	@RequestMapping(method = RequestMethod.POST)
	public String post(Model model, @Valid LoginBeanCommand loginBeanCommand, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("userGrid", loginBeanService.findByUsername(loginBeanCommand.getUserName()));
			return URL;
		}
		PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
		loginBeanCommand.setPassword(passwordEncoder.encode(loginBeanCommand.getPassword()));
		String pwd = loginBeanCommand.getPassword();
		if(loginBeanCommand.getUserName() == null || loginBeanCommand.getUserName().length() == 0){
			result.reject("Please Enter User Name");
		}else if(loginBeanCommand.getPassword() == null || loginBeanCommand.getPassword().length() == 0){
			result.reject("Please Enter password");
		}else if( pwd != loginBeanCommand.getPassword()){
			result.reject("Wrong Password,Please try again");
		}
		
		return "redirect:" + "/view/success.jsp";
	}
}
