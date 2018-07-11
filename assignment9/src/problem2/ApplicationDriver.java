package problem2;

/**
 * Created by mai on 2017/07/10.
 */
public class ApplicationDriver {

    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
    }

    public static void main(String args[]) {

        //instance

        //constructor and method
        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {
            @Override
            float perimeter() {
                return 2*(s1Sides[0]+s1Sides[1]);
            }

            @Override
            float area() {
                return (s1Sides[0]*s1Sides[1]);
            }
        };
        System.out.println("S1's perimeter is: "+ s1.perimeter());
        System.out.println("S1's area is: "+ s1.area());
        System.out.println("============================");
        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.Square, s2Sides) {
            @Override
            float perimeter() {
                return 4*(s2Sides[0]);
            }

            @Override
            float area() {
                return 2*(s2Sides[0]);
            }
        };
        System.out.println("S2's perimeter is: "+ s2.perimeter());
        System.out.println("S2s area is: "+ s2.area());
        System.out.println("============================");
        int[] s3Sides = {12};
        Shape s3 = new Shape(ShapeType.Circle, s3Sides) {
            double x=Math.PI; //円周率3.14

            @Override
            float perimeter() {
                //float casted...
                return (float) (2*(s3Sides[0])*x);
            }

            @Override
            float area() {
                return (float)((Math.pow(s3Sides[0],2))*x);
            }
        };
        System.out.println("S3's perimeter is: "+s3.perimeter());
        System.out.println("S3s area is: "+s3.area());
        System.out.println("============================");
        int[] s4Sides = {8, 12, 12};
        Shape s4 = new Shape(ShapeType.Triangle, s4Sides) {
            @Override
            float perimeter() {
                return (s4Sides[0]+s4Sides[1]+s4Sides[2]);
            }

            @Override
            float area() {
                int a = (s4Sides[0]+s4Sides[1]+s4Sides[2])/2;
                //double y=Math.sqrt(a); // aの平方根はyである(81の平方根は9である)
                //ヘロンの公式
                //3辺の長さをa,b,cとし、
                //s=(a+b+c)/2とおくと
                //S=√{s(s-a)(s-b)(s-c)}
                return (float) Math.sqrt(a * (a-s4Sides[0]) * (a-s4Sides[1]) * (a-s4Sides[2]));
            }
        };
        System.out.println("S4's perimeter is: "+s4.perimeter());
        System.out.println("S4s area is: "+s4.area());
    }
}
