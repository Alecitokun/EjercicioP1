package Conagua;

public class ConsumoAgua
{
    public static double calcularPago(double metrosCubicos, double costoPorMetroCubico) {
            double pago = metrosCubicos * costoPorMetroCubico;
            return pago;
        }
    }


