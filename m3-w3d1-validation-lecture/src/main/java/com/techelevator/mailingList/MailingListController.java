package com.techelevator.mailingList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mailingList")
public class MailingListController {
	
	@RequestMapping(path={"/","/mailingListInput"}, method=RequestMethod.GET)
	public String showMailingListForm(Model modelHolder) {
		return "mailingList/mailingListInput";
	}
	
	@RequestMapping(path="/mailingListInput", method=RequestMethod.POST)
	public String handleMailingListForm(@Valid SignUp signup,
										ModelMap model) {
		
		model.put("signup", signup);
		
		return "redirect:/mailingList/mailingListResult";
	}
	
	@RequestMapping(path="/mailingListResult", method=RequestMethod.GET)
	public String showThankYou() {
		return "mailingList/mailingListResult";
	}

}
