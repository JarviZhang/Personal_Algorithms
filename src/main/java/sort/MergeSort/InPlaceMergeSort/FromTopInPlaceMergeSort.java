package sort.MergeSort.InPlaceMergeSort;
/*
* 自顶向下的原地归并排序
* */
public class FromTopInPlaceMergeSort extends InPlaceMergeSort{
    @Override
    public void sort(Comparable[] a) {
        tmp = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    public void sort(Comparable[] a, int low, int high){
        if (high <= low){
            return;
        }
        int mid = low + (high - low)/2;
        sort(a, low, mid);
        sort(a, mid+1, high);
        merge(a, low, mid, high);
    }
}
