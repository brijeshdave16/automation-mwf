class Box
{

	double width,height,depth;
	Box()
	{
	System.out.println("Defult constructor");
	width=3;
	height=4;
	depth=5;
	
	}


	{
		double width,height,depth;
		Box(double w,double h,double d)
		{
			System.out.println("Parameterized Constrtor called");
			width=w;
			height=h;
			depth=d;
			
		}
		Box(Box b)
		{
			System.out.println("Copy constructor");
			width=b.width;
			height=b.height;
			depth=b.depth;
			
		}
		void volume()
		{
			System.out.println("Volume :"+(width*height*depth));
		}
	}




public class Constructor {
	
			public static void main(String[] args) {
				
				Box b1= new Box();
				b1.volume();
				Box b2 = new Box(4,5,6);
				b2.volume();
				Box b3= new Box(b2);
				b3.volume();
			}

}
