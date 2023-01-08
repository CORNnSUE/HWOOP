package pattern.iterator;

public class ProductIterator implements Iterator {
    private String[] productCatalog;
    private int length;
    private int currentPosition;

    public ProductIterator (String[] productCatalog, int length){
        this.productCatalog = productCatalog;
        this.length = length;
    }
    @Override
    public boolean hasNext() {
        return (this.currentPosition <= length - 1)
                && (this.currentPosition < this.productCatalog.length - 1);
    }

    @Override
    public Object next() {
        String currentProduct = this.productCatalog[currentPosition];
        currentPosition ++;
        return currentProduct;
        //or return this.productCatalog[currentPosition++
    }

    @Override
    public void remove(int index) {

    }
}
