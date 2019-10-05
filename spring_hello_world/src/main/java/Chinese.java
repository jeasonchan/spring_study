import lombok.Getter;
import lombok.Setter;

public class Chinese implements Person {
    @Getter
    @Setter
    private String name;

    @Override
    public void sayHello() {
        System.out.println(this.name);
    }
}
