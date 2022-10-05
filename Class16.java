class CSphere{
	private int x;
	private int y;
	private int z;
	private int radius;
	void setLocation(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
	void setRadius(int a) {
		radius=a;
	}
	public void surfaceArea() {
		System.out.println(4*3.14*(radius*radius));
	}
	public void volume() {
		System.out.println((4*3.14*(radius*radius*radius))/3);
	}
	public void showCenter() {
		System.out.println("("+x+","+y+","+z+")");
	}
}

 class class16 {

	public static void main(String[] args) {
		CSphere cs=new CSphere();
		cs.setLocation(3,4,5);
		cs.setRadius(1);
		cs.surfaceArea();
		cs.volume();
		cs.showCenter();
	}

}
