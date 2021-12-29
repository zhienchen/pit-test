public class ReductionMethod {

    /**
     *
     * @param a 待求和数组a
     * @param l  待求和区间起始坐标
     * @param r   待求和区间终止坐标
     * @return    a[l] + ... + a[r]的和
     */
    public static int decreaseSum (int a[],int l,int r) {
        if(l==r) return a[l]; //出口
        else return decreaseSum(a,l,r-1) + a[r]; //规模减一后的子问题与原问题的映射
    }

    /**
     *
     * @param a  递增数组
     * @param l  待处理区间起始坐标
     * @param r  待处理区间终止坐标
     * @param k  待查找数据k
     * @return
     */
    public static int decreaseSearch(int a[],int l,int r,int k) {
        if(l>r) return -1; //出口
        int m = (l + r) /2; //分解
        if(a[m] == k) return m;
        else if(a[m] < k) return decreaseSearch(a,m+1,r,k);
        else  return decreaseSearch(a,l,m-1,k);

    }

}
