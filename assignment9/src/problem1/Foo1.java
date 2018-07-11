package problem1;

/**
 * Created by mai on 2017/07/10.
 */

public class Foo1 {

    private int bar1;

    //constructor of Foo1
    public Foo1(int x) {
        bar1 = x;
    }

    class Foo2 extends Foo1 {

        //constructor of Foo2
        public Foo2(int x) {
            super(x * 10);
        }


        public void show() {
            System.out.println("bar1 = " + bar1);
            System.out.println("((Foo1)this).bar1 = " + ((Foo1)this).bar1);
            System.out.println("super = "+super.bar1 );
            System.out.println("Foo1.this.bar1 = " + Foo1.this.bar1);
        }
    }


}
