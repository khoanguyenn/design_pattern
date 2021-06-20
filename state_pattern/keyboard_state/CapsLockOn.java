package state_pattern.keyboard_state;

import state_pattern.Key;
import state_pattern.KeyBoardContext;
import state_pattern.State;

public class CapsLockOn implements State{

    @Override
    public void tap(KeyBoardContext c, Key k) {
        switch(k) {
            case CAPS_LOCK:
                c.setState(new InitialState());
                break;
            case SHIFT_KEY:
                System.out.println("Tap on shift key has no effect !");
			    break;
            default:
                System.out.println("[CAP_LOCK]: ON");
                System.out.println(k.key.toUpperCase());
        }
    }

	@Override
	public void hold(KeyBoardContext c, Key k) {
		switch (k) {		
		case SHIFT_KEY : {
			System.out.println("CAPS_LOCK: ON");
			System.out.println("Holding shift key has no effect");
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
		default: {
			System.out.println("CAPS_LOCK: ON");
			System.out.println("Unholding keys is not possible");
		}
		}

	}

}
