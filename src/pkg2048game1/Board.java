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
    private int score = 0;
    
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
   private int getRandomNumberBetween0And3(){
        return (int)(Math.random() * 4);
    }
    
    private int getRandomNumber2Or4(){
        if ((int)(Math.random() * 2) ==0 ){
            return 2;
        }
        return 4;
    }
    
    public void populateRandomCell() {
        int i,j;
        int counter = 1000;
        do{
            i = getRandomNumberBetween0And3();
            j = getRandomNumberBetween0And3();
            counter--;
        }while(tiles[i][j].getValue()!=0 && counter>0);
        
        int value = getRandomNumber2Or4();
        tiles[i][j].setValue(value);
    }
    
    public void tiltLeft(){
        for(int r=0; r<4; r++){
            for(int c=2; c>=0; c--){
                if(tiles[r][c].getValue()==0){
                    for(int i=c+1; i<4; i++){
                        tiles[r][i-1].setValue(tiles[r][i].getValue());
                        tiles[r][i].setValue(0);
                    }
                }
            }
        }
    }
    
    public void tiltRight(){
        
    }
    
    public void tiltTop(){
        
    }
    
    public void tiltDown(){
        
    }
}
