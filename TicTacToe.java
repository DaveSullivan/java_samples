/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.WORLD;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dave
 */
enum Color {
    Black,
    Red,
    None
};



public class TicTacToe {
    
    
    static Color CheckForWin(List<List<Color>> board){
        Color cur = null;
        // check columns
        for (int col = 0; col < board.size(); col++)
        {
            int row;
            for (row = 0; row < board.get(col).size(); row++)
                if (0 == row)
                {
                    cur = board.get(col).get(row);
                    if (Color.None == cur)
                        break;
                }
                else if (board.get(col).get(row) != cur)
                    break;
            
            if (row == board.get(col).size())
                return cur;
        }
        
        // check rows
        for (int row = 0; row < board.get(0).size(); row++)
        {
            int col;
            for (col = 0; col < board.size(); col++)
                if (0 == col)
                {
                    cur = board.get(col).get(row);
                    if (Color.None == cur)
                        break;
                }
                else if (board.get(col).get(row) != cur)
                    break;
            
            if (col == board.size())
                return cur;
        }
        return Color.None;
    }
    
    public static void main(String... args) {
            
        String[] strings = {"hi", "there"};
        List<String> strList = Arrays.asList(strings);
        
    
        {       
            Color[] row1 = {Color.Red, Color.Black, Color.Black};
            List<Color> rowList1 = 
                    Arrays.asList(row1);
            Color[] row2 = {Color.Red, Color.Black, Color.None};
            List<Color> rowList2 = 
                    Arrays.asList(row2);
            Color[] row3 = {Color.Black, Color.Black, Color.Red};
            List<Color> rowList3 = 
                    Arrays.asList(row3);
            List<List<Color>> grid = new ArrayList<>(3);
            grid.add(rowList1);
            grid.add(rowList2);
            grid.add(rowList3);
            
            Color ret = CheckForWin(grid);
            System.out.println("Results " + ret);
        }
    }
};
