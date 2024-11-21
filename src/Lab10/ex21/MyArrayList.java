package Lab10.ex21;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;
    public MyArrayList () {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1){
            enlarge();
        }
        elements[size ++] = o;
    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }
    void enlarge(){
        Object[]tmp = new Object[elements.length*2];
        System.arraycopy(elements, 0, tmp, 0,elements.length);
        elements=tmp;
    }
}
