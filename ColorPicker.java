/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

/**
 *
 * @author thien
 */

public class ColorPicker extends Color{
    String blue;

    public ColorPicker(String blue) {
        this.blue = blue;
    }

    public ColorPicker(String blue, String red, String green) {
        super(red, green);
        this.blue = blue;
    }
    
    @Override
    void display(){
        System.out.println("red :"+red+ "\ngreen :"+green+"\nblue :"+blue);
    }
}
