public class Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(2, 3);
        Complex z2 = new Complex(2, 3);


        System.out.println(z1.abs());
        System.out.println(Complex.plus(z1, z2));
        System.out.println(z1.minus(z2));
        System.out.println(z1.multiplication(z2));
        System.out.println(z1.divides(z2));
        System.out.println(z1.re());
        System.out.println(z1.im());
        System.out.println(z1.reciprocal());
        System.out.println(z1.equals(z2));



    }
}
