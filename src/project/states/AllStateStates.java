package project.states;

public class AllStateStates {
    private static short[][] initial = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    private static short[][] end0round = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    private static short[][] end1SubBytes = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    private static short[][] end1ShiftRows = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    public static short[][] getEnd1ShiftRows() {
        return end1ShiftRows;
    }

    public static void setEnd1ShiftRows(short[][] end1ShiftRows) {
        AllStateStates.end1ShiftRows = end1ShiftRows;
    }

    public static short[][] getEnd1SubBytes() {
        return end1SubBytes;
    }

    public static void setEnd1SubBytes(short[][] end1roundSubBytes) {
        AllStateStates.end1SubBytes = end1roundSubBytes;
    }

    public static short[][] getEnd0round() {
        return end0round;
    }

    public static void setEnd0round(short[][] end0round) {
        AllStateStates.end0round = end0round;
    }

    public static short[][] getInitial() {
        return initial;
    }

    public static void setInitial(short[][] initial) {
        AllStateStates.initial = initial;
    }
}
