package com.sandy.First;

import org.springframework.stereotype.Component;

@Component
public class laptop implements  computer {
    public void compile (){
        System.out.println("Laptop");
    }
}
