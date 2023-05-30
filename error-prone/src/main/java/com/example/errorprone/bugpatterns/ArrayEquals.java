package com.example.errorprone.bugpatterns;

public class ArrayEquals {

    /**
     * ArrayEquals bug pattern
     * <br>
     * <br>
     * Generally when comparing arrays for equality, the programmer intends to check that the contents of the arrays are equal rather than that they are actually the same object.
     * But many commonly used equals methods compare arrays for reference equality rather than content equality.
     **/

    public boolean compare(String firstList[], String secondList[]) {
        return firstList.equals(secondList);
    }

}
