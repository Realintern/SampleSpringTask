package com.interview.developer;

import org.springframework.stereotype.Component;

/**
 * Created by User on 3/2/2016.
 */
@Component
public class IosDeveloper implements Developer {
    private String spec;
    public IosDeveloper(String spec){
        this.spec=spec;
    }
    @Override
    public void developerSpec() {
        System.out.println("I'm "+ spec +" developer");
    }
}
