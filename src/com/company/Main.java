package com.company;

public class Main {
    public static String itog = "Можно идти гулять";
    public static String itog2 = "Оставайтесь дома";

    public static void main(String[] args) {
        System.out.println(ageAndTemperature(23, 17));
        System.out.println(ageAndTemperature(39, 33));
        System.out.println(ageAndTemperature(7, 1));
        System.out.println(ageAndTemperature(49, -11));
        System.out.println(ageAndTemperature(26, 23));


    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return generateRandomAge();
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return generateRandomAge();
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return generateRandomAge();
        } else {
            return generateRandomAge();
        }
    }

    public static String generateRandomAge() {
        int a = 10;
        int b = 23;
        int random = a + (int) (Math.random() * b);
        System.out.println(random);
        return itog;
    }

}
