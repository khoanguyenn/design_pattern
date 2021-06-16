package design_pattern.extra.Keyboard_Example;

public class Keyboard {
    private boolean isCapslock = false;
    public void tap(Key tappedKey) {
        String inputKey = "";
        StringBuilder output = new StringBuilder("");

        switch(tappedKey) {
            case A:
                inputKey = "a";
                break;
            case B:
                inputKey = "b";
                break;
            case C:
                inputKey = "c";
                break;
            case CAPS_LOCK: 
                this.isCapslock = !this.isCapslock;
                break;
            default: 
                System.out.println("Not a key on the keyboard !");
        }

        //Check if caps-lock is on
        if (isCapslock) {
            output.append(inputKey.toUpperCase());
        } else {
            output.append(inputKey);
        }

        System.out.println(output.toString());
    }
}