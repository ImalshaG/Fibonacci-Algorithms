/**
 * Created by DELL on 2/27/2019.
 */
public class FiboAlgoNaive {

    public static void main(String args[]){
        FiboAlgoNaive fib1=new FiboAlgoNaive();
        System.out.println(fib1.getFib(2));
    }
        public int getFib(int num){
            if (num==2 || num==1){
                return 1;
            }else if (num==0){
                return 0;
            }
            else {
                return (getFib(num-1)+getFib(num-2));
            }
        }

}

