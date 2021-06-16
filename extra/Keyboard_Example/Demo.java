package design_pattern.extra.Keyboard_Example;

public class Demo {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.tap(Key.A);
        keyboard.tap(Key.CAPS_LOCK);
        keyboard.tap(Key.A);
        keyboard.tap(Key.B);
        keyboard.tap(Key.CAPS_LOCK);
        keyboard.tap(Key.B);
        keyboard.tap(Key.C);
    }
}
