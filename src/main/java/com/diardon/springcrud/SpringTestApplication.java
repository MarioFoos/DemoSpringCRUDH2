package com.diardon.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@SuppressWarnings("unused")
public class SpringTestApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringTestApplication.class, args);
	}
}
