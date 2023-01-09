package OopConcepts;

class Cylinder{
	private int radius;
	private int height;
	
	
    public Cylinder(int r,int h) {
    	this.radius=r;
    	this.height=h;
    	
    }
	
	void getRadius() {
		System.out.format("radius is %d.\n",radius);
	}
	
//	void setRadius(int r) {
//		radius=r;
//	}
	
	void getHeight() {
		System.out.format("height is %d.\n",height);
	}

//	void setHeight(int h) {
//		height=h;
//	}
	public double surfaceArea() {
		return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
}

public class Ques5 {

	public static void main(String[] args) {
//	    Cylinder sc=new Cylinder();
		Cylinder sc=new Cylinder(9,12);
//	    sc.setRadius(9);
	    sc.getRadius();
//	    sc.setHeight(12);
	    sc.getHeight();
	    System.out.println(sc.surfaceArea());
	    System.out.println(sc.volume());
		
		
	}

	

}
