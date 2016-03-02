package com.interview.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Created by User on 3/2/2016.
 */
@Configuration
public class SpringInterviewCfg {
    @Bean
    public Interview developerList(){
        DeveloperList developerList=new DeveloperList();
        developerList.setDeveloperLevel("intern");
        developerList.setDeveloper(iosDeveloper());
        return developerList;
    }
    @Bean
    public Developer javaDeveloper(){
        return new JavaDeveloper("java");
    }
    @Bean
    public Developer andriodDeveloper(){
        return new AndroidDeveloper("android");
    }
    @Bean
    public Developer iosDeveloper(){
        return new IosDeveloper("ios");
    }

}
