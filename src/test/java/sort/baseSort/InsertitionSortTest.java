package sort.baseSort;

import org.junit.Test;
import sort.Sort;

public class InsertitionSortTest {

    Sort sort = new InsertitionSort();

    @Test
    public void test1(){
        Integer[] a = {3,234,23,42,2,3,545,4};
        sort.sort(a);
        sort.show(a);
    }

    @Test
    public void test2(){
        Integer[] a = {};
        sort.sort(a);
        sort.show(a);
    }
}
