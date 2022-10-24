package org.FastTrackIt.Enums;

import java.util.Scanner;

public class EnumExercise {
    public static void main(String[] args) {
        CardinalPoints north = CardinalPoints.NORTH;
        CardinalPoints north2 = CardinalPoints.NORTH;

        System.out.println(north.getSymbol());

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        CardinalPoints fromKeyboard = CardinalPoints.valueOf(s);
        System.out.println(String.format("Your cardinal point has the symbol %s", fromKeyboard.getSymbol()));
        switch (fromKeyboard) {
            case NORTH -> System.out.println("Go Forward, by looking North");
            case EAST -> System.out.println("Go Right, by looking North");
            case WEST -> System.out.println("Go Left, by looking North");
            case SOUTH -> System.out.println("Go in opposite direction, by looking North");
        }
        System.out.println("Enter a cardinal symbol: ");
        String symbolString = scanner.nextLine();
        CardinalPoints cardinalPoints = CardinalPoints.fromSymbol(symbolString);
        System.out.println(cardinalPoints.toDirection());
    }
}
