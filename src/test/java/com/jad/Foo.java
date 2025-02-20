package com.jad;

import java.util.ArrayList;

public class Foo {

    private Bar bar;

    public Bar getBar() {
        return this.bar;
    }

    private Baz baz;

    public Baz getBaz() {
        return this.baz;
    }

    private ArrayList<Baz> bazs;

    private Qux qux;

    public Qux getQux() {
        return this.qux;
    }

    private Corge corge;

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    private ArrayList<Grault> graults;

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }


}