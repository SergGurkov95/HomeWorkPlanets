package Utils;

import java.util.Scanner;

public class PlanetScanner {
    static String[] planetList = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};

    Scanner scanner = new Scanner(System.in);

    public void output() {
        for (int i = 0; i < planetList.length; i++) {
            System.out.print(planetList[i] + " ");
        }
        System.out.println("\nДля какой планеты расчитать ускорение свободного падения? ");
    }

    public int input() {
        int i;
        String inputString = scanner.nextLine();
        for (i = 0; i < planetList.length; i++) {
            if (planetList[i].equals(inputString)) {
                return i;
            }
        }
        System.out.println("Такой планеты нет в солнечной системе");

        return -1;
    }
}
