package sort.MergeSort.InPlaceMergeSort;

public class FromBottomInPlaceMergeSort extends InPlaceMergeSort{
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        tmp = new Comparable[length];
        for (int size = 1; size < length; size += size){//每次归并2*size长度的数组
            for (int low = 0; low < length - size; low += size + size){
                merge(a, low, low + size -1 ,Math.min(low + size + size -1, length - 1));//使用Math.min防止最后一组溢出
            }
        }
    }
}
