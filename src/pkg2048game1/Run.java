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
        }while(!input.equalsIgnoreCase("X"));
    }
    
    public static void main(String[] args) {
        new Run();
    }
}
