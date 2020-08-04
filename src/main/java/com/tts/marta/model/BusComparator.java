package com.tts.marta.model;

import java.util.Comparator;

public class BusComparator implements Comparator<Bus> {

    public int compare(Bus o1, Bus o2) {
        if (o1.distance < o2.distance)
            return -1;
        if (o1.distance > o2.distance)
            return 1;
        return 0;
    }

}