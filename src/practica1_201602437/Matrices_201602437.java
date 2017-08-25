
package practica1_201602437;
import java.util.Random;
public class Matrices_201602437 {
    String [][] matri;
    String [][] matriz;
    Random min;
    int m;
    public void MatrizP (){
        matri= new String [4][4];
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matri [i][j]= "X";
            }
        }
    }        
    public void MatrizPMostrar (){
      for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
             System.out.print("[X]");
            }  
    System.out.println();
      }
}
    public void MatrizPi (){
     matriz= new String [4][4];
        for (int i=0; i<4; i++){
         for (int j=0; j<4; j++){
          matriz [i][j]="[ ]";
    }
    }
    min = new Random();
    
    for (m = 0; m < 4; m++) {
            int fila = min.nextInt(4);
            int columna = min.nextInt(4);
            if (matriz[fila][columna].equals("[*]")) {
                m--;
            }
 
            matriz[fila][columna] = "[*]";
    }
    }
      public void MatrizPiMostrar (){
      for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
             System.out.print(matriz [i][j]);
            }  
    System.out.println();
      }
      }
    public void MatrizI (){
        matri= new String [6][6];
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                matri [i][j]= "[X]";
            }
        }
    }        
    public void MatrizIMostrar (){
      for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
             System.out.print("[X]");
            }  
    System.out.println();
      }
}
        public void MatrizIn (){
     matriz= new String [6][6];
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                matriz [i][j]= "[ ]";
    }
    }
    min = new Random();

    for (m = 0; m < 8; m++) {
            int fila = min.nextInt(6);
            int columna = min.nextInt(6);
           if (matriz[fila][columna].equals("[*]")) {
                m--;
            }
 
            matriz[fila][columna] = "[*]";
    }
    }
              public void MatrizInMostrar (){
      for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
             System.out.print(matriz [i][j]);
            }  
    System.out.println();
      }
      }
    public void MatrizE (){
        matri= new String [8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                matri [i][j]= "[X]";
            }
        }
    }        
    public void MatrizEMostrar (){
      for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
             System.out.print("[X]");
            }  
    System.out.println();
      }
}
 public void MatrizEx (){
     matriz= new String [8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                matriz [i][j]= "[ ]";
    }
    }
    min = new Random();

    for (m = 0; m < 12; m++) {
            int fila = min.nextInt(8);
            int columna = min.nextInt(8);
           if (matriz[fila][columna].equals("[*]")) {
                m--;
            }
 
            matriz[fila][columna] = "[*]";
    }
    }
     public void MatrizExMostrar (){
      for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
             System.out.print(matriz [i][j]);
            }  
    System.out.println();
      }
      }
}

