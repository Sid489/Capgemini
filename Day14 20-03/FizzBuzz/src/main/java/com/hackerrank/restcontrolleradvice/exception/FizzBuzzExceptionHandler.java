package com.hackerrank.restcontrolleradvice.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hackerrank.restcontrolleradvice.dto.BuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzException;
import com.hackerrank.restcontrolleradvice.dto.GlobalError;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

  //TODO:: implement handler methods for FizzException, BuzzException and FizzBuzzException
	@ResponseBody
	@ExceptionHandler(FizzException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public GlobalError handleException(FizzException e,HttpServletRequest request) {
		return new GlobalError(e.getMessage(),e.getErrorReason());
		
	}
	@ResponseBody
	@ExceptionHandler(FizzBuzzException.class)
	@ResponseStatus(value=HttpStatus.INSUFFICIENT_STORAGE)
	public GlobalError handleException1(FizzBuzzException e,HttpServletRequest request) {
		return new GlobalError(e.getMessage(),e.getErrorReason());
	}
	@ResponseBody
	@ExceptionHandler(BuzzException.class)
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	public GlobalError handleException2(BuzzException e,HttpServletRequest request) {
		return new GlobalError(e.getMessage(),e.getErrorReason());
	}
}
