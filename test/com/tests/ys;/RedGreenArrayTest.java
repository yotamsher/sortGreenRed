package com.tests;


import com.tests.ys.RedGreenArray;
import com.tests.ys.redGreenEnum;

import java.io.PrintStream;

import static com.tests.ys.redGreenEnum.green;
import static com.tests.ys.redGreenEnum.red;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RedGreenArrayTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

        @org.junit.jupiter.api.Test
        void sort() {
    //        redGreenElement elements[] = new redGreenElement[] {new redGreenElement(red), new redGreenElement(green),new redGreenElement(red), new redGreenElement(green)};
        redGreenEnum elements[] = new redGreenEnum[]{red, green, red, green, green, red};
        testSort(elements);
        }
        @org.junit.jupiter.api.Test
        void sortAllRed() {
            redGreenEnum allRed[] = new redGreenEnum[]{red, red, red};
            testSort(allRed);
        }
        @org.junit.jupiter.api.Test
        void sortAllGreen() {
            redGreenEnum allGreen[] = new redGreenEnum[]{green, green, green, green, green};
            testSort(allGreen);
        }
        @org.junit.jupiter.api.Test
        void sortAllRedOBjectsFirst() {
            redGreenEnum fullSwap[] = new redGreenEnum[]{red, red, red, green, green, green};
            testSort(fullSwap);
        }
    private static void testSort(redGreenEnum[] elements) {
        RedGreenArray redGreenArray = new RedGreenArray(elements);
        System.out.printf("\nBefore isSorted=%b\n", isSorted(redGreenArray));
        redGreenArray.print();
        redGreenArray.sort();
        System.out.printf("\nAfter isSorted=%b\n", isSorted(redGreenArray));
        redGreenArray.print();
        assertTrue(isSorted(redGreenArray));
    }

    private static boolean isSorted(RedGreenArray array) {
        int arrayLength = array.getLenghth();
        int firstRed = arrayLength;
        int greenCount = 0;
        for(int i = 0; i< arrayLength; i++){
            if(array.getAt(i).color == green)
            {
                greenCount++;
            }else if( i < firstRed ){
                firstRed = i;
            }
        }
        return firstRed == greenCount; //no need for + 1
    }


}