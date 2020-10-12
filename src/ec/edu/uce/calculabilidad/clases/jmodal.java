package ec.edu.uce.calculabilidad.clases;

/**
 * PROYECTO: Programa de simulación de un sistema de máquina de cambio de
 * monedas
 *
 * Clase que se encarga de configurar el jtextfield para que al presionar la
 * tecla enter envia una respuesta al sistema FECHA:25-11-2017
 *
 * @author: 1312960444 Michael Ponce Cevallos, 1723465066 Jairo Mena 1726581141
 * Marlon Oña
 * @version 1.0.0
 */
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 * Dialogo modal que sirve de ventana de captura de datos.<br>
 * Contiene un JTextField en el que escribimos un texto y pulsando enter después
 * de escribir en el, la ventana se cierra.
 */
public class jmodal extends JDialog {

    private JTextField textField;

    /**
     * Constructor que pone titulo al dialogo, construye la ventana y la hace
     * modal.
     *
     * @param padre Frame que hace de padre de esta dialogo.
     */
    public jmodal(Frame padre) {

        // padre y modal
        super(padre, true);
        setTitle("Mete un dato");
        textField = new JTextField(80);

        getContentPane().add(textField);
        this.setUndecorated(true);

        // Se oculta la ventana al pulsar <enter> sobre el textfield
        textField.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
            }
        });
    }

    /**
     * Devuelve el texto en el jtextfield
     *
     * @return el texto
     */
    public String getText() {
        return textField.getText();
    }
    /*
     Limpia el texto
     */

    public void setText() {
        textField.setText("");
    }
}
