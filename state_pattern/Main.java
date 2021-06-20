package state_pattern;

public class Main {
    public static void main(String[] args) {
        KeyBoardContext keyBoardContext = new KeyBoardContext();
        keyBoardContext.tap(Key.A);
        keyBoardContext.tap(Key.CAPS_LOCK);
        keyBoardContext.tap(Key.A);
        keyBoardContext.tap(Key.CAPS_LOCK);
        keyBoardContext.tap(Key.B);
        keyBoardContext.hold(Key.SHIFT_KEY);
        keyBoardContext.tap(Key.C);
        keyBoardContext.unhold(Key.SHIFT_KEY);
        keyBoardContext.tap(Key.C);
    }
}
