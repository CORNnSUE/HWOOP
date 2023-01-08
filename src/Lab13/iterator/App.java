package Lab13.iterator;

public class App {

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add ("Apple")
                .add("Banana")
                .add("Orange")
                .add("Grape")
                .add("Coconut")
                .add("lemon")
                .add("Melon");
        Iterator it = productCatalog.getIterator();
        while (it.hasNext()){
            System.out.println((String)it.next() );
        }
    }
}
