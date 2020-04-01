/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class NrTelException extends RuntimeException {

    /**
     * Creates a new instance of <code>NrTelException</code> without detail
     * message.
     */
    public NrTelException() {
        super("Numarul de telefon trebuie sa contina 10 sau 13 cifre!!");
    }

    /**
     * Constructs an instance of <code>NrTelException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    
    
    public NrTelException(String msg) {
        super(msg);
    }
}
