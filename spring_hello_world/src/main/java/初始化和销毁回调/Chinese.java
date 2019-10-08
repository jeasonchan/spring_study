package 初始化和销毁回调;

public class Chinese {
    public void sayHello(){
        System.out.println("I am Chinese!");
    }

    public void init(){
        System.out.println("Chinese 初始化回调函数");
    }

    public void destroy(){
        System.out.println("Chinese 销毁回调函数");
    }
}
