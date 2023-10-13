/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3_2;

/**
 *
 * @author Eduardo, Adolfo, Mariana
 */

import java.util.Hashtable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Enumeration;

public class POOP3_2 {

    public static void main(String[] args) {
        // Impresión de encabezados
        System.out.println("####### Diccionario ######");

        // Hashtable para almacenar un diccionario de frutas
        Hashtable<Integer, String> diccio = new Hashtable<Integer, String>();
        diccio.put(1, "Manzana");
        diccio.put(2, "Uva");
        diccio.put(3, "Pera");
        diccio.put(4, "Sandía");
        diccio.put(5, "Limón");
        System.out.println("Tamaño del diccionario: " + diccio.size());

        // Recorrer y mostrar valores y claves en el diccionario
        System.out.println("*** Valores en el diccionario ***");
        for (String valor : diccio.values()) {
            System.out.println(valor);
        }
        System.out.println("*** Claves en el diccionario ***");
        for (Integer clave : diccio.keySet()) {
            System.out.println(clave);
        }
        System.out.println("*** Enumeración del diccionario ***");
        Integer clave;
        String valor;
        Enumeration<Integer> llaves = diccio.keys();
        while (llaves.hasMoreElements()) {
            clave = llaves.nextElement();
            valor = diccio.get(clave);
            System.out.println("Clave: " + clave + " Valor: " + valor);
        }

        // Impresión de otro encabezado
        System.out.println("####### Agenda ######");

        // Crear una instancia de Hashtable para la agenda de cumpleaños
        Hashtable<String, Calendar> agenda = new Hashtable<>();

        // Agregar 5 registros de cumpleaños a la agenda
        agregarRegistro(agenda, "Juan", 1990, 5, 15);
        agregarRegistro(agenda, "María", 1985, 8, 25);
        agregarRegistro(agenda, "Carlos", 1992, 2, 10);
        agregarRegistro(agenda, "Laura", 1988, 11, 30);
        agregarRegistro(agenda, "Ana", 1995, 7, 7);

        // Imprimir todos los elementos de la agenda
        for (String nombre : agenda.keySet()) {
            Calendar cumpleaños = agenda.get(nombre);
            System.out.println("Nombre: " + nombre + ", Cumpleaños: " + formatoFecha(cumpleaños));
        }
    }

    // Método para agregar un registro a la agenda
    public static void agregarRegistro(Hashtable<String, Calendar> agenda, String nombre, int año, int mes, int dia) {
        Calendar fechaCumpleaños = new GregorianCalendar(año, mes - 1, dia); // mes se ajusta en base a 0-11
        agenda.put(nombre, fechaCumpleaños);
    }

    // Método para formatear la fecha como una cadena
    public static String formatoFecha(Calendar fecha) {
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1; // Sumar 1 ya que enero es 0
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return dia + "/" + mes + "/" + año;
    }
    
}
