/**
 * Created by DELL on 2/27/2019.
 */
public class FiboEffAlgo {

    public int getFiboNum(int num){
        int arrayFib[]=new int[num+1];
        arrayFib[0]=0;
        arrayFib[1]=1;

        for (int i=2;i<=num;i++){
            arrayFib[i]=arrayFib[i-1]+arrayFib[i-2];
        }
        return arrayFib[num];

    }
}
