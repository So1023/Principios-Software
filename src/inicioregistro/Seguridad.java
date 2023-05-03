
package inicioregistro;

import Visualizar.PantallaPrincipal;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

        
public class Seguridad {
    Registro login= new Registro();
    String res;
    
    
    public void validarUsuario(String usuarios[],String user, String pwd,int intentos)
    {
        boolean encontrado=false;
        for(int i=0;i<usuarios.length;i++)
        {
            if(usuarios[i].equalsIgnoreCase(user)&& usuarios[i+1].equals(pwd)) //"equalsIgnoreCase" permite comparar y además ignora si es mayúscula o no, sólo importa la letra
            {
               
                res= "Bienvenido";
                encontrado=true;
                JOptionPane.showMessageDialog(null,res,"Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                
              
                // Llamo al paquete que tiene la clase que necesito
                PantallaPrincipal pp= new PantallaPrincipal();
                pp.setVisible(true);
                
                
                
                
                intentos=0;
                login.setIntentos(intentos);
                break;
               
               
            }
         
        }
        
        if(encontrado==false)
        {
            res="Clave y/o usuario incorrectos, van "+ intentos+" intentos fallidos";
            JOptionPane.showMessageDialog(null,res,"Inicio de sesión", JOptionPane.ERROR_MESSAGE);

        }
        
        if(intentos>2)
        {
            JOptionPane.showMessageDialog(null,"3 intentos fallidos, esto se cerrará","Inicio de sesión",JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
    }
    
}
