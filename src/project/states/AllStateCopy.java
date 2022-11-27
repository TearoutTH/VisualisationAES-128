package project.states;

public class AllStateCopy {
    private static short[][] end0round = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    private static short[][] end1SubBytes = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    public static short[][] getEnd1SubBytes() {
        return end1SubBytes;
    }

    public static void setEnd1SubBytes(short[][] end1SubBytes) {
        AllStateCopy.end1SubBytes = end1SubBytes;
    }

    public static short[][] getEnd0round() {
        return end0round;
    }

    public static void setEnd0round(short[][] end0round) {
        AllStateCopy.end0round = end0round;
    }
}
