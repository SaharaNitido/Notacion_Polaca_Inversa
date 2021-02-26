/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaccionpolacainversa;

/**
 *
 * @author Mulay
 */
public class NotaccionPolacaInversa {

    public String calculadoraRPN ( String [] entrada){
        
        String pila [] = new String [100];
        int posicionPila = 0; //indica el sitio de la pila en el que tenemos que insetrar o leer
        int posocionEntrada = 0; //indica el sitio de la entrada que estamos procesando
        
        //el length da la longitud del numero de elementos que me han pasado. Ejmplo abajo
        System.out.println(entrada.length);
        
        for (int i=0; i< entrada.length; i++){
            
            if (entrada[i] != "+" && entrada[i] != "-" && entrada[i] != "*" && entrada[i] != "/"){
                System.out.print(entrada[i] + " ");  
            }
        }
        
        
        
        
        return " ";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotaccionPolacaInversa ejercicio = new NotaccionPolacaInversa();
                
        ejercicio.calculadoraRPN( new String[]{"3", "2", "+", "7", "*", "15", "21", "+", "-"});
    }
    
}
