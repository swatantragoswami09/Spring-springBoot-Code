package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
   public static void main(String[] args) {

    //  Load the spring configuration file
    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from the spring cintainer
    Coach theCoach=context.getBean("myCoach",Coach.class);

    // call methods on the bean
    System.out.println(theCoach.getDailyWorkout());

   //  let's call put new method for fortune
   System.out.println("This is it : "+theCoach.getDailyFortune());
   
    // close the context
    context.close();
   }
}
