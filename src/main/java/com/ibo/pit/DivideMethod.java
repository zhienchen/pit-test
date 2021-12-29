package com.ibo.pit;//分治法

public class DivideMethod {


    /**
     * @param a 待求和数组名
     * @param l 待求和区间起始坐标
     * @param r 待求和区间终止坐标
     * @return 区间【l,r】的数组元素之和
     */
    public static int divideSum(int[] a, int l, int r) {
        if (l == r) return a[l];
        int m = (l + r) / 2; //取中间坐标；准备划分
        int leftSum = divideSum(a, l, m); //递归处理左半区间
        int rightSum = divideSum(a, m + 1, r);//递归处理右半区间

        return (leftSum + rightSum);  //合并两个子问题，得到原问题的解
    }

    /**
     * @param point 待求最近对的一维数组
     * @param l     待求有序区间起始坐标
     * @param r     待求有序区间终止坐标
     * @return 区间【l,r】上最近对的距离
     */
    public static int divideMinDist(int[] point, int l, int r) {

        if (r - l == 1) // 只有两个点时
            return point[r] - point[l];
        if (r - l == 2) {// 只有三个点时
            int dist1 = point[r] - point[l + 1];
            int dist2 = point[l + 1] - point[l];
            return getMin(dist1, dist1, dist2); //取两对的最小值
        }
        int m = (l + r) / 2;  //多于三个点时，就要划分区间

        //第一个子问题，递归求解
        int d1 = divideMinDist(point, l, m);

        //第二个子问题，递归求解
        int d2 = divideMinDist(point, m + 1, r);

        //第三个子问题，直接求解
        int d3 = point[m + 1] - point[m];

        //合并3个子问题的解(比较)，得到原问题的解
        return getMin(d1, d2, d3);

    }

    /**
     * @param a 待处理数组
     * @param l 待处理区间起始
     * @param r 待处理区间终止
     * @return 数组a在区间【l，r】上的最大子段和
     */
    public static int divideMaxSum(int[] a, int l, int r) {
        if (l == r) return a[l];
        int m = (l + r) / 2;//取中间坐标；准备划分

        //第一个子问题，递归求解
        int s1 = divideMaxSum(a, l, m);

        //第二个子问题，递归求解
        int s2 = divideMaxSum(a, m + 1, r);


        //第三个子问题，分成两部分leftS3,rightS3,分别蛮力求解
        int leftS3 = a[m];
        int tempS = leftS3;
        for (int i = m - 1; i >= 0; i--) {
            tempS += a[i];
            if (tempS > leftS3) leftS3 = tempS;
        }

        int rightS3 = a[m + 1];
        tempS = rightS3;
        for (int i = m + 2; i <= r; i++) {
            tempS += a[i];
            if (tempS > rightS3) rightS3 = tempS;
        }

        int s3 = leftS3 + rightS3;

        return getMax(s1, s2, s3); //合并3个子问题的解，得到原问题的解
    }


    /**
     * @param d1 第1个参数
     * @param d2 第2个参数
     * @param d3 第3个参数
     * @return (d1, d2, d3)的最小值
     */
    private static int getMin(int d1, int d2, int d3) {
        int min = d1;
        if (min > d2) min = d2;
        if (min > d3) min = d3;
        return min;

    }

    /**
     * @param s1 第1个参数
     * @param s2 第2个参数
     * @param s3 第3个参数
     * @return (s1, s2, s3)的最大值
     */
    private static int getMax(int s1, int s2, int s3) {
        int max = s1;
        if (max < s2) max = s2;
        if (max < s3) max = s3;
        return max;

    }
}
