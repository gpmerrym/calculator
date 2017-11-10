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
		Calculator calc; // declare the variable
		calc = new Calculator(firstNumber, secondNumber, operator); // set the variable
		mv.addObject("result", calc.doMath()); // object to the view.. value returned from doMath() method..
		mv.addObject("firstNumber", firstNumber);
		mv.addObject("secondNumber", secondNumber);
		mv.addObject("operator", operator);
		return mv;
	}

}
