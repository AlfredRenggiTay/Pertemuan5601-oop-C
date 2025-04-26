/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.pkg6;

/**
 *
 * @author LAB F
 * TGL: 26-04-2025

 */
public class Pertemuan56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.Warna = "hijau";
        apel.SetRasa("manis");
        
        System.out.printf("Warna apel diset %s\n",apel.Warna);
         System.out.printf("Warna apel diset %s\n",apel.GetRasa());
        
        buah anggur  = new buah();
        anggur.Warna = "hitam";
        
         System.out.printf("Warna anggur diset %s\n",anggur.Warna);
         
        // TODO code application logic here
    }
    
    
    
}

class buah {
   public String Warna;
   private String rasa;
   
   public void SetRasa(String txRasa){
       
       this.rasa = txRasa;
       
   }
   public String GetRasa(){
       return this.rasa;
   }
   
   
   
   }
    
    
    



