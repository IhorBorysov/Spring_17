package components;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Component
public class Worker {
    private String name = "default";
    private Tool tool;

    public Worker() {
//        System.out.println("Worker constructor");
    }

    public void doWork(){
        this.tool.fix();
    }

}
