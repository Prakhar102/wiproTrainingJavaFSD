package com.configurationstyle;

import org.springframework.stereotype.Service;

//@Service
class Manager implements Allocator {
	
	Manager()
	{
		System.out.println("Manager Bean(object) created");
	}
	
	
	public void taskAllocation(String user)
	{
		System.out.println("Task is allocated by : Manager to " + user);
	}

}

