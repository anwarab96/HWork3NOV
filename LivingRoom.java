package HWork3NOV14;

public class LivingRoom extends Room {
int height;
public LivingRoom(int length, int width, int height){
	super(length,width);
	this.height = height;
}
int volume(){
	int RoomVolume= length*width*height;
	return RoomVolume;
}
}
