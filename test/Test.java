/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.Assert.*;
import pkg2048game1.Board;

/**
 *
 * @author raedalmutairi
 */
public class Test {
    @org.junit.Test
    public void testTiltLeft(){
        Board board = new Board();
        board.getTiles()[0][0].setValue(0);
        board.getTiles()[0][1].setValue(0);
        board.getTiles()[0][2].setValue(0);
        board.getTiles()[0][3].setValue(2);
        board.tiltLeft();
        assertEquals(board.getTiles()[0][0].getValue(), 2);
        assertEquals(board.getTiles()[0][1].getValue(), 0);
        assertEquals(board.getTiles()[0][2].getValue(), 0);
        assertEquals(board.getTiles()[0][3].getValue(), 0);
    }
    
    @org.junit.Test
    public void testTiltRight(){
        Board board = new Board();
        board.getTiles()[0][0].setValue(2);
        board.getTiles()[0][1].setValue(0);
        board.getTiles()[0][2].setValue(0);
        board.getTiles()[0][3].setValue(0);
        board.tiltRight();
        assertEquals(board.getTiles()[0][0].getValue(), 0);
        assertEquals(board.getTiles()[0][1].getValue(), 0);
        assertEquals(board.getTiles()[0][2].getValue(), 0);
        assertEquals(board.getTiles()[0][3].getValue(), 2);
    }
    
    @org.junit.Test
    public void testTiltTop(){
        Board board = new Board();
        board.getTiles()[0][0].setValue(0);
        board.getTiles()[1][0].setValue(0);
        board.getTiles()[2][0].setValue(0);
        board.getTiles()[3][0].setValue(2);
        board.tiltTop();
        board.getTiles()[0][0].setValue(2);
        board.getTiles()[1][0].setValue(0);
        board.getTiles()[2][0].setValue(0);
        board.getTiles()[3][0].setValue(0);
    }
    
}