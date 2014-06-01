/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048game1;

/**
 *
 * @author raedalmutairi
 */


import java.util.Scanner;


public class Run {

    private Board board;
    private Scanner scan = new Scanner(System.in);
    
    public Run(){
        board = new Board();
        board.displayBoard();
        String input;
        do{
            System.out.print("Next move? ");
            input = scan.nextLine();
            if(input.equalsIgnoreCase("l")){
                
            }
            else if(input.equalsIgnoreCase("r")){
                
            }
            else if(input.equalsIgnoreCase("t")){
                
            }
            else if(input.equalsIgnoreCase("d")){
                
            }
            else if(!input.equalsIgnoreCase("x")){
                System.out.println("Incorrect input, please enter l, r, t, or d to tilt board, or x to exit.");
            }
        }while(!input.equalsIgnoreCase("X"));
    }
    
    public static void main(String[] args) {
        new Run();
    }
}
