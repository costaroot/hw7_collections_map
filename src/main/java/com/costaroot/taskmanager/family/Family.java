package com.costaroot.taskmanager.family;

public class Family implements Comparable<Family> {
    private final String name;
    private final String title;
    private final String nameOfEmblem;
    private final int quantityMember;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public Family(String name, String title, String nameOfEmblem, int quantityMember) {
        this.name = name;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
        this.quantityMember = quantityMember;
    }

    @Override
    public int compareTo(Family family) {
        return name.compareTo(family.getName());
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                ", quantityMember=" + quantityMember +
                '}';
    }
}
