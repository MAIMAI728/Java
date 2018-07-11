package problem3;

/**
 * Created by mai on 2017/07/11.
 */
abstract class Shape {
    abstract float perimeter();
    abstract float area();

    ApplicationDriver.ShapeType type;

    //constructor
    public Shape(ApplicationDriver.ShapeType a, int[] side){

        this.type = a;
    }


}
