package com.costaroot.taskmanager.number;

import java.util.*;

public class NumberMap {
    private Map<Integer, Integer> numbers;

    public NumberMap() {
        numbers = new HashMap<>();
        this.inputMap();
    }

    @Override
    public String toString() {
        return "NumberMap{ " + numbers +
                " }";
    }

    private void inputMap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line numbers!");
        String line = scanner.nextLine();
        scanner.close();
        Scanner scan = new Scanner(line);
        int i;
        i = 0;
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            numbers.put(i, number);
            i++;
        }
    }

    public Set<Integer> uniqueValues() {
        Set<Integer> uniqueValues = new HashSet<>();
        for (Integer val : numbers.values()) {
            uniqueValues.add((val));
        }
        return uniqueValues;
    }
}
