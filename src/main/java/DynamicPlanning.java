//动态规划
public class DynamicPlanning {

    /**
     * 一般递归
     * @param n
     * @return 第n项斐波那契数列数值
     */
    public static int getFib(int n) {
        if (n == 1 || n == 2) return 1;
        else return getFib(n-1) + getFib(n-2);
    }

    /**
     * 动态规划（填表法）
     * @param n
     * @return第n项斐波那契数列数值
     */
    public static int getFibByDP(int n) {
        int fib[] = new int[n];  //构造一维数组来存储中间数据
        fib[0] = fib[1] = 1;    //已知数据先填入表（一维数组）中
        for(int i=2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];  //依次构造表中的剩余项
        }
        return fib[n-1];  //返回第n项数列值
    }

    /**
     * 动态规划（备忘录法）
     * @param fib[]: 利用该数组来充当备忘录
     * @param n
     * @return 第n项斐波那契数列数值
     */
    public static int getFibByDP1(int[] fib,int n) {

        if(n == 1) fib[n-1] = 1;   //已知条件先存入备忘录
        if(n == 2) fib[n-1] = 1;  //已知条件先存入备忘录
        if (fib[n-1] > 0) return fib[n-1];  //查看备忘录中该项数列是否已经计算（初值为0；如果计算过，那么值大于0,直接返回该值；否则去递归调用）
        else fib[n-1]= getFibByDP1(fib,n-1) + getFibByDP1(fib,n-2); //递归调用之后，把该值存入备忘录
        return fib[n-1];
    }
}
