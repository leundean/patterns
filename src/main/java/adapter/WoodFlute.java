package adapter;

public class WoodFlute implements FluteInstrument {

    boolean fineTuned;

    public WoodFlute(){
        fineTuned = true;
    }

    @Override
    public boolean isFineTuned() {
        System.out.println("Flute tuned checked");
        return fineTuned;
    }

    @Override
    public void playFluteTone(String tone) {
        System.out.print(tone);
    }

    @Override
    public void playSequence(String[] sequence) {
        System.out.print("Playing woodflute sequence: ");
        for (String note : sequence) {
            playFluteTone(note + " ");
        }
        System.out.println("");
    }
}
