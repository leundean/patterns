package adapter;



public class Main {

    // TODO: Follow example

    static void playSequenceFluteInstrumnent(FluteInstrument fluteInstrument, String[] toneSequence) {
        if (fluteInstrument.isFineTuned()) {
            fluteInstrument.playSequence(toneSequence);
        }
        else {
            System.out.println("Flute not tuned.");
        }
    }

    static void playSequenceStringInstrument(StringInstrument stringInstrument, String[] toneSequence) {
        if (stringInstrument.isFineTuned()){
            stringInstrument.playSequence(toneSequence);
        }
        else {
            System.out.println("Strings not tuned.");
        }
    }

    public static void main(String[] args) {
        String[] fluteToneSequence = new String[]{"C", "E", "G"};

        WoodFlute woodFlute = new WoodFlute();
        playSequenceFluteInstrumnent(woodFlute, fluteToneSequence);

        String[] harpToneSequence = new String[]{"C", "E", "G"};

        HarpString harpString = new HarpString();
        playSequenceStringInstrument(harpString, harpToneSequence);

        // Here the adapter class from harp to flute is created by entering the flute (adaptee)
        // to the implemented string instrument interface (client). Then the harptone sequence is
        // played with the regular string instrument methods. The adapter translates these calls
        // to flute methods.
        HarpToFluteAdapter harpToFluteAdapter = new HarpToFluteAdapter(woodFlute);
        playSequenceStringInstrument(harpToFluteAdapter, harpToneSequence);
    }
}
