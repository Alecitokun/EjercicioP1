package Conagua;

public class main
{
    public static void main(String[] args) {
            double metrosCubicos = 50.0;
            double costoPorMetroCubico = 0.5;

            double pago = ConsumoAgua.calcularPago(metrosCubicos, costoPorMetroCubico);

            System.out.println("El pago por el consumo de " + metrosCubicos + " metros cúbicos de agua es: $" + pago);
        }
    }

