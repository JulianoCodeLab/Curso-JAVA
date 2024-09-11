package entities;

public class Triagle {

    //atributos do meu triangolo
    public double a;
    public double b;
    public double c;

    //metodo para tirar área do objeto
    public double area(){
        double p = (a + b + c) / 2.0;

        return Math.sqrt (p * (p - a) * (p - b) * (p - c));
    }

}
