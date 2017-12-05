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
public class StateKartuTidakAda implements State{
    private MesinPintuDigital pintu;
    
    public StateKartuTidakAda(MesinPintuDigital pintu){
        this.pintu= pintu;
    }
    
    @Override
    public void kartumasuk(){
        System.out.println("Kartu dimasukkan");
        pintu.setState(pintu.getAdaKartuState());
    }
    
    @Override
    public void tolakkartu(){
        System.out.println("kartu salah");
    }
    
    @Override
    public void putargagangpintu(){
        System.out.println("Masukkan kartu terlebih dahulu");
    }
    
    @Override
    public void keluarkankartu(){
        System.out.println("cek kartu anda");
    }
    
    @Override
    public void bukapintu(){
        System.out.println("masukkan kartu untuk membuka");
    }
}
