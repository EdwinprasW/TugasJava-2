/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Lingkaran implements MenghitungBidang{
    
    protected float r;

    public Lingkaran(float r) {
        this.r = r;
    }
    
    
    
    
    @Override
    public float Luas() {
       float luas = 3.14f * r * r;
       return luas;
    }

    @Override
    public float Keliling() {
        float kel = 2 * 3.14f * r;
        return kel;
    }
    
    
}
