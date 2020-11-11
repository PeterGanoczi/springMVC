package sk.it.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");

        Coach coach=context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach=context.getBean("tennisCoach", Coach.class);

        boolean result= (coach == alphaCoach);

        System.out.println("\nPointing to the same object: "+result);

        System.out.println("\nMemory location for coach: "+coach);

        System.out.println("\nMemory location for alphaCoach: "+alphaCoach);

        context.close();
    }
}
