
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Main {
    
    
    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException{
        
        String path = Main.class.getResource("Main.class").getFile();
        path = URLDecoder.decode(path, "UTF-8");
        VectorHeap<Paciente> vHeap = new VectorHeap();
        
        try(BufferedReader buff = new BufferedReader(new FileReader( path.substring(0, path.indexOf("Main")) + "pacientes.txt" ))){
            
            String linea;
            String nom;
            String con;
            String pro;
            
            while((linea = buff.readLine()) != null){
                nom = linea.substring(0, linea.indexOf(","));
                linea = linea.substring(linea.indexOf(",")+2);
                con = linea.substring(0, linea.indexOf(","));
                linea = linea.substring(linea.indexOf(",")+2);
                pro = linea.toUpperCase();
                vHeap.add(new Paciente(nom, con, pro));
            }
            //nigga = new Paciente(nom, con, pro);
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        int sizeHeap = vHeap.size();
        for(int i = 0; i < sizeHeap; i++)
            System.out.println(vHeap.poll().toString());
    }
    
}
