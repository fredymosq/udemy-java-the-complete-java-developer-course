public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        Point point = new Point();
        return Math.sqrt( (point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y));
    }

    public double distance(Point point){
        return Math.sqrt( (point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y));
    }

    public double distance(double x, double y){
        return Math.sqrt( (x - this.x) * (x- this.x) + (y - this.y) * (y - this.y));

    }
}
