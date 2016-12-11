package oneoneone;

/**
 * Created by hyd on 2016/12/10.
 */
public class Euclid {
    public static int getEuclid(int n,int m){
        if(m == 0 )return n;
        return getEuclid(m,n%m);
    }
     public static void main(String[] args){
        int n = 100;
        int m = 55;
        if (n <m ) {
            int a = n;
            n = m;
            m = a;
        }
        System.out.print(getEuclid(n,m));
     }
}
