/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Abonat {

    private String nume, prenume, NrTel, CNP;
    private int id;
    //!CONSTRUCTOR! daca toate datele sunt valide, se instantiaza clasa
    
    public Abonat(int id,String nume, String prenume, String NrTel,String CNP) {

        this.id=id;
        if (valideazaNume(nume) == true) {
            this.nume = aranjareNume(nume);
        }
        if (valideazaPrenume(prenume) == true) {
            this.prenume = aranjareNume(prenume);
        }
        if (valideazaCnp(CNP) == true) {
            this.CNP = CNP;
        }
        if (valideazaNrTelefon(NrTel) == true) {
           this.NrTel = NrTel;
        }
    }
   /*  public Abonat(String nume, String prenume, String NrTel,String CNP) {

        
        if (valideazaNume(nume) == true) {
            this.nume = aranjareNume(nume);
        }
        if (valideazaNume(prenume) == true) {
            this.prenume = aranjareNume(prenume);
        }
        if (valideazaCnp(CNP) == true) {
            this.CNP = CNP;
        }
        if (valideazaNrTelefon(NrTel) == true) {
           this.NrTel = NrTel;
        }
    }*/
 /*   public Abonat(String nume, String prenume, String NrTel, Stirng CNP){
        this.nume=nume;
        this.prenume=prenume;
        this.CNP=CNP;
        this.NrTel=NrTel;
    }
    */
    
   ///getteri
    public int getId(){
        return id;
    }
    public String getNume(){
        return nume;
    }
    
    public String getPrenume(){
        return prenume;
    }
    
    public String getNrTel(){
        return NrTel;
    }
    public String getCNP(){
        return CNP;
    }
    // seteri
    
    public void setNume(String nume){
        valideazaNume(nume);
        aranjareNume(nume);
        this.nume=nume;
        
    }
    public void setPrenume(String prenume){
        valideazaNume(prenume);
        aranjareNume(prenume);
        this.prenume=prenume;
    }
    
    public void setNrTel(String NrTel){
        valideazaNrTelefon(NrTel);
       this.NrTel=NrTel;
    }
    
    public void setCNP(String CNP){
        valideazaCnp(CNP);
        this.CNP=CNP;
    }

    //metode pentru verificarea validitatii datelor
    private static boolean valideazaNume(String n) {
        if (n == null || n.length() < 2) {
            throw new NumeException("Numele nu poate lipsi!");
        }
        if (!n.matches("[A-Za-z \\-]{2,}")) {
            throw new NumeException("Numele nu pare de om!");
        }
        return true;
    }
private static boolean valideazaPrenume(String n) {
        if (n == null || n.length() < 2) {
            throw new NumeException("Prenumele nu poate lipsi!");
        }
        if (!n.matches("[A-Za-z \\-]{2,}")) {
            throw new NumeException("Prenumele nu pare de om!");
        }
        return true;
    }
 
    private static boolean valideazaCnp(String cnp) {
        if (cnp.length() != 13) {
            throw new CnpException();
        }

        return true;
    }
    
    private static boolean valideazaNrTelefon(String Nr) {
        if ((Nr.indexOf(0) == 0)|| (Nr.length() == 10 || Nr.length() == 13) ) {
             return true;
        }
        throw new NrTelException();
    }
   
    
    //tranforma primul caracter in majuscula si pe restul in minuscule
    String aranjareNume(String s) {
        char primulCaracter = Character.toUpperCase(s.charAt(0));
        String coada = s.substring(1).toLowerCase();
        return primulCaracter + coada;
        
    }
    
   /* public boolean Contine(Abonat a,String text){
        String s=a.toString();
        if(s.contains(text)==true)
            return true;
        return false;
    }
  */  
    
    @Override
    public String toString() {
        return id+" "+nume+" "+prenume+" "+NrTel+ " "+CNP;
    }
    

}
