package com.techelevator.squirrelparty;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/squirrelParty")
public class SquirrelPartyController {

	@RequestMapping("/cigarPartyInput")
	public String showInputPage() {
		return "squirrelParty/cigarPartyInput";
	}
	
	@RequestMapping("/cigarPartyResult")
	public String showResultPage(@Valid SquirrelParty party,
							     ModelMap model) {
		
		model.put("party", party);
		return "squirrelParty/cigarPartyResult";
	}
}
