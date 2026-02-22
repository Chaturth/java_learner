class Complex {

    int real;   
    int imaginary;   


    Complex(int num1, int num2) {
        real = num1;
        imaginary = num2;
    }

  
    Complex add(Complex num3) {

        int newNumber1 = this.real + num3.real;
        int newNumber2 = this.imaginary + num3.imaginary;

        return new Complex(newNumber1, newNumber2);   // ✅ corrected
    }

    public String toString() {
        return real + " + " + imaginary ;
    }

    public static void main(String[] args) {

        Complex num1 = new Complex(4, 2);
        Complex num2 = new Complex(5, 6);

        Complex sum = num1.add(num2);

        System.out.println("Complex 1: " + num1);
        System.out.println("Complex 2: " + num2);
        System.out.println("Sum: " + sum);
    }
}