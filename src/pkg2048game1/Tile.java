/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048game1;

/**
 *
 * @author raedalmutairi
 */

public class Tile {
    
    private int value;

    public Tile(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == 0){
            return "";
        }
        else{
            return "" +  value ;
        }
    }
    
    
}
