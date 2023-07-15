package sort.MergeSort.InPlaceMergeSort;

import sort.Sort;

/*
* 原地归并排序
* */
public abstract class InPlaceMergeSort extends Sort {

    protected Comparable[] tmp;
    //原地排序数组low---mid和数组mid+1---high
    protected void merge(Comparable[] a, int low, int mid, int high){
        //i j作为指针,将数组low---mid和数组mid+1---high排序到一起
        int i = low, j = mid + 1;
        for(int k = low; k <= high; k++){
            tmp[k] = a[k];
        }
        for(int k = low; k <= high; k++){
            if (i > mid){
                //左半边归并完毕
                a[k] = tmp[j++];
            } else if (j > high) {
                //右半边归并完毕
                a[k] = tmp[i++];
            } else if (less(tmp[j], tmp[i])) {
                //左右边都未归并完毕
                //右边小
                a[k] = tmp[j++];
            }else {
                //左右边都未归并完毕
                //左边小
                a[k] = tmp[i++];
            }
        }
    }
}
