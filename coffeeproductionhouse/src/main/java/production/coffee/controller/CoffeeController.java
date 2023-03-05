package production.coffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import production.coffee.entity.Coffee;

@RestController
public class CoffeeController {
	private List<Coffee> coffees = new ArrayList<>();
	
	//Adding coffee to the list
	public CoffeeController()
    {
		coffees.addAll(List.of(new Coffee("Mocha", 100.00), new Coffee("Cappuccino", 200.00), new Coffee("Americano", 300.00),
				new Coffee("Decaf", 400.00), new Coffee("Coffea Arabica", 500.00)
		));
	}
	
	//To display all the coffee in the list
	@RequestMapping(value = "/coffee", method = RequestMethod.GET)
	Iterable<Coffee> getAllLeds() 
	{
		return coffees;
	}
}
