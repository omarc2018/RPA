
package capa.negocio;


import java.io.IOException;
import java.net.InetAddress;
import javax.swing.JOptionPane;



public class Red {
    public String IP;
    
    
    public Red (String IP){
        this.IP = IP;
    }
    
    static boolean pingLocal(){
        
        int espera = 500;
        String IP;
 
        IP = "10.122.11.243";
 
        try{
        InetAddress inet = InetAddress.getByName(IP);
        if (inet.isReachable(espera)) {
            return true;
        } else {
           return false;
        }
        }catch(IOException e ){
            JOptionPane.showMessageDialog(null, "hay problemas");
        }
        return false;
 
    }
 
}

