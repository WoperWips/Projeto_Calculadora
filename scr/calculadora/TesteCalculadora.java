package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(10, 2, "+"));
        System.out.println(calc.calcular(10, 2, "-"));
        System.out.println(calc.calcular(10, 2, "*"));
        System.out.println(calc.calcular(10, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
