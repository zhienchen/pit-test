package com.ibo.pit;

public class ForceMethod {

    //百元买百鸡
    public static int getChicken() {
        int x, y, z;//分别表示母鸡、公鸡和小鸡的只数
        int count = 0;//解的个数
        int loopCount = 0;//执行次数
        for (x = 0; x <= 100; x++) {
            for (y = 0; y <= 100; y++) {
                for (z = 0; z <= 100; z++) {
                    loopCount++;
                    if ((x + y + z == 100) && (3 * x + 5 * y + z % 3 == 100)) {
                        count++;
                        System.out.println("母鸡" + x + "只；公鸡" + y + "只；小鸡" + z);
                    }
                }
            }

        }
        System.out.println("循环次数" + loopCount);
        if (count != 0) System.out.println("共有解" + count);
        else System.out.println("问题无解");
        return count;
    }

    //一维最近对
    public static int getMinDist(int[] point, int n) {
        int minDist = Integer.MAX_VALUE; //所求最近距离
        int tempDist = 0;  //某点对距离
        int minI = 0, minJ = 0; //最近对的两个端点序号
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j != i) {
                    tempDist = Math.abs(point[j] - point[i]);
                    if (tempDist < minDist) {
                        minDist = tempDist;
                        minI = i;
                        minJ = j;
                    }
                }

            }
        }
        System.out.println("最近的点对距离是" + minDist + " 对应序号为（" + minI + "," + minJ + ")");
        return minDist;
    }

    //最大子段和
    public static int getMaxSum(int[] a, int n) {
        int maxSum = Integer.MIN_VALUE; //所求最大子段和
        int tempSum = 0;  //某字段和
        int maxI = 0, maxJ = 0; //最大子段和对应的起点和终点序号
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tempSum = 0;
                for (int k = i; k <= j; k++) {
                    tempSum += a[k];
                    if (tempSum > maxSum) {
                        maxSum = tempSum;
                        maxI = i;
                        maxJ = k;
                    }

                }
            }
        }
        System.out.println("最大子段和是" + maxSum + " 对应子段序号为（" + maxI + "," + maxJ + ")");
        return maxSum;
    }

}
