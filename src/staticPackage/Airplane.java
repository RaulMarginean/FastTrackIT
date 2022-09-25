package org.fasttrackit.staticPackage;

public class Airplane {
    private static final double GRAVITY_COEFICIENT = 9.8;
    private double fuelleft;
    private String type;

    public Airplane(double fuelleft, String type) {
        this.fuelleft = fuelleft;
        this.type = type;
    }

    public static  double getGravityCoeficient() {
        return GRAVITY_COEFICIENT;
    }

    public double getFuelleft() {
        return fuelleft;
    }

    public String getType() {
        return type;
    }


    public void setFuelleft(double fuelleft) {
        this.fuelleft = fuelleft;
    }

    public void setType(String type) {
        this.type = type;
    }
}
