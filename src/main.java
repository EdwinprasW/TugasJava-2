
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 1; 
        
        while(pilih == 1){
        System.out.println("==============");
        System.out.println("  MENU UTAMA");
        System.out.println("==============");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. exit");
        System.out.print("Pilih = ");
        pilih = input.nextInt();
        
        switch (pilih) {
        
            case 1 :         
        
                System.out.print("Masukan Panjang : "); float panjang = input.nextFloat();
                System.out.print("Masukan Lebar   : "); float lebar = input.nextFloat();
                System.out.print("Masukan Tinggi  : "); float tinggi = input.nextFloat();
                System.out.println("");
                
                Balok balok = new Balok(tinggi, panjang, lebar);

                System.out.println("Luas Persegi Panjang = " + balok.Luas()); 
                System.out.println("Keliling Persegi Panjang = " +  balok.Keliling());
                System.out.println("Volume Balok = " + balok.Volume());
                System.out.println("Luas Permukaan Balok = " + balok.Luas(panjang, lebar, tinggi));
                System.out.println("`");
                System.out.println("Ulangi ? (Ya = 1 || Tidak=0)");
                pilih = input.nextInt();
                break;
                
            case 2 :
                
                System.out.print("Masukan Tinggi : "); float t = input.nextFloat();
                System.out.print("Masukan Jari - Jari : "); float r = input.nextFloat();
                System.out.println("");
                
                Tabung tabung = new Tabung(t, r);

                System.out.println("Luas Lingkaran = " + tabung.Luas()); 
                System.out.println("Keliling Lingkaran = " +  tabung.Keliling());
                System.out.println("Volume Tabung = " + tabung.Volume());
                System.out.println("Luas Permukaan Tabung = " + tabung.Luas(r, t));
                System.out.println("");
                System.out.println("Ulangi ? (Ya = 1 || Tidak=0)");
                pilih = input.nextInt();
                break;
            
            case 0 :
                break;
            
            default : 
                System.out.println("Input Salah!");
            }
            
        }
    }
}
