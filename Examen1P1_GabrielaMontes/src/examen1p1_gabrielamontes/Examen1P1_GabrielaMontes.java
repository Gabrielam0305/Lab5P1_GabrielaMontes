/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_gabrielamontes;

import java.util.Scanner;
public class Examen1P1_GabrielaMontes {

    public static void main(String[] args) {
        menu();
        // TODO code application logic here
    }
    public static void menu(){
        Scanner entrada= new Scanner (System.in);
        System.out.println("---------Menu---------");
        System.out.println("Seleccione la opcion que quiere utlizar: ");
        System.out.println("Opcion 1: Conjuntos ");
        System.out.println("Opcion 2: Cifrado por substitución ");
        System.out.println("Opcion 3: Sobre ");
        System.out.println("Opcion 4: Salida ");
        int op=entrada.nextInt();
        while(op!=4){
        switch (op){
        case 1:
            conjunto();
            break;
        case 2:
          entrada= new Scanner (System.in);
          System.out.println ("Ingrese cadena: ");
          String cad = entrada.nextLine();
          String resp=substitucion(cad);
          System.out.println ("Cadena cifrada: "+resp);
            break;
        case 3:
            carta();
            break;
        }
        System.out.println("---------Menu---------");
        System.out.println("Seleccione la opcion que quiere utlizar: ");
        System.out.println("Opcion 1: Conjuntos ");
        System.out.println("Opcion 2: Cifrado por substitución ");
        System.out.println("Opcion 3: Sobre ");
        System.out.println("Opcion 4: Salida ");
        op=entrada.nextInt();
        }
}
    public static String substitucion (String cadena){
                    String phrase=cadena.replace(" ", "");
                   String min=phrase.toLowerCase();
                   String acum="";
                   int num=0;
                   for (int i=0;i<min.length();i++){
                       int cont=25;
                       int k=0;
                       num=min.charAt(i);
                       if (num>109){
                       for(int j=97;j<=109;j++){
                          k=j+cont;
                          if (k==num){
                            char value  = (char) j;
                            acum +=value;
                          }
                          cont-=2;
                           }
                       }else{
                           for(int j=122;j>=110;j--){
                          k=j-cont;
                          if (k==num){
                            char value  = (char) j;
                            acum +=value;
                          }
                          cont-=2;
                           }
                       } 
                   }
                   
                   return acum;
                           
    }  
    


    public static void conjunto (){
                    Scanner entrada= new Scanner (System.in);
                    System.out.println ("Ingrese la primera cadena: ");
                    String phrase=entrada.nextLine();
                    System.out.println ("Ingrese la segunda cadena: ");
                    String phrase2=entrada.nextLine();
                    int k=phrase.charAt(0);
                    int j=phrase.charAt(1);
                    int l=phrase.charAt(2);
                    int m=phrase.charAt(phrase.length()-1);
                    int a=phrase2.charAt(0);
                    int b=phrase2.charAt(1);
                    int c=phrase2.charAt(2);
                    int d=phrase2.charAt(phrase2.length()-1);
                    int cont=0;
                    String acum="";
                    String union="";
                    
                    String espacios=phrase.replace(" ", "");
                    String comas=espacios.replace(",", "");
                    String espacios2=phrase2.replace(" ", "");
                    String comas2=espacios2.replace(",", ""); 
                    
                    if (((k>=65)&&(k<=90)&&(j==61)&&(l==123)&&(m==125))&&((a>=65)&&(a<=90)&&(b==61)&&(c==123)&&(d==125))){
            
                    if (comas2.length()-2==comas.length()-2){
                     for (int i=3;i<comas.length()-1;i++){
                         char pos=comas.charAt(i);
                         System.out.println("pos: "+pos);
                           char var=comas2.charAt(i);
                             System.out.println("var: "+var);
                             union+=pos;
                              union+=",";
                              union+=var;
                              union+=",";
                             if(var==pos){
                                 cont++;
                                 acum+=var;
                                 acum+=",";
                                 System.out.println("acum: "+acum);
                             }
                             
                         }
                     
                     if (cont==comas2.length()-4){
                         System.out.println ("Son iguales");
                     }else{
                        System.out.println ("No son iguales");
                        System.out.print ("Intersección: D={"+acum);
                        System.out.print ("}");
                        
                        System.out.print ("Union: D={"+union);
                        System.out.print ("}");
                     }
                     }else{
                        System.out.println ("No son iguales");
                         for (int i=3;i<comas.length()-1;i++){
                         char pos=comas.charAt(i);
                         //System.out.println("pos: "+pos);
                          char var=comas2.charAt(i);
                             //System.out.println("var: "+var);
                             union+=pos;
                              union+=",";
                              union+=var;
                              union+=",";
                             if(var==pos){
                                 cont++;
                                 acum+=var;
                                 acum+=",";
                                 System.out.println("acum: "+acum);
                             }
                             
                         }
                         System.out.print ("Intersección: D={"+acum);
                        System.out.print ("}");
                        
                        System.out.print ("Union: D={"+union);
                        System.out.print ("}");
                    }
                }else{
            System.out.println("ERROR");
            }
}
       public static void carta() {
        Scanner entrada= new Scanner (System.in);
                    System.out.println ("Ingrese n: ");
                    int n=entrada.nextInt();
                    System.out.println ("Ingrese el contorno: ");
                    String con=entrada.next();
                    if (n%2==0){
    int alt = (2*(2 * n));
    System.out.println(alt);
            
            for (int i = 0; i <=alt/2; i++) {
                for (int j = 0; j < alt; j++) {
                if((i==0)||(i==alt)){
                 if (j % 2 == 0) {
                        System.out.print(con);
                    } else {
                        System.out.print(" ");
                    
                            }
                }else{
                    if (i == j || i + j == alt) {
                        System.out.print(con);
                    } else {
                        System.out.print(" ");
                    }
                
                }
            }
                 System.out.println("");
            }
                    }else{
                        System.out.print(" ERROR");
                    }
        // TODO code application logic here
    }
    //
}