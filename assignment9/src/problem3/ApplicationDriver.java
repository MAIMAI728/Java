package problem3;

/**
 * Created by mai on 2017/07/11.
 */
class ApplicationDriver{

    static class MyGeometry {
        public void calculateAreaAndPerimeter(Shape shape){
            System.out.println(shape.type+ " perimeter is: "+ shape.perimeter());
            System.out.println(shape.type+  " area is: "+shape.area());
        }
    }

    enum ShapeType
    {
    Rectangle,
    Circle,
    Square,
    Custom
    }

    public static void main(String args[]){
    MyGeometry mg = new MyGeometry();

    int[] s1Sides = {10,20}; //10 is width and 20 is length
//    ShapeType s1Type = ShapeType.Rectangle;
    mg.calculateAreaAndPerimeter(new Shape(ShapeType.Rectangle,s1Sides) {
        @Override
        float perimeter() {
            return 2*(s1Sides[0]+s1Sides[1]);}
        @Override
        float area() {
            return (s1Sides[0] * s1Sides[1]);}
        });
        System.out.println("============================");

    int[] s2Sides = {10}; //10 is the width
//    ShapeType s2Type = ShapeType.Square;
        mg.calculateAreaAndPerimeter(new Shape(ShapeType.Square,s2Sides){
            @Override
            float perimeter() {return 4*(s2Sides[0]);}
            @Override
            float area() {return 2*(s2Sides[0]);}
        });
        System.out.println("============================");

    int[] s3Sides = {12}; //12 is the radius
//    ShapeType s3Type = ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape(ShapeType.Circle,s3Sides){
            double x=Math.PI; //円周率3.14
            @Override
            float perimeter() {return (float) (2*(s3Sides[0])*x);}

            @Override
            float area()  {
                return (float)((Math.pow(s3Sides[0],2))*x);
            }
        });
        System.out.println("============================");

    int[] s4Sides = {8, 12, 12};
//    ShapeType s4Type = ShapeType.Custom;
        mg.calculateAreaAndPerimeter(new Shape(ShapeType.Custom,s4Sides){
            @Override
            float perimeter() {return 0;}
            @Override
            float area() {return 0;}
        });
        System.out.println("============================");
    }
}
