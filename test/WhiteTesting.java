
import org.junit.Test;
import static org.junit.Assert.*;
import pkg2048game1.Board;
import pkg2048game1.Tile;

public class WhiteTesting {
    
    @Test
    /*
     * Tests path1 of the if statement in isBoardFull() method in Board class
     */
    public void testIsBoardFullPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(0),new Tile(2),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        assertFalse(board.isBoardFull());
    }
    
    @Test
    /*
     * Tests path2 of the if statement in isBoardFull() method in Board class
     */
    public void testIsBoardFullPath2(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(2),new Tile(4),new Tile(2),new Tile(4)},
                            {new Tile(8),new Tile(16),new Tile(4),new Tile(2)},
                            {new Tile(4),new Tile(2),new Tile(8),new Tile(16)},
                            {new Tile(16),new Tile(8),new Tile(16),new Tile(32)}};
        board.setTiles(tiles);
        assertTrue(board.isBoardFull());
    }
    
    @Test
    /*
     * Tests path1 of the if statement in tiltLeft() method in Board class
     */
    public void testTiltLeftPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.tiltLeft();
        assertEquals(board.getTiles()[0][0].getValue() , 2);
        assertEquals(board.getTiles()[0][1].getValue() , 2);
        assertEquals(board.getTiles()[0][2].getValue() , 0);
        assertEquals(board.getTiles()[0][3].getValue() , 0);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in tiltRight() method in Board class
     */
    public void testTiltRightPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.tiltRight();
        assertEquals(board.getTiles()[0][0].getValue() , 0);
        assertEquals(board.getTiles()[0][1].getValue() , 0);
        assertEquals(board.getTiles()[0][2].getValue() , 2);
        assertEquals(board.getTiles()[0][3].getValue() , 2);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in tiltTop() method in Board class
     */
    public void testTiltTopPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(2),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(2),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.tiltTop();
        assertEquals(board.getTiles()[0][0].getValue() , 2);
        assertEquals(board.getTiles()[1][0].getValue() , 2);
        assertEquals(board.getTiles()[2][0].getValue() , 0);
        assertEquals(board.getTiles()[3][0].getValue() , 0);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in tiltDown() method in Board class
     */
    public void testTiltDownPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(2),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(2),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.tiltDown();
        assertEquals(board.getTiles()[0][0].getValue() , 0);
        assertEquals(board.getTiles()[1][0].getValue() , 0);
        assertEquals(board.getTiles()[2][0].getValue() , 2);
        assertEquals(board.getTiles()[3][0].getValue() , 2);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in mergeLeft() method in Board class
     */
    public void testMergeLeftPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.mergeLeft();
        assertEquals(board.getTiles()[0][0].getValue() , 4);
        assertEquals(board.getTiles()[0][1].getValue() , 0);
        assertEquals(board.getTiles()[0][2].getValue() , 0);
        assertEquals(board.getTiles()[0][3].getValue() , 0);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in mergeRight() method in Board class
     */
    public void testMergeRightPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(0),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(0),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.mergeRight();
        assertEquals(board.getTiles()[0][0].getValue() , 0);
        assertEquals(board.getTiles()[0][1].getValue() , 0);
        assertEquals(board.getTiles()[0][2].getValue() , 0);
        assertEquals(board.getTiles()[0][3].getValue() , 4);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in mergeTop() method in Board class
     */
    public void testMergeTopPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(2),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(2),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(2),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.mergeTop();
        assertEquals(board.getTiles()[0][0].getValue() , 4);
        assertEquals(board.getTiles()[1][0].getValue() , 2);
        assertEquals(board.getTiles()[2][0].getValue() , 0);
        assertEquals(board.getTiles()[3][0].getValue() , 0);
    }
    
    @Test
    /*
     * Tests path1 of the if statement in mergeDown() method in Board class
     */
    public void testMergeDownPath1(){
        Board board = new Board();
        Tile [][] tiles = { {new Tile(2),new Tile(2),new Tile(2),new Tile(0)},
                            {new Tile(2),new Tile(2),new Tile(0),new Tile(0)},
                            {new Tile(2),new Tile(0),new Tile(0),new Tile(0)},
                            {new Tile(0),new Tile(0),new Tile(0),new Tile(0)}};
        board.setTiles(tiles);
        board.mergeDown();
        assertEquals(board.getTiles()[0][0].getValue() , 0);
        assertEquals(board.getTiles()[1][0].getValue() , 0);
        assertEquals(board.getTiles()[2][0].getValue() , 2);
        assertEquals(board.getTiles()[3][0].getValue() , 4);
    }
    
}
