package Rectangulo;

public class main
{
        public static void main(String[] args) {
            double base = 20.0;
            double altura = 8.0;

            double area = AreaR.calcularArea(base, altura);

            System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area);
        }
    }

