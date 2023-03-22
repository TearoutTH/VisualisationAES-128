package project.states;

import lombok.Getter;
import lombok.Setter;

public class AllStatesCopy {
    @Getter
    @Setter
    private static short[][] end0round = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    @Getter
    @Setter
    private static short[][] end1SubBytes = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    @Getter
    @Setter
    private static short[][] end1MixColumns = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
}
