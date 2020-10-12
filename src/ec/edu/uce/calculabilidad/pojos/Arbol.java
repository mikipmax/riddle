package ec.edu.uce.calculabilidad.pojos;

/**
 * PROYECTO: Programa de simulación de un sistema de máquina de cambio de
 * monedas
 *
 * Clase que contiene a mi Árbol con todos sus atributos FECHA:25-11-2017
 * @author: 1312960444 Michael Ponce Cevallos, 1723465066 Jairo Mena 1726581141
 * Marlon Oña
 * @version 1.0.0
 */
import ec.edu.uce.calculabilidad.clases.ArbolExpresionGrafico;
import java.io.Serializable;
import javax.swing.JPanel;

public class Arbol implements Serializable {

//Definicion de la clase Arbol
    public NodoBinario Raiz;

    //Constructor Clase Arbol
    public Arbol(NodoBinario nodo) {
        Raiz = nodo;
    }

    //Insercion de un elemento en el arbol
    public void InsertaNodo(NodoBinario nodoPosicion, String Elem, String resp) {
        NodoBinario nodo = new NodoBinario(Elem, resp);

        nodoPosicion.InsertaBinario(nodo);
    }

   
    public JPanel getDibujo() {
        return new ArbolExpresionGrafico(this);
    }

}
