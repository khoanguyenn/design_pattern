package state_pattern.keyboard_state;

import state_pattern.Key;
import state_pattern.KeyBoardContext;
import state_pattern.State;

public class ShiftKeyDown implements State {

    @Override
    public void tap(KeyBoardContext c, Key k) {
		switch (k) {
            case CAPS_LOCK : {
                System.out.println("SHIFT KEY: DOWN");
                System.out.println("Tap on caps lock key has no effect");
                break;
            }
            case SHIFT_KEY : {
                System.out.println("SHIFT KEY: DOWN");
                System.out.println("Tap on shift key is not possible");
                break;
            }
            
            default : {
                System.out.println("SHIFT KEY: DOWN");
                System.out.println(k.key.toUpperCase());
            }
        }
    }

    @Override
    public void hold(KeyBoardContext c, Key k) {
		switch (k) {		
            case SHIFT_KEY : {
                System.out.println("SHIFT KEY: DOWN");
                System.out.println("Hold again on shift key is not possible");
                break;
            }
            default : {
                System.out.println("Hold on keys different from shift key has no effect");
            }
        }
    }

    @Override
    public void unhold(KeyBoardContext c, Key k) {
		switch (k) {		
            case SHIFT_KEY : {
                c.setState(new InitialState());
                break;
            }
            default : {
                System.out.println("SHIFT KEY: DOWN");
                System.out.println("Unhold a key different from shift key is not possible");
            }
        }
    }
    
}
