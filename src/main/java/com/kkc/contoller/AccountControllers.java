package com.kkc.contoller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kkc.DtoAccount.DtoAccount;

@Controller
public class AccountControllers {
//	@RequestMapping(value = "bank", method = RequestMethod.GET)
//	public ModelAndView showdata() {
//		ModelAndView mv = new ModelAndView("bank");
//		mv.addObject("kishorkc", kc);
//		return mv;

//	}

	@RequestMapping(value = "AccountFrom", method = RequestMethod.GET)
	public ModelAndView sendData() {
		DtoAccount dto = new DtoAccount();
		ModelAndView mv = new ModelAndView("AccountFrom");
		System.out.println("good job");
		mv.addObject("kkc", dto);
		return mv;

	}

	@RequestMapping(value = "Show", method = RequestMethod.POST)
	public ModelAndView savaData(DtoAccount acc) {
		ModelAndView mv = new ModelAndView("Show");
		mv.addObject("acc", acc);
		return mv;

	}

}
