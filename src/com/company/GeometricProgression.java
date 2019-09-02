package com.company;

public class GeometricProgression extends Progression {
    protected long base;

    //  Starts at 1 with base of 2
    public GeometricProgression() { this(2,1);}

    //  Starts at 1 with base of b
    public GeometricProgression(long b) { this(b,1);}

    //  With an arbitrary base and start value
    public GeometricProgression(long b, long start){
        super(start);
        base = b;
    }

    //  Multiplies
    protected void  advance() {
        current *= base;  // Multiply current by the geometric base
    }
}
