/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048game1;

/**
 *
 * @author raedalmutairi
 */

public class Board {
    
    private Tile[][] tiles= new Tile[4][4];
    
    public Board(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                tiles[i][j] = new Tile(0);
            }
        }
    }
    
    public void displayBoard(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(tiles[i][j].getValue()<10){
                    System.out.print("[   "+tiles[i][j]+"]");
                }
                else if(tiles[i][j].getValue()<100){
                    System.out.print("[  "+tiles[i][j]+"]");
                }
                else if(tiles[i][j].getValue()<1000){
                    System.out.print("[ "+tiles[i][j]+"]");
                }
                else if(tiles[i][j].getValue()<10000){
                    System.out.print("["+tiles[i][j]+"]");
                }
            }
            System.out.print("\n");
        }
    }
}
