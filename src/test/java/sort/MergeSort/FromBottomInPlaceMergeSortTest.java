package sort.MergeSort;

import org.junit.Test;
import sort.MergeSort.InPlaceMergeSort.FromBottomInPlaceMergeSort;
import sort.Sort;

public class FromBottomInPlaceMergeSortTest {
    Sort sort = new FromBottomInPlaceMergeSort();
    @Test
    public void test1(){
        Integer[] a = {12,12,32,23,43,3,33,2,3,343};
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
