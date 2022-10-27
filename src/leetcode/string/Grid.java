package leetcode.string;

/**
* A grid object represents the grid part of a life simulation.
* The grid object keeps track of the state of each square
* (alive, dead), and allows the user to make one step in the
* life simulation.
*
* Note that this class does not do any drawing or other I/O.
* It just represents a grid.
*

*/
public class Grid
{
	
	private boolean grid[][];
  
/**
* Constructor - creates an empty grid of the
* specified dimensions.
*
* @param width The width of the new grid
* @param height The height of the new grid
*/
public Grid (int width, int height)
{
   grid =new boolean[width][height];
}

/**
* Returns true if the specified cell in the grid
* is alive, false otherwise. If the coordinates
* are illegal (outside the grid), false is returned.
*
* @param row a row number
* @param column a column number
* @return true iff that cell is alive
*/
public boolean isAlive (int row, int column)
{
   if(row >= getWidth() || column >= getHeight ()) {
   return false; 
   }
   return grid[row][column];
}
  
/**
* Returns the width of the grid.
*
* @return the width of this grid
*/
public int getWidth ()
{
   return grid.length; 
}

/**
* Returns the height of the grid.
*
* @return the height of this grid
*/
public int getHeight ()
{
   return grid[0].length;
}
  
/**
* Sets the state of the specified cell in the
* grid.
*
* @param row a row number
* @param column a column number
* @param isAlive true if the grid cell should be alive
*/
public void setCellState(int row, int column, boolean isAlive)
{
    if(isAlive(row,column)) {
	 grid[row][column]=isAlive;
    }
}
  

/**
* Clears the grid, all cells marked as
* dead.
*/
public void clear ()
{

}
  
/**
* Performs one 'life' step using the standard rules
* of life:
*
* Any live cell with fewer than two neighbors dies, as if by loneliness.
* Any live cell with more than three neighbors dies, as if by overcrowding.
* Any live cell with two or three neighbors lives, unchanged, to the next generation.
* Any dead cell with exactly three neighbors comes to life.
*
* Care must be taken to make sure the next generation is kept separate from the
* current generation.
*/
public void stepOneGeneration ()
{
   // Create a spare grid
  
   // Loop through each grid location
       // Count the neighbors of the current location (using the helper function 8 times)
   // Set the alive/dead state in the spare grid according to the rules
  
   // Store the spare grid in the grid field (replacing the old grid with the new one)
}
}
