public class Rectangle {
	private float x=0;
	private float y=0;
	private float width,height=0;
	private static int numberOfObjects=0;
	public Rectangle(float px, float py, float w, float h){
		x=px;
		y=py;
		width=w;
		height=h;
		numberOfObjects++;
	}
	
	public boolean contains(float sx, float sy) {
		boolean res=false;
		if( (sx>=x)&&  (sx<=x+width))
			if( (sy>=y)&&  (sy<=y+height))
			res=true;
		
		return res; 
		
	}
	
	static public void printNumberOfRectangles(){	
		 System.out.println(numberOfObjects);
	 }
}
