package sort.quickSort;

import sort.Sort;
/*
* 基本快速排序
* */
public class BasicQuickSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        sort(a,0, a.length - 1);
    }

    private void sort(Comparable[] a, int low, int high){
        if (high <= low){
            return;
        }
        //将a[low]排到正确的位置a[j]
        int j = partition(a, low, high);
        sort(a, low, j-1);
        sort(a, j+1, high);
    }

    private int partition(Comparable[] a, int low, int high){
        int i = low, j = high + 1;
        Comparable v = a[low];
        while(true){
            while (less(a[++i], v)){
                if (i == high){
                    break;
                }
            }
            while (less(v,a[--j])){
                if (j == low){
                    break;
                }
            }
            if (i >= j){
                break;
            }
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }
}
