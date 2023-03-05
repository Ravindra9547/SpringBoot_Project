package calc.operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calc.operation.entity.Logic;

@RestController
public class SubstractionController {

	//this method is responsible for substract two numbers 
	@GetMapping("/substract")
	public String substraction(@RequestParam(value = "num1",required = true,defaultValue = "1")double num1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )double num2)
	{
		return "<h1>The substraction is "+ Logic.sub(num1, num2)+"</h1>";
	}	
}
