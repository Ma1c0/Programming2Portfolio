import java.util.ArrayList;
import java.util.Random;

/**
   Attempts to find a path through a maze.
*/
public class Maze
{
   private char[][] maze;
   private int width;
   private int height;
   private ArrayList<Coordinate> path;
   private Coordinate coord;

   /**
      Create a maze searcher.
      @param aMaze character array representation of maze
   */
   public Maze(char[][] aMaze)
   {
      maze = aMaze;
      width = maze[0].length;
      height = maze.length;
      path = new ArrayList<Coordinate>();
   }

   /**
      Find an escape path.
      @param i row position
      @param j column position
      @return if escape is possible
   */
   public boolean escape(int i, int j)
   { 
	   if(i < 0 || j < 0 || i >= height || j >= width) {
		   return false;
	   }
	   
	   if(isExit(i,j)) {
		   path.add(new Coordinate(i, j));
		   return true;
	   }
	   
	   if(maze[i][j] != ' ') {
		   return false;
	   }
	   
	   maze[i][j] = '.';
	   
	   if(escape(i - 1, j)) {
		   maze[i][j] = ' ';
		   path.add(0, new Coordinate(i, j));
		   return true;
	   }
	   
	   if(escape(i + 1, j)) {
		   maze[i][j] = ' ';
		   path.add(0, new Coordinate(i, j));
		   return true;
	   }
	   
	   if(escape(i, j + 1)) {
		   maze[i][j] = ' ';
		   path.add(0, new Coordinate(i, j));
		   return true;
	   }
	   
	   if(escape(i, j - 1)) {
		   maze[i][j] = ' ';
		   path.add(0, new Coordinate(i, j));
		   return true;
	   }
	   
	   maze[i][j] = ' ';
	   return false;
	   
   }

   /**
      Get the path through the maze.
      @return list of coordinates along path
   */
   public ArrayList<Coordinate> getPath()
   {
      return path;
   }

   /**
      Determine if the row, column location is an exit.
      @return if location is an exit
   */
   private boolean isExit(int i, int j)
   {
      return maze[i][j] == ' '
            && (i == 0 || j == 0 || i == height - 1 || j == width - 1);
   }
}
