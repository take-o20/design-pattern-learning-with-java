package chapter9.sample;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    Random rand = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(rand.nextInt(times));
    }
}

