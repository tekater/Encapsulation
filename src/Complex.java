public class Complex {
    double real;
    double imaginary;
    String real1;
    String imaginary1;

    public Complex(int real, int imaginary, String real1, String imaginary1) {
        this.real = real;
        this.imaginary = imaginary;
        this.real1 = real1;
        this.imaginary1 = imaginary1;
    }
    public double Sum2() {
        return (this.real + this.imaginary + Integer.parseInt(real1) + Integer.parseInt(imaginary1)) * 2;
    }
}
