
package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Julián
 */
public class Copybytesimaxe {

    
    public static void main(String[] args) throws IOException {
        
        
        File gnulinux = new File("/home/oracle/Desktop/compartido/powered-by-gnu-linux.png");
        File gnulinuxcopia = new File("/home/oracle/Desktop/compartido/powered-by-gnu-linux2.png");

        gnulinuxcopia.createNewFile();

        FileInputStream entrada = new FileInputStream(gnulinux);
        FileOutputStream salida = new FileOutputStream(gnulinuxcopia);

        BufferedInputStream entradabuf=new  BufferedInputStream(entrada);
        BufferedOutputStream salidabuf=new BufferedOutputStream(salida); 
        
        
        int Ent = 0;

        while ((Ent = entradabuf.read()) != -1) {
            salidabuf.write(Ent);

        }
        entrada.close();
        salida.close();
        entradabuf.close();
        salidabuf.close();
        
    }
    
}
