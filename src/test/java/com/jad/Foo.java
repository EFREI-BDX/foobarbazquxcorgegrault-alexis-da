package com.jad;

import java.util.ArrayList;

public class Foo {

    private Bar bar;

    public Bar getBar() {
        return this.bar;
    }


    public ArrayList<Baz> getBazs() {
        return this.bazs;
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

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault(Grault grault) {
        this.graults.add(grault);
    }


}