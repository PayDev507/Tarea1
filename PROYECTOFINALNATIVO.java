/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.nativo;

import java.util.Scanner;

/**
 *
 * @author EliteBook 8570w
 */
public class PROYECTOFINALNATIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                int opcion;
                float nsalpactad;
                float rxh;
                float hrb;
                float sxh;
                float ssxp;
                float sexp;
                float isrxp;
                float isrxd;
                float isrsal;
                float hrsts;
                float certmed;
                float nacre;
                float comis;
                float viat;
                float nid;
                //VARIABLES FLOAT
                //INICIAN LAS VARIABLES STRING
                String enomb;
                String eape;
                String ccodcar;
                String ccoddep;
                String ccodsuc;
                String ccodisr;
                
                
                //finalizamos las variables string
                
                //Comenzamos a solicitar datos
                System.out.println("escribe el nombre del empleado ");
                       enomb=leer.next();
                System.out.println("escribbe el apellido del empleado ");
                       eape=leer.next();  
                System.out.println("escribe el cargo del empleado ");
                       ccodcar=leer.next();
                System.out.println("escribe el departamento del empleado ");
                       ccoddep=leer.next();
                System.out.println("escribe el nombre de la sucursal del empleado ");
                       ccodsuc=leer.next();
                System.out.println("escribe la clave del isr empleado ");
                    ccodisr   =leer.next();       
                    // finalizamos de solicitar datos string
                
                
                int n1;
                int n2;
                int rf;
                
               System.out.println("elige la operacion que deseas realizar");
               System.out.println("1.Suma");
               System.out.println("2.Resta");
               System.out.println("3.multiplicacion");
               System.out.println("4.division");
                       
                       opcion = leer.nextInt();
                       
                       
                       
            switch(opcion){
                case 1:
         rf=n1+n2;
                 System.out.println("el resultado es/t"+rf);
                 break;
                 
                case 2:
                    rf=n1-n2;
                    System.out.println("el resultado de la resta es"+rf);
                    break;
                    
                case 3:
                    rf=n1*n2;
                    System.out.println("el resultado de la multiplicacion es"+rf);
                    break;
                    
                case 4:
                    rf=n1/n2;
                    System.out.println("el resultado de la division es "+rf);
                 break;
                    
    }
    }
    
}
