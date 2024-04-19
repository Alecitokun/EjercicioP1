package Productor_Leche;

public class main
{
    public static void main(String[] args) {

            double cantidadLitros = 100.0;
            double precioPorGalon = 4.0;

            double pago = Pago.calcularPago(cantidadLitros, precioPorGalon);

            System.out.println("El pago por la entrega de " + cantidadLitros + " litros de leche es: $" + pago);
        }
    }

