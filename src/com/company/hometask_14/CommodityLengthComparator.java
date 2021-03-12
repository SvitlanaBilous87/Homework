package com.company.hometask_14;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {

        @Override
        public int compare(Commodity o1, Commodity o2) {
        return o1.getLength().compareTo(o2.getLength());
    }
    }