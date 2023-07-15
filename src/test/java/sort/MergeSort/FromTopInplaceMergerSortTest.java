package sort.MergeSort;

import org.junit.Test;
import sort.MergeSort.InPlaceMergeSort.FromTopInPlaceMergeSort;
import sort.Sort;

public class FromTopInplaceMergerSortTest {

    Sort sort = new FromTopInPlaceMergeSort();

    @Test
    public void test1(){
        Integer[] a = {12,23,2,3,3,4,23,234,23,3};
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
