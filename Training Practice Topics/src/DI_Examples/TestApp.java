package DI_Examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

    public static void main(String[] args){
        ApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student1 stu=(Student1)c.getBean("studentBean");
        stu.Display();

        //Employee1 emp=(Employee1) c.getBean("studentBean");
        //emp.Display();
    }
}
