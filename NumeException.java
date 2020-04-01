/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class NumeException extends RuntimeException {

    /**
     * Creates a new instance of <code>NumeException</code> without detail
     * message.
     */
    public NumeException() {
        super();
    }

    /**
     * Constructs an instance of <code>NumeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NumeException(String msg) {
        super(msg);
    }
}
