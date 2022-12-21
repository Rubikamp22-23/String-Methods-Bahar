public class GeometryCalculation {
    // This program takes data and gives the circumference and area of the shape.
    public static void main(String[] args) {
        // Square
        System.out.println("**Square**");
        int SideOfSquare = 2;
        // circumference 
        System.out.println("circumference = "+(SideOfSquare*4));
        // area
        System.out.print("area = ");
        System.out.println(SideOfSquare*SideOfSquare+"\n");

        // Circle
        System.out.println("**Circle**");
        int circleRadius = 4;
        double pi = 3.1415;
        // circumference
        double circleCircumference = (circleRadius*2) *pi;
        System.out.println("circumference ="+" "+circleCircumference);
        // area
        double circleArea = circleRadius*circleRadius*pi;
        System.out.println("area = "+circleArea);
    }
}