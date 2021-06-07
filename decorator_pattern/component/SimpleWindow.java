package decorator_pattern.component;

import decorator_pattern.Window;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        System.out.println("Drawing Window...");
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
    
}
