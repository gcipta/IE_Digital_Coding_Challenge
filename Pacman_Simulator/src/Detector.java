import java.util.List;

public class Detector {
	
	// The threshold grid size which is set to be zero
	public static final int THRESHOLD_SIZE = 0;
	
	// Variable to determine the x and y grid dimension
	int gridXDimension;
	int gridYDimension;
	// Variable to hold the acceptable list of direction in the game
	List<String> directionList;

	/**
	 * Constructor function for Detector class, it needs input for x and y grid dimension 
	 * @param gridXDimension	-> horizontal or x grid dimension (int)
	 * @param gridYDimension	-> vertical or y grid dimension (int)
	 * @param directionList2 
	 */
	public Detector(int gridXDimension, int gridYDimension, List<String> directionList) {
		this.gridXDimension = gridXDimension;
		this.gridYDimension = gridYDimension;
		this.directionList = directionList;
	}

	
	/**
	 * Function to check whether the Pacman x and y coordinate is still inside the grid
	 * to ensure that the Pacman is not placed and moved off the grid
	 * @param xCoord 	-> The Pacman x-coordinate (int)
	 * @param yCoord 	-> The Pacman y-coordinate (int)
	 * @return			-> The function will return true if the input x and y coordinate is off the grid, else false.
	 */
	public boolean isOffGrid(int xCoord, int yCoord) {
		if ((THRESHOLD_SIZE <= xCoord) && (xCoord <= gridXDimension) &&
				(THRESHOLD_SIZE <= yCoord) && (yCoord <= gridYDimension)) {
			return false;
		}
		// Default to return it as off grid
		return true;
	}


	/**
	 * Function to check whther the direction is valid, by which it is preented in the Direction List
	 * @param faceDirection
	 * @return
	 */
	public boolean isValidDirection(String faceDirection) {
		if(directionList.contains(faceDirection)){
			return true;
		}
		return false;
	}
}