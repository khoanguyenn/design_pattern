package state_pattern;

public interface State {
    void tap(KeyBoardContext c, Key k);
    void hold(KeyBoardContext c, Key k);
    void unhold(KeyBoardContext c, Key k);
}
