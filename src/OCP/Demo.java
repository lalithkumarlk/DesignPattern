package OCP;

import OCP.*;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Product house = new Product("House", Color.BLUE, Size.HUGE);
        Product pen = new Product("Pen", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);

        List<Product> products = List.of(house,pen,tree);

        ProductFilter filter = new ProductFilter();

        filter.filter(products,new ColorSpecification(Color.RED)).forEach(product -> System.out.println(" - " + product.name + " is " + product.color));

        filter.filter(products,new AndSpecification(Color.GREEN,Size.LARGE)).forEach(product -> System.out.println(" - " + product.name + " is " + product.color + " and " + product.size));

    }
}
