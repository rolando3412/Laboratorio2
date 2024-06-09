//import java.util.Scanner;

public class Laboratorio2 {

  public static void main(String[] args) {
    /*
     *  Un empresario quiere determinar en cuanto tiempo puede entregar sus
     * productos desde tegusigalpa a san pedro sula y desde tegusigalpa a la ceiba
     * si a fijado como regla que sus conductores manejen a una velocidad de 80km/h
     * @author User
     */

    //Declaracion de variables
    double distancia_Tegus_SanPedro = 240;
    double distancia_Tegus_Ceiba = 400;
    double velocidad = 80;
    double tiempo_SanPedro;
    double tiempo_Ceiba;

    //Calculo de tiempo
    tiempo_SanPedro = distancia_Tegus_SanPedro / velocidad;
    tiempo_Ceiba = distancia_Tegus_Ceiba / velocidad;

    //Impresion de resultados
    System.out.println(
      "El tiempo en llegar de Tegucigalpa a San Pedro Sula es de: " +
      tiempo_SanPedro +
      " horas"
    );
    System.out.println(
      "El tiempo en llegar de Tegucigalpa a La Ceiba es de: " +
      tiempo_Ceiba +
      " horas"
    );
  }
}
