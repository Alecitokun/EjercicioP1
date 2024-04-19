package Sueldo_Semanal;

public class main
{
    public static void main(String[] args) {
            double horasTrabajadas = 40.0;
            double pagoPorHora = 10.0;


            double sueldo = Sueldo.calcularSueldo(horasTrabajadas, pagoPorHora);
            System.out.println("El sueldo semanal del trabajador es: $" + sueldo);
        }
    }

