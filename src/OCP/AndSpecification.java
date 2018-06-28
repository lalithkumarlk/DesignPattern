package OCP;

public class AndSpecification implements Specification<Product>{

    Color color;
    Size size;

    public AndSpecification(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return color == item.color;
    }
}
