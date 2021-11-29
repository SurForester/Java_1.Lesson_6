package com.geekbains;

public class Cat extends Animal {
    private final int maxRun = 200; //максимум бега кота 200 метров

    public Cat(String name) {
        super(name);
    }

    @Override
    public String run(Integer dist) {
        if (dist > maxRun) {
            return "Кошка может пробежать только " + maxRun + "метров, дистанция слишком большая (" + dist + " м.)";
        } else {
            return "Кошка " + super.getName() + " пробежала " + dist + " м.";
        }
    }

    @Override
    public String sweem(Integer dist) {
        return "Кошка не умеет плавать.";
    }
}
