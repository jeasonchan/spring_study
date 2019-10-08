package 初始化和销毁回调;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.swing.*;

public class American implements InitializingBean, DisposableBean {
    public void sayHello(){
        System.out.println("I am American!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("American 销毁回调函数");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("American 初始化回调函数");
    }
}
