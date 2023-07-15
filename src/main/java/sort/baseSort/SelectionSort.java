package sort.baseSort;

import sort.Sort;
/*
* 选择排序
* 平均/最优/最差时间复杂度：比较O(n*n/2)+交换O(n) = O(n*n)
* 空间复杂度：O(1)
* 特点：1.运行时间与输入无关 2.数据移动最少
* */
public class SelectionSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        for(int i = 0; i < length; i++){
            int min = i;
            for(int j = i+1; j < length; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
