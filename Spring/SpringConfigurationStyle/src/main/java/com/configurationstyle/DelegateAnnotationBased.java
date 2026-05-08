package com.configurationstyle;


import org.springframework.stereotype.Component;

@Component
public class DelegateAnnotationBased {

    private final Allocator allocator;

    public DelegateAnnotationBased(Allocator allocator)
    {
        super();
        this.allocator = allocator;

        System.out.println(
        "Inside Delegate Constructor - Allocator Impl: "
        + allocator.getClass().getSimpleName());
    }

    public void notifyUser()
    {
        allocator.taskAllocation("Prakhar");
    }
}