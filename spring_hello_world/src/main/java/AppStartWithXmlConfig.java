import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStartWithXmlConfig {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
        Chinese chinese1 = (Chinese) context.getBean("chinese");
        Chinese chinese2 = (Chinese) context.getBean("chinese");
        chinese1.sayHello();
        chinese2.sayHello();
        System.out.println(chinese1);
        System.out.println(chinese2);

        System.out.println("==============================");

        Chinese chinese3 = (Chinese) context.getBean("multiChinese");
        Chinese chinese4 = (Chinese) context.getBean("multiChinese");
        System.out.println(chinese3);
        System.out.println(chinese4);

        /*
        输出：
        jeasonChan
        jeasonChan
        Chinese@6631f5ca
        Chinese@6631f5ca
        ==============================
        Chinese@27ff5d15
        Chinese@4e096385

        可见，默认情况下，同一个的id，从容器里得到的都是同一个实例对象，即，默认是单例的，
        想要多实例，需要改变属性
         */
    }
}
