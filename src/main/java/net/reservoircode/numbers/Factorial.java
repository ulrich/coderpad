package net.reservoircode.numbers;

public class Factorial {

    public int calculate(int element) {
        return (element == 0) ? 1 : element * calculate(element - 1);
    }
}
