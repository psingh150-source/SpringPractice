package org.example;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Laptop lp = context.getBean("laptop", Laptop.class);
        lp.compile();

        Class1 obj=context.getBean(Class1.class);
        obj.code();


    }
}


//        Class1 obj= (Class1) context.getBean("Class1");
//        obj.age= 21;
//        System.out.println(obj.age);
////        obj.code();
//
//        Class1 obj1 = (Class1) (Class1) context.getBean("Class1");
//        System.out.println(obj1.age);
////        obj1.code();

//We created a constructor which runs, is it happening bcs of line no. 11 or 12
//On line no 9, we are just not creating a container, but also specifying, that there's a file, spring.xml, go to the file
//and create all the obj's that are mentioned with the bean tag
//on line 11 and 12, we are not creating an obj, but just calling the object, by saying get bean.

//If in the spring.xml file, we have created the bean for once, that means even if we have two references, they both are the same object.