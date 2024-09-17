package com.sandy.First;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class dekstop implements computer{
    public void compile (){
        System.out.println("In Dekstop");
    }
}
