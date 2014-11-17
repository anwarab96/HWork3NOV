package HWork3NOV14;

public class Rectangle {
    //there is a default constructor behind
    public Rectangle(){
    	
    } ///default constructor    
    int length,width;
    ///constructor with one parameter.
    public Rectangle (int length, int width){//constructor with two parameter.
        this.length=length;
        this.width=width;
        System.out.println("the length is  "+length  + " and the width is "+ width);
    }
    //another way 
     
     public void  setArea(int length, int width){
         this.length=length;
         this.width=width;
     }
     public int getArea(){
         return length * width;
     }
     
     
    void getData(int x, int y){ //argument passing here
        length =x;
        width =y;
         
    }
    int recArea(){//no argument passing
         
        /*int area = length*width;
        return (area);*/
        return (length * width);//another way to return 
    }
 
}



