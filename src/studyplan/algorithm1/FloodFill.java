package studyplan.algorithm1;

public class FloodFill {

	
	public static void main(String[] args) {
		
		int [] row0 = {1,1,1};
		int [] row1 = {1,1,0};
		int [] row2 = {1,0,1};
		
		int [] [] image = new int [3][3];
		image[0] = row0;
		image[1] = row1;
		image[2] = row2;
		
		floodFill(image,1,1,2);
		for(int i=0; i < image.length; i++) {
			for(int j=0; j < image[i].length; j++) {
				System.out.print(image[i][j]+" ");
			}
		}
	}
	
	public  static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
		fill(image,sr,sc,image[sr][sc],newColor);
		return image;
    }

	private static void fill(int[][] image, int sr, int sc, int existingColor, int newColor) {
		
		if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != existingColor) return;
		image[sr][sc] = newColor;
		fill(image,sr+1,sc,existingColor,newColor);
		fill(image,sr-1,sc,existingColor,newColor);
		fill(image,sr,sc+1,existingColor,newColor);
		fill(image,sr,sc-1,existingColor,newColor);

		
	}
}
