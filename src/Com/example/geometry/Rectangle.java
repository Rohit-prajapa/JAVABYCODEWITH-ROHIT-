package Com.example.geometry;

public class Rectangle {
    int length;
    int breadth;

public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getArea(){
        return length*breadth;
    }
}
