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
    
    // added by Mansour to allow dynamic board size.
    private int boardSize = 4;
    
    private Tile[][] tiles= new Tile[boardSize][boardSize];
    private int score = 0;
    
    public Board(){
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                tiles[i][j] = new Tile(0);
            }
        }
        populateRandomCell();
        populateRandomCell();
    }
    
    public void displayBoard(){
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
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

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
    
    private int getRandomNumberBetween0And3(){
        return (int)(Math.random() * boardSize);
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
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                if(tiles[i][j].getValue()==0){
                    boardFull = false;
                }
            }
        }
        return boardFull;
    }
    
    public void tiltLeft(){
        for(int i=0; i<boardSize; i++){
            for(int j=2; j>=0; j--){
                if(tiles[i][j].getValue()==0){
                    for(int k=j+1; k<boardSize; k++){
                        tiles[i][k-1].setValue(tiles[i][k].getValue());
                        tiles[i][k].setValue(0);
                    }
                }
            }
        }
    }
    
    public void tiltRight(){
        for(int i=0; i<boardSize; i++){
            for(int j=1; j<=boardSize-1; j++){
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
        for(int i=0; i<boardSize; i++){
            for(int j=2; j>=0; j--){
                if(tiles[j][i].getValue()==0){
                    for(int k=j+1; k<boardSize; k++){
                        tiles[k-1][i].setValue(tiles[k][i].getValue());
                        tiles[k][i].setValue(0);
                    }
                }
            }
        }
    }
    
    public void tiltDown(){
        for(int i=0; i<boardSize; i++){
            for(int j=1; j<=boardSize-1; j++){
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
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize-1; j++){
                if(tiles[i][j].getValue() == tiles[i][j+1].getValue()){
                    tiles[i][j].setValue(tiles[i][j].getValue()+tiles[i][j+1].getValue());
                    score += tiles[i][j].getValue();
                    tiles[i][j+1].setValue(0);
                    tiltLeft();
                }
            }
        }
    }
    
    public void mergeRight(){
        for(int i=0; i<boardSize; i++){
            for(int j=boardSize-1; j>0; j--){
                if(tiles[i][j].getValue() == tiles[i][j-1].getValue()){
                    tiles[i][j].setValue(tiles[i][j].getValue()+tiles[i][j-1].getValue());
                    score += tiles[i][j].getValue();
                    tiles[i][j-1].setValue(0);
                    tiltRight();
                }
            }
        }
    }
    
    public void mergeTop(){
        for(int r=0; r<boardSize; r++){
            for(int c=0; c<boardSize-1; c++){
                if(tiles[c][r].getValue() == tiles[c+1][r].getValue()){
                    tiles[c][r].setValue(tiles[c][r].getValue()+tiles[c+1][r].getValue());
                    score += tiles[c][r].getValue();
                    tiles[c+1][r].setValue(0);
                    tiltTop();
                }
            }
        }
    }
    
    public void mergeDown(){
        for(int r=0; r<boardSize; r++){
            for(int c=boardSize-1; c>0; c--){
                if(tiles[c][r].getValue() == tiles[c-1][r].getValue()){
                    tiles[c][r].setValue(tiles[c][r].getValue()+tiles[c-1][r].getValue());
                    score += tiles[c][r].getValue();
                    tiles[c-1][r].setValue(0);
                    tiltDown();
                }
            }
        }
    }
}
