package decorator_pattern.decorator;

import decorator_pattern.Window;

public class WindowDecorator implements Window {
    private Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void draw() {
        //Delegate the draw method to the window component, decorator doesn't handle the logic, but instead delegate to window component
        windowToBeDecorated.draw();   
    }

    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription();
    }

    
}
