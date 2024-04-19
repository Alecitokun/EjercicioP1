package Plano_Carteciano;

public class main
{
    public static void main(String[] args) {

            double x1 = 3.0;
            double y1 = 4.0;
            double x2 = 7.0;
            double y2 = 1.0;

            double distancia = Distancia.calcularDistancia(x1, y1, x2, y2);

            System.out.println("La distancia entre los puntos P1(" + x1 + ", " + y1 + ") y P2(" + x2 + ", " + y2 + ") es: " + distancia);
        }
    }

