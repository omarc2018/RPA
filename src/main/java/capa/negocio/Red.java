
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
        
        int timeout = 500;
        String Ip;
 
        Ip = "10.122.32.101";
 
        try{
        InetAddress inet = InetAddress.getByName(Ip);
        if (inet.isReachable(timeout)) {
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

