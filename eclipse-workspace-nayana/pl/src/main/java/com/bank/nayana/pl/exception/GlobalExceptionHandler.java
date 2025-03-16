package com.bank.nayana.pl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
		
		@ExceptionHandler(CustomException.class)
		public ResponseEntity<?> validate(CustomException c, WebRequest wr)
		{
			return new ResponseEntity<>(c.getMessage(), HttpStatus.BAD_REQUEST);
		
	}

}
