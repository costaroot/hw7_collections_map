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
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            numbers.put(number, number);
        }
        scan.close();
    }

    public Set<Integer> uniqueValues() {
        return new HashSet<>(numbers.values());
    }
}
