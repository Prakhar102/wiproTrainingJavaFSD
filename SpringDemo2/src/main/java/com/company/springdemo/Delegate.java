package com.company.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delegate {
	
	private Allocator allocator;
	
//	@Autowired
	public Delegate(Allocator allocator)
	{
		this.allocator = allocator;
	}
	

	public void notifyUser() {
		// TODO Auto-generated method stub
		allocator.taskAllocation("Prakhar");
		
	}

}


/* 
 CONSTRUCTOR INJECTION
@Autowired
public Delegate(Allocator allocator)

WHAT IS @Autowired?
Means:
Spring please automatically provide dependency

Spring sees:
Delegate needs Allocator object

So Spring searches:
Who implements Allocator?

Finds:
Manager
TeamLead

Then sees:
@Primary on TeamLead.

So injects:
TeamLead object automatically.

THIS LINE
this.allocator = allocator;
stores injected object.
 */
