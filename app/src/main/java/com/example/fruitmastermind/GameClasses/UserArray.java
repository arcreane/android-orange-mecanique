package com.example.fruitmastermind.GameClasses;

public class UserArray  {
    Fruit a;
    Fruit b;
    Fruit c;
    Fruit d;

    public Fruit[] UserArray(Fruit a, Fruit b, Fruit c, Fruit d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        return new Fruit[]{a,b,c,d};
    }
}
