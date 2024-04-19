package Figura;

public class AreaF
{
    public static double calcularArea(double radio, double altura) {

            double areaTriangulo = (radio * altura) / 2;

            double areaSemicircunferencia = (Math.PI * Math.pow(radio, 2)) / 2;

            double areaTotal = 2 * areaTriangulo + areaSemicircunferencia;
            return areaTotal;
        }
    }

