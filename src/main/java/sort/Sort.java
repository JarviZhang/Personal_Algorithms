package sort;
/*
* 排序算法的模板
* */
public abstract class Sort {
    public abstract void sort(Comparable[] a);

    protected boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void show(Comparable[] a){
        if (a.length == 0){
            System.out.println("a == null");
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]:" + a[i]);
        }
    }
}
