package com.interview.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by User on 3/2/2016.
 */
@Component
//@Java
public class JavaDeveloper implements Developer {
    private String spec;
    public JavaDeveloper(String spec){
        this.spec=spec;
    }
    @Override
    public void developerSpec() {
        System.out.println("I'm "+spec +" developer");
    }
}
