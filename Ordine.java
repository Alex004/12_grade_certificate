
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author adria
 */
public class Ordine {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
       Splash splash=new Splash();
       splash.setVisible(true);
       Aspect aspect=new Aspect();
	try{
            for(int i=0; i<=100;i++){
                Thread.sleep(50);
                splash.lProcent.setText(Integer.toString(i)+"%");
                splash.lBar.setValue(i);
                if(i==100){
                    splash.setVisible(false);
                    aspect.setVisible(true);
                }
            }
        }catch (Exception e){
            System.out.println("Esti fraier ");
        }
        }
        
    }
    
