public class Factorial {
    public static void main(String[] args) {
        int factorial=1;
        int num=5;
        while(num>1){
            factorial=factorial*num;
            num--;
        }
        System.out.println(factorial);
    }
}