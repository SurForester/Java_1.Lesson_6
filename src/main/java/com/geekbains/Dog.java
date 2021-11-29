package com.geekbains;

public class Dog extends Animal {
    private final int maxRun = 500; // максимум бега собаки 200 метров
    private final int maxSweem = 10; // максимум плавания собаки 10 метров

    public Dog(String name) {
        super(name);
    }

    @Override
    public String run(Integer dist) {
        if (dist > maxRun) {
            return "Собака может пробежать только " + maxRun + "метров, дистанция слишком большая (" + dist + " м.)";
        } else {
            return "Собака " + super.getName() + " пробежала " + dist + " м.";
        }
    }

    @Override
    public String sweem(Integer dist) {
        if (dist > maxSweem) {
            return "Собака может проплыть только " + maxRun + "метров, дистанция слишком большая (" + dist + " м.)";
        } else {
            return "Собака " + super.getName() + " проплыла " + dist + " м.";
        }
    }
}
