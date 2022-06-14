public class HelloJ {
    public static void main(String[] args) {
        System.out.print("hello java");
        int number = 1;
        int sum = 0;
        for(;number<100;number+=2){
            sum+=number;
        }
        System.out.print(sum);
    }
}
