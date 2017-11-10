package com.lmig.gfc.calculator.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	ArrayList<String> history = new ArrayList();

	@RequestMapping("/") // initial screen render
	public ModelAndView showApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}

	@RequestMapping("/math") // when you click the button what happens?
	public ModelAndView doMath(int firstNumber, int secondNumber, String operator) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");

		Calculator calc = new Calculator(firstNumber, secondNumber, operator); // set the variable
		calc.doMath();

		String list = calc.getString();

		mv.addObject("history", history);
		history.add(0, list);
		return mv;
	}

}
