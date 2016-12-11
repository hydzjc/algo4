package oneoneone;

import jdk.internal.cmm.SystemResourcePressureImpl;

/**
 * Created by hyd on 2016/12/10.
 * 1.1.14
 * 编写一个静态方法lg(),接受一个整形参数N，返回不大于log2N的最大整数。
 */

public class bigestLgN {

    public static int getLog2N(int N){
        int i = 0;
        while((N=N>>1)>=1)
            i++;
        return i;
    }

    public static void main (String[] args){
        //int  N = args[0];
        int N=7;
         int MAX = 10000;

        System.out.print("log2"+N+": "+getLog2N(N)+"\n");

    }
}
