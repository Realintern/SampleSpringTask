package com.interview.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by User on 3/2/2016.
 */
@Component
public class DeveloperList implements Interview {
    private String developerLevel;
    public DeveloperList(){}
    public void setDeveloperLevel(String developerLevel){
        this.developerLevel=developerLevel;
    }

    public String getDeveloperType() {
        return developerLevel;
    }
   // @Autowired
   // @Java
    private Developer developer;
   // @Autowired
    //@Qualifier
    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void interview() {
        System.out.println("Interview with "+developerLevel + " developer");
        developer.developerSpec();
    }
}
