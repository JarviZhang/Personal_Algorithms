package sort.baseSort;

import org.junit.Test;
import sort.Sort;

public class ShellSortTest {

    Sort sort = new ShellSort();

    @Test
    public void test1(){
        Integer[] a = {2,23,3,4,54,34,3,4,54,34343,32};
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
