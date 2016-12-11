package oneoneone;

/**
 * Created by hyd on 2016/12/10.
 */
public class binomial {
    public static double binomial(int N,int K, double p){
        if (N == 0 && K == 0 ) return 1.0;
        if (N < 0 || K < 0 ) return 0.0;
        return (1.0 - p) * binomial(N-1, K, p) + p*binomial(N-1,K-1,p);
    }
    public static double binomial2(int n, int k, double p){
        double[][] binform = new double[n+1][k+1];
        binform[0][0] = 1.0;
        for (int j = 1; j <= k; j++) {
            binform[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            binform[i][0] =(1 - p) * binform[i-1][0];
            for (int j = 1; j <= k; j++) {
                binform[i][j] = (1.0 - p) * binform[i - 1][j] + p * binform[i - 1][j - 1];
            }
        }
        return binform[n][k];
    }

    public static void main(String[] args){
        System.out.print("binomial: "+binomial(20,10,0.25));
        System.out.print("binomial2: "+binomial2(20,10,0.25));
    }
}
