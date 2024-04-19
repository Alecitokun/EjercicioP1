package Productor_Leche;

public class Pago
{
    public static double calcularPago(double cantidadLitros, double precioPorGalon) {

            double cantidadGalones = cantidadLitros / 3.785;

            double pago = cantidadGalones * precioPorGalon;
            return pago;
        }
    }


