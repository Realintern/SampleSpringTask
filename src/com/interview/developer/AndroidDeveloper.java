package com.interview.developer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by User on 3/2/2016.
 */
@Component
//@Qualifier
public class AndroidDeveloper implements Developer {
    private String spec;
    public AndroidDeveloper(String spec){
        this.spec=spec;
    }

    @Override
    public void developerSpec() {
        System.out.println("I'm "+spec+" developer");
    }
}
