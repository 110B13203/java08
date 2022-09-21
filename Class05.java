package java08;
class CBox
{
	int length;
	int width;
	int height;
	public void volume()
	{
		System.out.println(length*width*height);
	}
	public void surfaceArea()
	{
		System.out.println((length*width+width*height+length*height)*2);
	}
	public void showData() 
	{
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
	}
	public void showAll() 
	{
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		System.out.println(length*width*height);
		System.out.println((length*width+width*height+length*height)*2);
	}
	
}
public class Class04 {

	public static void main(String[] args) {
		CBox box=new CBox();
		box.length=1;
		box.width=1;
		box.height=1;
		box.volume();
		box.surfaceArea();
		box.showData();
		box.showAll();

	}

}
