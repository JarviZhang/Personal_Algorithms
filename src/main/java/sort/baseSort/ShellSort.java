package sort.baseSort;

import sort.Sort;
/*
* 希尔排序
* 将数组分为h份,每份内部使用插入排序
* */
public class ShellSort extends Sort {
    //一开始的最大区间为大于length/3的数
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        int h = 1;
        //为了可以最快的接近length/3,如果4*h等就会有超过length的可能
        while(h < length/3){
            h = 3 * h + 1;
        }
        while(h >= 1){
            //将数组变成h有序
            for(int i = h; i < length; i++){
                //将a[i]插入到已经排好的a[i-h],a[i-2h]...中
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h){
                    exch(a, j, j-h);
                }
            }
            h /= 3;
        }
    }
}
