package com.poem;

public class Couplet extends Poem{
    private int lines;
    public Couplet(String name) {
        this.lines = 2;
        super(name, lines);
    }

}
