/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sampclient;

/**
 *
 * @author furkanzumrut
 */
 
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class getMac{
  
        public getMac(){
            
        
        }
        
        public InetAddress getIp(){
        InetAddress ipCek = null;
        try {
            ipCek = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(getMac.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ipCek; 
        
        }
        public String getMacString(){
        
        InetAddress ip;
        String macAddress = null;
	try {
 
		ip = InetAddress.getLocalHost();
		//System.out.println("Current IP address : " + ip.getHostAddress());
 
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
 
		byte[] mac = network.getHardwareAddress();
 
		//System.out.print("Current MAC address : ");
 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
		//System.out.println(sb.toString());
                macAddress = sb.toString();
 
	} catch (UnknownHostException e) {
 
		e.printStackTrace();
 
	} catch (SocketException e){
 
		e.printStackTrace();
 
	}
        return macAddress;
        }
 
   
 
}
