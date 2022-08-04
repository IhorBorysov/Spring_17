package components;

import org.springframework.stereotype.Component;

//@Component
public class Hummer implements  Tool {
    @Override
    public void fix() {
        System.out.println("Fix from Hummer");
    }
}
