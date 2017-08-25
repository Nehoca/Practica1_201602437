
package practica1_201602437;
import java.util.Scanner;
public class Menu_201602437 {
   String a;
    public void Menu (){ 
    System.out.println("Nehoca Nereyda Godinez Salazar");
    System.out.println("201602437");
    System.out.println("IPC1 A Practica 1");
    System.out.println("BUSCAMINAS!!!!");
       Scanner scan = new Scanner(System.in);
       a = scan.nextLine(); 
   }
   public void Menu2 (){
   int opcion=0;
   Scanner opcio = new Scanner (System.in);
  
   System.out.println("----------------------------------");
   System.out.println("BUSCAMINAS!!!!");
   System.out.println("1.Principiante\n"
                    + "2.Intermedio\n"
                    +"3.Experto\n"
                    +"4.Salir\n"
                    +"Ingrese Opcion");
    opcion = opcio.nextInt();
    System.out.println("----------------------------------");
    Matrices_201602437 Menu_201602437=new Matrices_201602437();
    switch(opcion){
        case 1: 
            System.out.println("NIVEL PRINCIPIANTE");
            Menu_201602437.MatrizP();
            Menu_201602437.MatrizPMostrar();
            Menu_201602437.MatrizPi();
            System.out.println("------------------------");
            System.out.println("Voltear:V\n"
                    + "Reiniciar:R\n"
                     +"Mostras Respuestas:M\n"
                    +"Salir:S\n"
                    +"Ingrese Opcion");
            Scanner scan = new Scanner (System.in);
             a = scan.nextLine();
            
             switch(a){
                 case "V":
                      System.out.println("Ingrese Fila y Columna");
                    Scanner opci = new Scanner (System.in);
                    opcion = opci.nextInt();
                    break;
                case "R":
                     Menu2();
                break;
             case "M":
                       Menu_201602437.MatrizPiMostrar();
                       System.out.println("Ingrese Fila y Columna");
                    Scanner oci = new Scanner (System.in);
                    opcion = oci.nextInt();
                       break;
                case "S":
              System.exit(0);
             }
            System.out.println("------------------------");
            break;
        case 2: 
            System.out.println(" NIVEL INTERMEDIO");
            Menu_201602437.MatrizI();
            Menu_201602437.MatrizIMostrar();
            Menu_201602437.MatrizIn();

            System.out.println("------------------------");
            System.out.println("Voltear:V\n"
                    + "Reiniciar:R\n"
                    +"Mostras Respuestas:M\n"
                    +"Salir:S\n"
                    +"Ingrese Opcion\n");
             Scanner scann = new Scanner (System.in);
             a = scann.nextLine();
             switch(a){
                 case "V":
                      System.out.println("Ingrese Fila y Columna");
                    Scanner opci = new Scanner (System.in);
                    opcion = opci.nextInt();
                break;
                case "R":
                      Menu2();
                break;
                case "M":
                       Menu_201602437.MatrizInMostrar();
                       System.out.println("Ingrese Fila y Columna");
                    Scanner o = new Scanner (System.in);
                    opcion = o.nextInt();
                break;
                case "S":
                  System.exit(0);
             }
            System.out.println("------------------------");
            break;
         
        case 3: 
            System.out.println("      NIVEL EXPERTO");
            Menu_201602437.MatrizE();
            Menu_201602437.MatrizEMostrar();
            Menu_201602437.MatrizEx();
             System.out.println("------------------------");
            System.out.println("Voltear:V\n"
                    + "Reiniciar:R\n"
                    +"Mostras Respuestas:M\n"
                    +"Salir:S\n"
                    +"Ingrese Opcion");
                Scanner scanne = new Scanner (System.in);
             a = scanne.nextLine();
             switch(a){
                 case "V":
                       System.out.println("Ingrese Fila y Columna");
                    Scanner opci = new Scanner (System.in);
                    opcion = opci.nextInt();
                break;
                case "R":
                       Menu2();
                break;
             case "M":
                       Menu_201602437.MatrizExMostrar();
                       System.out.println("Ingrese Fila y Columna");
                    Scanner op = new Scanner (System.in);
                    opcion = op.nextInt();
                       break;
                case "S":
                      System.exit(0);
             }
             System.out.println("------------------------");     
            break;
         case 4: 
         System.exit(0);
    }
   }
}