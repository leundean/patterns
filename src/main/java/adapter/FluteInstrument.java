package adapter;

public interface FluteInstrument {

    // This includes checks if cleaning, warming, and/or other tests
    // have been done and reports true if so
    boolean isFineTuned();

    // This involves moderate exhalation with effect of a tone
    void playFluteTone(String tone);

    // This involves an ordered list of tones by notes
    void playSequence(String[] sequence);
}
