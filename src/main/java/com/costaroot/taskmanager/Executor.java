package com.costaroot.taskmanager;

import com.costaroot.taskmanager.family.FamilyCreator;
import com.costaroot.taskmanager.family.NameOfEmblemComparator;
import com.costaroot.taskmanager.family.TitleComparator;
import com.costaroot.taskmanager.number.NumberMap;

public class Executor {
    private void printUniqueNumbers() {
        NumberMap numberMap = new NumberMap();
        System.out.println("Unique numbers");
        numberMap.uniqueValues().forEach(val -> System.out.print(val + " "));
    }

    private void familyExecutor() {
        FamilyCreator familyDefaultSort = new FamilyCreator();
        familyDefaultSort.printFamilyMap();
        FamilyCreator familyTitleComparator = new FamilyCreator(new TitleComparator(),
                "Reverse sort by Title");
        familyTitleComparator.printFamilyMap();
        FamilyCreator familyEmblemComparator = new FamilyCreator(new NameOfEmblemComparator(),
                "Sort by length of Name of Emblem");
        familyEmblemComparator.printFamilyMap();
    }

    public void run() {
        this.printUniqueNumbers();
        System.out.println("\n------Family Task --------");
        this.familyExecutor();
    }
}
