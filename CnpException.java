/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class CnpException extends RuntimeException {

    /**
     * Creates a new instance of <code>CnpException</code> without detail
     * message.
     */
    public CnpException() {
        super("CNP-ul trebuie sa contina 13 cifre!!");
    }

    /**
     * Constructs an instance of <code>CnpException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public CnpException(String msg) {
        super(msg);
    }
}
