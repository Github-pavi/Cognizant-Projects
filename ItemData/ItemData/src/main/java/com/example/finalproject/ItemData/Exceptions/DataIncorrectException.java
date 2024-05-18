package com.example.finalproject.ItemData.Exceptions;


public class DataIncorrectException extends RuntimeException {
	public  DataIncorrectException()
	{
		 super ("No Product Found For The Given ID");
	}
}