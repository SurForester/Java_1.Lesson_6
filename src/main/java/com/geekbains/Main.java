package com.geekbains;

public class Main {
    public static void main(String[] args) {
        Cat catBasya = new Cat("Бася");
        Cat catMasha = new Cat("Маша");
        Dog dogNeo = new Dog("Нэо");
        Cat catMuha = new Cat("Муха");
        System.out.println(catBasya.run(100));
        System.out.println(catMasha.run(300));
        System.out.println(catBasya.sweem(50));
        System.out.println(dogNeo.run(50));
        System.out.println(dogNeo.sweem(5));
        Animal[] animals = new Animal[4];
        animals[0] = catBasya;
        animals[1] = catMasha;
        animals[2] = dogNeo;
        animals[3] = catMuha;
        int intAnimals = 0;
        int intCats = 0;
        int intDogs = 0;
        for (int i = 0; i < animals.length; i++) {
            intAnimals++;
            if (animals[i] instanceof Cat) {
                intCats++;
            }
            if (animals[i] instanceof Dog) {
                intDogs++;
            }
        }
        System.out.println("Итого:");
        System.out.println("Животных = " + intAnimals);
        System.out.println("Кошек = " + intCats);
        System.out.println("Собак = " + intDogs);
    }
}
