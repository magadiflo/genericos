package org.magadiflo.app;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

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
