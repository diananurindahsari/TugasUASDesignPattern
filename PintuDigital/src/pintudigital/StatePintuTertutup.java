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
public class StatePintuTertutup implements State{
    private MesinPintuDigital pintu;
    
    public StatePintuTertutup(MesinPintuDigital pintu){
        this.pintu= pintu;
    }
    
    @Override
    public void kartumasuk(){
        System.out.println("Mohon maaf, masukkan kartu terlebih dahulu");
    }
    
    @Override
    public void tolakkartu(){
        System.out.println("cek kembali kartu");
    }
    
    @Override
    public void putargagangpintu(){
        System.out.println("Mohon maaf, masukkan kartu dahulu");
    }
    
    @Override
    public void keluarkankartu(){
        System.out.println("kartu sudah diambil");
    }
    
    
    @Override
    public void bukapintu(){
        System.out.println("masukkan kartu untuk membuka");
        pintu.setState(pintu.getAdaKartuState());
    }
}
