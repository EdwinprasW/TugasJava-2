/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    
    protected float t;

    public Tabung(float t, float r) {
        super(r);
        this.t = t;
    }
    
    
    @Override
    public float Volume(){
     float vol = 3.14f * r * r * t;
     return vol;
    }
    
    public float Luas(float r, float t){
        float lPermukaan = 2 * 3.14f * r * (r+t);
        return lPermukaan;
    }
}
