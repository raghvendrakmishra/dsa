package org.practice.dsa.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateStringToNumberTest {

    @Test
    void nameToNumber() {
        assertEquals(1, calculate("a"));
        assertEquals(8, calculate("z"));
        assertEquals(10, calculate("abcd"));

        assertEquals(46, calculate("iamraghum"));
        assertEquals(45, calculate("imdeepakm"));
        assertEquals(104, calculate("raghvendra kumar mishra"));
        assertEquals(86, calculate("raghavendra mishra"));
        assertEquals(56, calculate("deepak mishra"));
        assertEquals(24, calculate("deepak"));
        assertEquals(79, calculate("rashmi tripathi"));
        assertEquals(64, calculate("rashmi mishra"));
        assertEquals(73, calculate("rashmi r mishra"));
        assertEquals(118, calculate("rashmi raghavendra mishra"));
        assertEquals(56, calculate("Akshita mishra"));
        assertEquals(61, calculate("Yashika mishra"));
        assertEquals(32, calculate("rashmi"));
        assertEquals(32, calculate("mishra"));

        assertEquals(54, calculate("raghavendra"));
        assertEquals(53, calculate("raghvendra"));
        assertEquals(58, calculate("raghavender"));

        assertEquals(68, calculate("rohit k mishra"));
        //assertEquals(68, calculate("rohiteshwar mishra"));
        assertEquals(53, calculate("rohit kumar"));

        assertEquals(24, calculate("rahul"));
        assertEquals(56, calculate("rahul mishra"));
        assertEquals(18, calculate("anil"));

        assertEquals(19, calculate("ankit"));
        assertEquals(51, calculate("ankit mishra"));

        assertEquals(37, calculate("Arviend"));
        assertEquals(45, calculate("Arviend Sud"));




        assertEquals(62, calculate("narendra modi"));
        assertEquals(39, calculate("narendra"));
        assertEquals(95, calculate("sanddeep bajaj"));
    }

    private int calculate(String name) {
        int result = 0;
        for(char ch : name.toCharArray()) {
            result += charToInt(ch);
        }
        return result;
    }

    // चाल्डियन अंक ज्योतिष चार्ट

    /**
     * 1    2   3   4   5   6   7   8   9
     * A    B   C   D   E   F   G   H   I
     * J    K   L   M   N   O   P   Q   R
     * S    T   U   V   W   X   Y   Z
     *
     *
     */
    private int charToInt(char ch) {
        switch (ch) {
            case 'a':
            case 'A':
            case 'j':
            case 'J':
            case 's':
            case 'S':
                return 1;
            case 'b':
            case 'B':
            case 'k':
            case 'K':
            case 't':
            case 'T':
                return 2;
            case 'c':
            case 'C':
            case 'l':
            case 'L':
            case 'u':
            case 'U':
                return 3;
            case 'd':
            case 'D':
            case 'm':
            case 'M':
            case 'v':
            case 'V':
                return 4;
            case 'e':
            case 'E':
            case 'n':
            case 'N':
            case 'w':
            case 'W':
                return 5;
            case 'f':
            case 'F':
            case 'o':
            case 'O':
            case 'x':
            case 'X':
                return 6;
            case 'g':
            case 'G':
            case 'p':
            case 'P':
            case 'y':
            case 'Y':
                return 7;
            case 'h':
            case 'H':
            case 'q':
            case 'Q':
            case 'z':
            case 'Z':
                return 8;
            case 'i':
            case 'I':
            case 'r':
            case 'R':
                return 9;
            default:
                return 0;
        }
    }
}
