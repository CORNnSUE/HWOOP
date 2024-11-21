package pattern.iterator;
public class ProductCatalog implements Iterable {
    private String[] productCatalog;
    private final int SIZE = 100;

    private int length;

    public ProductCatalog() {
        productCatalog = new String[SIZE];
        length = -1;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this.productCatalog, this.length);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public ProductCatalog add(String product) {
        if (this.length == this.productCatalog.length) {
            return this;
        }

        this.productCatalog[this.length + 1] = product;
        this.length = this.length + 1;
        return this;
        }
    }