package oneoneone;

/**
 * Created by hyd on 2016/12/10.
 * 1.1.6
 */
public class exR1 {
    public static String exR1(int n){
        if (n<=0) return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }
    public static void main (String[] args){
        System.out.print(exR1(6));
    }
}
