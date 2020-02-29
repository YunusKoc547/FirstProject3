package day50;

public abstract class Shape2 implements Drawable{

        String name;
        double area;

        // why abstract class have constructor even we cannot use it
        // it exists purely to let sub class to call and reuse the

        public Shape2(String name) {
            this.name = name;
        }

        public abstract void calculateArea();




}
