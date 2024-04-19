package Constructora;

public class AreaT
{
    public static double calcularArea(double base, double altura, double ancho) {

            double areaTrianguloSuperior = (base * altura) / 2;

            double areaTrapecioInferior = ((base + ancho) * altura) / 2;

            double areaTotal = areaTrianguloSuperior + areaTrapecioInferior;
            return areaTotal;
        }
    }

