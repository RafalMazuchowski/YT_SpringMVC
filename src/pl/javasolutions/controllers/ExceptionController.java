package pl.javasolutions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class ExceptionController {
	/*
	@RequestMapping(value="/runtimeException")
	public String runtimeException() {
		
		throw new RuntimeException();
	}

	@ExceptionHandler(RuntimeException.class)
	public String handleException(RuntimeException e) {
		
		e.getMessage();
		
		return "handleException";
	}*/
	
	@ExceptionHandler(Exception.class)
	public String exception(Exception e) {
		
		return "handleException";
	}

}
