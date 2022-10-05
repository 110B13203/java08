class Cwin{
	int width;
	int height;
	String name;
	void setW(int w) {
		width=w;
	}
	void setH(int h) {
		height=h;
	}
	void setName(String s) {
		name=s;
	}
	void setWindows(int h,int w,String s) {
		width=w;
		height=h;
		name=s;
	}
	public void show() {
		System.out.println("Name="+name);
		System.out.println("W="+width+", H="+height);
	}
	
}

public class Class12 {

	public static void main(String[] args) {
		Cwin cw=new Cwin();
		cw.setName("My Windowws");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}

}
