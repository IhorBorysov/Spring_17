package components;

import org.springframework.stereotype.Component;

@Component
public class Drill implements Tool {
    @Override
    public void fix() {
        System.out.println("Fix from drill");
    }
}
