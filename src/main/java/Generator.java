import components.Drill;
import components.Tool;
import components.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("components")
public class Generator {

    @Autowired
    @Qualifier("drill2")
    private Tool tool;

    @Bean
    public Worker worker2(){
        Worker worker = new Worker();
        worker.setName("Best worker");
        worker.setTool(drill2());
        return worker;
    }

    @Bean
    public Drill drill2(){
        return new Drill();
    }
}
