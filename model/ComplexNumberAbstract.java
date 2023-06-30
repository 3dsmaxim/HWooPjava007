package model;

public abstract class ComplexNumberAbstract {
    protected double namberX;
    protected double namberY;
    protected String action;

    public ComplexNumberAbstract(int namberX, int namberY) {
        this.namberX = namberX;
        this.namberY = namberY;

    }

    public double getNamberX() {
        return namberX;
    }

    public void setNamberX(int namberX) {
        this.namberX = namberX;
    }

    public double getNamberY() {
        return namberY;
    }

    public void setNamberY(int namberY) {
        this.namberY = namberY;
    }

}
