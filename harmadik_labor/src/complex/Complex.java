package complex;

import java.util.Scanner;

/** Komplex sz�mokat reprezent�l� oszt�ly. */
public class Complex {
    /**
     * Val�s �s k�pzetes r�sz
     * */
    private double re, im;

    /** Konstruktor. Re: val�s r�sz, Im: k�pzetes r�sz */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    /** Default konstruktor, null�ra inicializ�l */
    public Complex() {
        this(0,0);
    }

    public Complex(double d){
        this.re = d;
        this.im = 0.0;
    }

    public void setRe(double re) {
        this.re = re;
    }
    public void setIm(double im) {
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    public String toString() {
        String s = "";
        if (this.im < 0){
            s += (this.re+""+this.im+"i");
        } else {
            s += (this.re+"+"+this.im+"i");
        }
        return s;
    }
    public double abs() {
        double d = Math.sqrt(re*re+im*im);
        return d;
    }
    public Complex add(Complex c) {
        Complex ret =
                new Complex(re+c.re, im+c.im);
        return ret;
    }

    public Complex mult(Complex x) {
        double re = ((this.re * x.re) - (this.im * x.im));
        double im = ((this.re * x.im) + (this.im * x.re));
        Complex res = new Complex(re,im);
        return res;
    }



    public static void main(String[] args) {

//        // 1. feladat: �rjunk programot, ami beolvas 10 komplex sz�mot, �s ki�rja a legnagyobb abszol�t �rt�kut!
//        Scanner sc = new Scanner(System.in);
//        Complex c[] = new Complex[10];
//        for (int i = 0; i < 10; i++) {
//            c[i] = new Complex(sc.nextDouble(), sc.nextDouble());
//        }
//        int max = 0;
//        for (int i = 1; i < 10; i++) {
//            if (c[max].abs() < c[i].abs()){
//                max = i;
//            }
//        }
//        System.out.println(c[max].toString());
//
//        // 2. feladat:
//        Complex c1 = new Complex(1,0), c2 = new Complex(0,2);
//        Complex c3 = c1.add(c2); // c3 = c1+c2;
//        System.out.println(c3.toString());
//
//        // 3. feladat: �rjunk programot, ami beolvas 10 komplex sz�mot, �s ki�rja az �sszeg�ket!
//        Complex act = new Complex(); // aktu�lisan beolvasott
//        Complex sum = new Complex(); // �sszeg
//
//        for (int i = 0; i < 10; i++) {
//            act.setRe(sc.nextDouble());
//            act.setIm(sc.nextDouble());
//            sum = sum.add(act); // mindig no a sum
//        }
//
//        System.out.println(sum.toString());
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,-3);
        Complex c = new Complex(3);
        Complex res = a.add(b).add(c);
        System.out.println(res.toString());

        Complex res2 = a.mult(b);
        System.out.println(res2.toString());

    }


}