package sort.baseSort;

import org.junit.Test;
import sort.Sort;

import java.lang.annotation.Retention;

public class SelectionSortTest {

    Sort sort = new SelectionSort();

    @Test
    public void test1(){
        Integer[] a = {3,5,3,6,34,23,2,1};
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
