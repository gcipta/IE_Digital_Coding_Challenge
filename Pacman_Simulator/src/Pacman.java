
public class Pacman {
	
	private int xCoord;
	private int yCoord;
	private String faceDirection;
	
	public Pacman(int xCoord, int yCoord, String faceDirection) {
		
		this.setxCoord(xCoord);
		this.setyCoord(yCoord);
		this.setFaceDirection(faceDirection);
	}

	public String getFaceDirection() {
		return faceDirection;
	}

	public void setFaceDirection(String faceDirection) {
		this.faceDirection = faceDirection;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	

}
