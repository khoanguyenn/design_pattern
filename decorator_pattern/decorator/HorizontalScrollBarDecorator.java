package decorator_pattern.decorator;

import decorator_pattern.Window;

public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }
    
    @Override 
    public void draw() {
        super.draw();
        drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {
        //Draw the horizontal scroll bar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " including horizontal scrollbars";
    }
}
