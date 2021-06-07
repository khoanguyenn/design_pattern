package decorator_pattern;

import decorator_pattern.Window;
import decorator_pattern.component.SimpleWindow;
import decorator_pattern.decorator.HorizontalScrollBarDecorator;
import decorator_pattern.decorator.VerticalScrollBarDecorator;

public class Client {
    public static void main(String[] args) {
        Window decoratedWindow = new VerticalScrollBarDecorator(new HorizontalScrollBarDecorator(new SimpleWindow()));

        System.out.println(decoratedWindow.getDescription());
        // Simple Window including horizontal scrollbars including vertical scrollbars
    }
}
