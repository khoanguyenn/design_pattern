package state_pattern;

public enum Key {
    A("a"), B("b"), C("c"), D("d"), E("e"), F("f"), CAPS_LOCK("CAP_LOCK"), SHIFT_KEY("SHIFT");
    public String key;
    private Key(String key) {
        this.key = key;
    };
}
