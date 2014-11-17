package HWork3NOV14;

public class House {
float length , width;
public House(float length, float width){
	this.length = length;
	this.width= width;
}
House(float x){
	length= width=x;
}
int area(){
	return(int)( length*width);
}
}
