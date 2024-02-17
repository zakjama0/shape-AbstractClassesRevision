public class Circle implements IArea {
    private int radius;

    public Circle( int inputRadius){
        this.radius = inputRadius;
    }

    public double calculateArea(){
        return  Math.PI * (radius * radius);
    }


    public int getRadius(){
        return this.radius;
    }
}
