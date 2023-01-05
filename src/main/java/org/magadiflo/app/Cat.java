package org.magadiflo.app;

public class Cat extends Animal {

    private String litterPreference;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getLitterPreference() {
        return this.litterPreference;
    }

}
