package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public Laptop()
    {
        System.out.println("Laptop called");
    }
    public void compile()
    {
        System.out.println("Compile from Laptop");
    }
}

