package edu.bsu.cs222;

public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int number) {
        StringBuilder builder = new StringBuilder("0");
        for (int i = 1; i <= number; i++)
            builder.append(" ").append(i);
        return builder.toString();
    }
}
