package OCP;

import java.util.List;
import java.util.stream.Stream;

public class ColorSpecification implements Specification<Product>{


    Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.color == item.color;
    }

}
