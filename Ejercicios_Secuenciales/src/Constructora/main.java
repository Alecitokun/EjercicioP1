package Constructora;

public class main
{
    public static void main(String[] args) {

            double base = 10.0;
            double altura = 5.0;
            double ancho = 6.0;

            double area = AreaT.calcularArea(base, altura, ancho);

            System.out.println("El área del terreno en forma de A es: " + area);
        }
    }

