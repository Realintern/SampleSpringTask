package com.interview.developer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

/**
 * Created by User on 3/2/2016.
 */
public class InterviewMain {
    public static void main(String [] args)  {
       // ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/interview/developer/interview.xml");
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringInterviewCfg.class);
        Interview interview= (Interview) context.getBean(DeveloperList.class);
       // Interview interview=(Interview)applicationContext.getBean("developerlist") ;
        interview.interview();

    }
}
