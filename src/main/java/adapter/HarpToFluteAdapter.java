package adapter;

// This implements the "input interface"
public class HarpToFluteAdapter implements StringInstrument {

    // This is the wrapped "output interface"
    private FluteInstrument fluteInstrument;

    public HarpToFluteAdapter(FluteInstrument fluteInstrument){
        this.fluteInstrument = fluteInstrument;
    }

    @Override
    public boolean isFineTuned() {
        return fluteInstrument.isFineTuned();
    }

    @Override
    public void playStringTone(String tone) {
        fluteInstrument.playFluteTone(tone);
    }

    @Override
    public void playSequence(String[] sequence) {
        System.out.print("Playing string sequence through adapter: ");
        for (String note : sequence) {
            playStringTone(note + " ");
        }
        System.out.println("");
    }
}
