package com.dependencyinjection;

@FunctionalInterface
public interface Allocator {
	
	//This method will be implemented by manager class
	//While implementing the interface
	void taskAllocation(String user);

}
