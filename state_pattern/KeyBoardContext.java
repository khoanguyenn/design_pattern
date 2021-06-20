package state_pattern;

import state_pattern.keyboard_state.InitialState;

public class KeyBoardContext {
    private State currentState;

    public KeyBoardContext() {
        currentState = new InitialState();
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public void tap(Key key) {
        this.currentState.tap(this, key);
    }

    public void hold(Key key) {
        this.currentState.hold(this, key);
    }

    public void unhold(Key key) {
        this.currentState.unhold(this, key);
    }
}
