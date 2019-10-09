package 后置处理器;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import 初始化和销毁回调.American;
import 初始化和销毁回调.Chinese;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfigFor后置处理器.xml");
        Chinese chinese = (Chinese) context.getBean("chinese");
        American american = (American) context.getBean("american");

        context.registerShutdownHook();

    }

}
