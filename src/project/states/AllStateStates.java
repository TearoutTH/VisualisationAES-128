package project.states;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class AllStateStates {
    @Getter
    @Setter
    private static short[][] initial = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    @Getter
    @Setter
    private static short[][] end0round = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    @Getter
    @Setter
    private static short[][] end1SubBytes = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    @Getter
    @Setter
    private static short[][] end1ShiftRows = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    @Getter
    @Setter
    private static short[][] end1MixColumns = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
}
