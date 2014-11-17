package HWork3NOV14;

public class Room {
	private int a =9000;
	protected int b =900000;
	final float pi= 3.14f;
	static int name = 23;
int length, width;
Room(int length, int width){//constructor
	this.length = length;
	this.width= width;
}
int area(){
	int area1=(length*width*name);
return area1;
}
}
