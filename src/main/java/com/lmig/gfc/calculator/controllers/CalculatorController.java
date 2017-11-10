package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {
	
	private Calculator calc;
	
	@RequestMapping("/")
	public ModelAndView showApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}


	@RequestMapping("/math")
	public ModelAndView doMath(int firstNumber, int secondNumber, String operator) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		Calculator input = new Calculator(firstNumber, secondNumber, operator);
		
		return mv;
	}
	
	

	

}
