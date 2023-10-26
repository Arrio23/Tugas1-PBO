/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakhlukHidup;

/**
 *
 * @author RIO
 */
public class Sigung {
    public static void main(String[] args) {
        Hewan Sigung = new Hewan();
        Sigung.setNama("Sigung");
        Sigung.setFamily("Mamalia");
        Sigung.setHabitat("Darat");
        Sigung.setJenis("omnivora");
        Sigung.setCirifisik("berkaki empat, badan berbulu hitam putih");
        Sigung.defend();
        
        System.out.println("Hewan : " + Sigung.getNama());
        System.out.println("Family : " + Sigung.getFamily());
        System.out.println("Habitat : " + Sigung.getHabitat());
        System.out.println("Jenis : " + Sigung.getJenis());
        System.out.println("Ciri Fisik : " + Sigung.getCirifisik());
        System.out.println(Sigung.defend() + "mengeluarkan cairan dan bau yang tidak sedap");
    }
}
