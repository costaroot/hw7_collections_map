package com.costaroot.taskmanager.family;

import java.util.Comparator;

public class NameOfEmblemComparator implements Comparator<Family> {
    @Override
    public int compare(Family family, Family o) {
        if (family.getNameOfEmblem().length() == o.getNameOfEmblem().length())
            return 1;
        else
            return family.getNameOfEmblem().length() - o.getNameOfEmblem().length();
    }
}