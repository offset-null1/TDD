import java.lang.Integer;
public class Factorial {
    public Integer getFactorial(int num) {

        if (num < 0) {
            return null;
        } else if(num == 0){
            return 1;
        } else {
            Integer res=1;
            for(int i=1; i<=num; i++){
                res *= i;
            }
            return res;
        }

    }
}
