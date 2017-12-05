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
public class MesinPintuDigital {
    State adaKartu;
    State kartuTidakAda;
    State pintuTerbuka;
    State pintuTertutup;
    
    State state;
    int TidakAdakartu = 0;
    public MesinPintuDigital(){
        adaKartu = new StateAdaKartu(this);
        kartuTidakAda = new StateKartuTidakAda(this);
        pintuTerbuka = new StatePintuTerbuka(this);
        pintuTertutup = new StatePintuTertutup(this);
                        
        if (TidakAdakartu >= 0)
            state = kartuTidakAda;
        else
            state = pintuTerbuka;
    }
    
    public void kartumasuk(){
        state.kartumasuk();
    }
    
    public void tolakkartu(){
        state.tolakkartu();
    }
    
    public void putargagangpintu(){
        state.putargagangpintu();
        state.keluarkankartu();
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public State getAdaKartuState(){
        return adaKartu;
    }
    
    public State getKartuTidakAdaState(){
        return kartuTidakAda;
    }
    public State getPintuTerbukaState(){
        return pintuTerbuka;
    }
    
    public State getPintuTertutupState(){
        return pintuTertutup;
    }
    
}
