package part5.repetitiveCode.exc1;

public class MainProgram {
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);

        System.out.println();

        Product p1 = new Product("sausage");
        System.out.println(p1.getName());
        System.out.println(p1.getLocation());
        System.out.println(p1.getWeight());

        System.out.println();

        Product p2 = new Product("whale", 1000);
        System.out.println(p2.getName());
        System.out.println(p2.getLocation());
        System.out.println(p2.getWeight());
    }
}
