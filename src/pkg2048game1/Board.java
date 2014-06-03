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
        populateRandomCell();
        populateRandomCell();
    }
    
    public void displayBoard(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(tiles[i][j].getValue()==0){
                    System.out.print("[    ]");
                }
                else if(tiles[i][j].getValue()<10){
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

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
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
    
    public boolean isBoardFull(){
        boolean boardFull = true;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(tiles[i][j].getValue()==0){
                    boardFull = false;
                }
            }
        }
        return boardFull;
    }
    
    public void tiltLeft(){
        for(int i=0; i<4; i++){
            for(int j=2; j>=0; j--){
                if(tiles[i][j].getValue()==0){
                    for(int k=j+1; k<4; k++){
                        tiles[i][k-1].setValue(tiles[i][k].getValue());
                        tiles[i][k].setValue(0);
                    }
                }
            }
        }
    }
    
    public void tiltRight(){
        for(int i=0; i<4; i++){
            for(int j=1; j<=3; j++){
                if(tiles[i][j].getValue()==0){
                    for(int k=j-1; k>=0; k--){
                        tiles[i][k+1].setValue(tiles[i][k].getValue());
                        tiles[i][k].setValue(0);
                    }
                }
            }
        }
    }
    
    public void tiltTop(){
        for(int i=0; i<4; i++){
            for(int j=2; j>=0; j--){
                if(tiles[j][i].getValue()==0){
                    for(int k=j+1; k<4; k++){
                        tiles[k-1][i].setValue(tiles[k][i].getValue());
                        tiles[k][i].setValue(0);
                    }
                }
            }
        }
    }
    
    public void tiltDown(){
        for(int i=0; i<4; i++){
            for(int j=1; j<=3; j++){
                if(tiles[j][i].getValue()==0){
                    for(int k=j-1; k>=0; k--){
                        tiles[k+1][i].setValue(tiles[k][i].getValue());
                        tiles[k][i].setValue(0);
                    }
                }
            }
        }
    }
    
    public void mergeLeft(){
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(tiles[i][j].getValue() == tiles[i][j+1].getValue()){
                    tiles[i][j].setValue(tiles[i][j].getValue()+tiles[i][j+1].getValue());
                    tiles[i][j+1].setValue(0);
                    tiltLeft();
                }
            }
        }
    }
    
    public void mergeRight(){
        for(int i=0; i<4; i++){
            for(int j=3; j>0; j--){
                if(tiles[i][j].getValue() == tiles[i][j-1].getValue()){
                    tiles[i][j].setValue(tiles[i][j].getValue()+tiles[i][j-1].getValue());
                    tiles[i][j-1].setValue(0);
                    tiltRight();
                }
            }
        }
    }
    
    public void mergeTop(){
        
    }
    
    public void mergeDown(){
        
    }
}
