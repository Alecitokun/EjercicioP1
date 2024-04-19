package Estudiante;

public class PromedioC
{
    public static double calcularPromedio(double[] calificaciones) {
            double suma = 0;

            for (double calificacion : calificaciones) {
                suma += calificacion;
            }

            double promedio = suma / calificaciones.length;
            return promedio;
        }
    }


