package com.geekbains;

public abstract class Animal {

    protected String name;

    public Animal() {

    }

    public Animal(String animName) {
        this.name = animName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String run(Integer dist);

    public abstract String sweem(Integer dist);

}
