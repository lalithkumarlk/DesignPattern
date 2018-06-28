package OCP;

import java.util.List;
import java.util.stream.Stream;

enum Color {
    RED,BLUE,GREEN;
}


enum Size{
    SMALL,LARGE,HUGE
}

interface Specification<T>{
    boolean isSatisfied(T item);
}

interface Filter<T>{
    Stream<T> filter(List<T> items,Specification<T> spec);
}

public class Product {
    String name;
    Color color;
    Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

}
