package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10,5));
		System.out.println(calculator.subtract(9,13));
	}

}
