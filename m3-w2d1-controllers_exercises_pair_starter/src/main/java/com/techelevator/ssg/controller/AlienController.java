package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {

	@RequestMapping("/alienWeightInput")
	public String alienWeightInput()
	{
		return "alienWeightInput";
	}
	
	@RequestMapping("/alienWeightResult")
	public String alienWeightResult(HttpServletRequest request)
	{
		int yourWeight = Integer.parseInt(request.getParameter("yourWeight"));
		int planet = Integer.parseInt(request.getParameter("planet"));
		
		int alienWeight = AlienWeightCalculator.calculateAlienWeight(planet, yourWeight);
		request.setAttribute("alienWeight", alienWeight);
		
		return "alienWeightResult";
	}
}
