/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class PRAK201_2110817120010_FarisaAdelia {
     public class main {
    
    public static void main (String[] args){
        buah arumanis = new buah("Arumanis", "hijau kekuning-kuningan", "lembut", "manis", 5000, 13, 0.3);
        buah manalagi = new buah("Manalagi", "hijau", "kasar", "manis", 7500, 17, 0.5);
        buah manggaMadu = new buah("Mangga Madu", "kuning", "lembut", "manis",6500, 12,  0.375);


        arumanis.tampil();
        System.out.println("-----------------------");
        manalagi.tampil();
        System.out.println("-----------------------");
        manggaMadu.tampil();

    }
}
}
