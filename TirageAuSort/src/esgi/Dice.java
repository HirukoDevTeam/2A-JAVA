package esgi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private static final int MAX_FACE_VALUE=6;

    int roll(){
        Random random = new Random();
        return random.nextInt(MAX_FACE_VALUE) + 1;
    }
}
