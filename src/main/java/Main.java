import components.Drill;
import components.Hummer;
import components.Worker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(Worker.class, Hummer.class, Drill.class, Generator.class);
//        context.refresh();
//
//        Worker worker = context.getBean("worker",Worker.class);
//        Hummer hummer = context.getBean(Hummer.class);
//
//        worker.setTool(hummer);
//        System.out.println(worker);
//
//        Worker worker2 = context.getBean("worker2", Worker.class);
//
//        System.out.println(worker2);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.refresh();

        Worker worker = context.getBean("worker", Worker.class);
        
        System.out.println(worker);
    }
}
