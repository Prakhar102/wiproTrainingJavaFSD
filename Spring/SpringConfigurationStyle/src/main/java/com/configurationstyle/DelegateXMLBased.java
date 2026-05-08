package com.configurationstyle;


public class DelegateXMLBased {
	
	private final Allocator allocator;
	
	public  DelegateXMLBased(Allocator allocator)
	{
		super();
		this.allocator = allocator;
		
		System.out.println("Inside Delegate Constructor - Allocator Impl: " + allocator.getClass().getSimpleName());
	};
	
	public void notifyUser()
	{
		allocator.taskAllocation("Prakhar");
	}


}
