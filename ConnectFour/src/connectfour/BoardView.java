/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.io.Serializable;

/**
 *
 * @author Cheryl Allred
 */
public class BoardView implements Serializable 
{
    
    
    Board board;
    
    public Object displayBoard(Object object) { 
        this.board = (Board) object;
        this.printHeadRow();
        this.printDividerRow();
        for (int i = 0;i < this.board.getRowCount();i++){
            Player[] rowOfLocations = this.board.getBoardLocations()[i];
            this.printRow(i+1, rowOfLocations);
            this.printDividerRow();
        }
        System.out.println();
         
        return null;
    }
private void printHeadRow(){
    
    System.out.print("\n\t     1  ");
    int columnsInRow = this.board.getColumnCount();
    
    for (int i = 1;i < columnsInRow -1;i++){
        int col = i + 1;
        System.out.print("  " +col+ "  ");
    }
    System.out.print(" "+ columnsInRow + " ");
}
private void printDividerRow() {

        // divider for first column
        System.out.print("\n\t  |━━━");
        
        int columnsInRow = this.board.columnCount;
        // i starts with 1 and ends with the second to last column
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("━━━");
        }
        // divider for last row
        System.out.print("━━━━|");
    }
private void printRow(int rowNumber,Player[] rowLocations){
    
    String letter = " ";
    if (rowLocations[0] != null){
        letter = rowLocations[0].marker;
    }
    System.out.print("\n\t" + rowNumber + " | " + letter + "   |");
    

    for (int i =1; i< rowLocations.length;i++){
         if(rowLocations[i] == null){
             letter = " ";
         } else {
             letter = rowLocations[i].marker;
         }
         System.out.print(" " + letter + "  |");
         }
}
    

}