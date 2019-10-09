package 后置处理器;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessorExample implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("chinese".equals(beanName)) {
            System.out.println("后置处理器，初始化前处理的bean的id是：" + beanName);
        } else {
            System.out.println("后置处理器，初始化前处理的bean的id是：" + beanName);
        }

        return bean;
    }

}
