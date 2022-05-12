/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesComDoisNumeros;

/**
 *
 * @author Pichau
 */
public class NaoParException extends Exception {

    /**
     * Creates a new instance of <code>NaoParException</code> without detail
     * message.
     */
    public NaoParException() {
        super("Necessita ser par");
    }

    /**
     * Constructs an instance of <code>NaoParException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NaoParException(String msg) {
        super(msg);
    }
}
