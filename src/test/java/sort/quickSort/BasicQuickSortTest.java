package sort.quickSort;

import org.junit.Test;
import sort.Sort;

public class BasicQuickSortTest {
    Sort sort = new BasicQuickSort();
    @Test
    public void test1(){
        Integer[] a = {23,32,2,23,4,45,3,2,34,3,45,656};
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
