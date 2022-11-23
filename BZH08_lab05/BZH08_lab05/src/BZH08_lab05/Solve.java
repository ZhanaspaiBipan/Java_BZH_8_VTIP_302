package BZH08_lab05;

import java.io.Serializable;
import static java.lang.Math.pow;

public class Solve implements Serializable {
    private static final long serialVersionUID = 1L;

    private double x;
    private double a;
    private double b;
    private double y;

    public Solve(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        if (x >= 6) {
                    y = 4 *( Math.pow(a,2) + 2*x + Math.pow(b, 2))/(a*b);
                } else {
                    y = Math.pow(x,3)* Math.pow(a-b,2);
        }
    }

    public double getX() {
        return x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getY() {
        return y;
    }
    
    

    @Override
    public String toString() {
        return String.format("Ответ = " + y);
    }

}
