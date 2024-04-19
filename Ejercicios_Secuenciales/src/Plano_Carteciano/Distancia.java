package Plano_Carteciano;

public class Distancia
{
        public static double calcularDistancia(double x1, double y1, double x2, double y2) {

            double diferenciaX = x2 - x1;
            double diferenciaY = y2 - y1;

            double distancia = Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
            return distancia;
        }
    }
