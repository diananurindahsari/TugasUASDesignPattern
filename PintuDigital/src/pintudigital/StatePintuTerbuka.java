/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintudigital;

/**
 *
 * @author alhadi
 */
public class StatePintuTerbuka implements State {
    private MesinPintuDigital pintu;
    
    public StatePintuTerbuka(MesinPintuDigital pintu){
        this.pintu= pintu;
    }
    
    @Override
    public void kartumasuk(){
        System.out.println("Maaf, pintu sudah terbuka");
    }
    
    @Override
    public void tolakkartu(){
        System.out.println("Maaf, cek kembali kartu kunci anda");
    }
    
    @Override
    public void putargagangpintu(){
        System.out.println("pintu sedang terbuka");
    }
    
    @Override
    public void keluarkankartu(){
        System.out.println("keluarkan kartu");
    }
    
    @Override
    public void bukapintu(){
        System.out.println("masukkan kartu untuk membuka");
    }
    
    
}
