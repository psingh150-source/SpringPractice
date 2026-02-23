package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Class1 obj= (Class1) context.getBean("Class1");
        obj.code();
    }
}
//We created a constructor which runs, is it happening bcs of line no. 11 or 12
//On line no 9, we are just not creating a container, but also specifying, that there's a file, spring.xml, go to the file
//and create all the obj's that are mentioned with the bean tag
//on line 11 and 12, we are not creating an obj, but just calling the object, by saying get bean.