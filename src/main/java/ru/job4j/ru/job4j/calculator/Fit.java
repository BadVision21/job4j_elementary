package ru.job4j.ru.job4j.calculator;

public class Fit {
        public static double manWeight(short height) {
            double rsl = height * 1.15;
            return rsl;
        }

        public static double womanWeight(short heightw) {
            double rsl = heightw * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short height = 187;
            double man = Fit.manWeight(height);
            System.out.println("Man 187 is " + man);

                short heightw  = 187;
                double woman = Fit.womanWeight(heightw);
                System.out.println("woman 187 is " + woman);
        }
}
