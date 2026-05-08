package com.company.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class Manager implements Allocator{

	@Override
	public void taskAllocation(String user) {
		// TODO Auto-generated method stub
		
		System.out.println("The task is allocated by Manager to " + user);
		
	}

}
