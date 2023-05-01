package com.tests.ys;

import java.util.concurrent.ThreadLocalRandom;

import static com.tests.ys.redGreenEnum.green;
import static com.tests.ys.redGreenEnum.red;

public class redGreenElement {
    public final redGreenEnum color;
    public final int initialIndex;
    public redGreenElement(redGreenEnum color, int initialIndex){
        this.color = color;
        this.initialIndex = initialIndex;
    }

    public redGreenElement(int initialIndex){
        this.initialIndex = initialIndex;
        int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
        System.out.println(randomNum);
        if(randomNum > 0) {
            this.color = green;
        }else {
            this.color = red;
        }
    }

    @Override
    public String toString() {
        return String.format("%d: %s", initialIndex, color.toString());
    }
}
