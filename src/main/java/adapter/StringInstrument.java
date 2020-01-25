package adapter;

public interface StringInstrument {

    // This includes checks if cleaning, warming, and/or other tests
    // have been done and reports true if so
    boolean isFineTuned();

    // This involves pulling string with vibrating tone
    void playStringTone(String tone);

    // This involves an ordered list of tones by notes
    void playSequence(String[] sequence);

}
