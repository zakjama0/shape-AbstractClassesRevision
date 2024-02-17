public class Square implements IArea {
    private int length;

    private int width;

    public Square(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }


    public double calculateArea(){
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
