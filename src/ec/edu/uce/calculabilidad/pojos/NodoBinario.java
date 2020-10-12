package ec.edu.uce.calculabilidad.pojos;

/**
 * PROYECTO: Programa de simulación de un sistema de máquina de cambio de
 * monedas
 *
 * Clase que contiene los nodos que son esenciales para mi Árbol
 * FECHA:25-11-2017
 *
 * @author: 1312960444 Michael Ponce Cevallos, 1723465066 Jairo Mena 1726581141
 * Marlon Oña
 * @version 1.0.0
 */
import ec.edu.uce.calculabilidad.clases.Gui;
import java.io.Serializable;

/**
 *
 * @author Will
 */
public class NodoBinario implements Serializable {

    public String dato;
    public String respuesta;

    public NodoBinario Hizq;
    public NodoBinario Hder;

    //Constructores
    public NodoBinario(String Elem, String resp) {

        dato = Elem;
        respuesta = resp;
        NodoBinario Hizq;
        NodoBinario Hder = null;
    }

    //Insercion de un elemento
    public void InsertaBinario(NodoBinario nodo) {

        if (nodo.respuesta.equalsIgnoreCase("no")) {

            Hizq = nodo;

        } else {
            if (nodo.respuesta.equalsIgnoreCase("si")) {

                Hder = nodo;

            }
        }

        Gui.guardarArbol();
    }
}
