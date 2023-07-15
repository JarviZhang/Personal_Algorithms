package sort.baseSort;

import sort.Sort;
/*
* 插入排序
* 平均时间复杂度：比较O(n*n/4) + 交换O(n*n/4) = O(n*n)
* 最优时间复杂度：比较O(n) + 移动O(1) = O(1)
* 最差时间复杂度：比较O(n*n/2) + 移动O(n) = O(n*n)
* * 空间复杂度：O(1)
* 特点：部分有序时效率很高
* */
public class InsertitionSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        for(int i = 0; i < length; i++){
            for(int j = i; j > 0 && less(a[j], a[j - 1]); j--){
                exch(a, j, j-1);
            }
        }
    }
}
