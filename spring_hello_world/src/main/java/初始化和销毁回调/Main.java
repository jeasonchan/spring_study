package 初始化和销毁回调;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfig2.xml");
        Chinese chinese = (Chinese) context.getBean("chinese");
        American american = (American) context.getBean("american");

        context.registerShutdownHook();
    }
}
