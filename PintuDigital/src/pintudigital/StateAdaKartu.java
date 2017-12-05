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
public class StateAdaKartu implements State{
 private MesinPintuDigital pintu;
    
    public StateAdaKartu(MesinPintuDigital pintu){
        this.pintu = pintu;
    }
    
    @Override
    public void kartumasuk(){
        System.out.println("Maaf, Anda sudah memasukkan kartu");
    }
    
    @Override
    public void tolakkartu(){
        System.out.println("Kartu tidak Sesuai");
        pintu.setState(pintu.getKartuTidakAdaState());
    }
    
    @Override
    public void putargagangpintu(){
        System.out.println("putar gagang pintu");
        pintu.setState(pintu.getPintuTerbukaState());
    }
    
    @Override
    public void keluarkankartu(){
        System.out.println("Mohon putar gagang pintu terlebih dahulu");
    }
    
    @Override
    public void bukapintu(){
        System.out.println("masukkan kartu untuk membuka");
    }

}