/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class LandTract {
    private final int length;
    private final int width;
    
    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public int area() {
       return length * width;
    }
    
    public boolean equals(int area){
        return area == area();
    }
    
    @Override
    public String toString() {
        return String.valueOf(area());
    }
}
