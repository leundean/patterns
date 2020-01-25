package adapter;

public class HarpString implements StringInstrument {

    boolean fineTuned;

    public HarpString(){
        fineTuned = true;
    }

    @Override
    public boolean isFineTuned() {
        System.out.println("Strings tuned check");
        return fineTuned;
    }

    @Override
    public void playStringTone(String tone) {
        System.out.print(tone);
    }

    @Override
    public void playSequence(String[] sequence) {
        System.out.print("Playing harp sequence: ");
        for (String note : sequence) {
            playStringTone(note + " ");
        }
        System.out.println("");
    }
}
