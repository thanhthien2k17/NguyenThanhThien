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
public class Color {

    String red,green;
    public Color() {
        this.red = "";
        this.green = "";
    }
    public Color(String red, String green) {
        this.red = red;
        this.green = green;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }
    
    void display(){
        System.out.println("red :"+red+ "\ngreen :"+green);
    }
    
}
