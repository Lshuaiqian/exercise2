import java.util.Random;
import java.util.Scanner;

public class loop2random {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(27);
        int count=0;//要写在循环外面,不然会重复赋值为0,无法触发count=3的条件//
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想猜的数");



        while (true) {
            int guess=sc.nextInt();//用户要输入多次数据,所以要写在循环里面//

            count++;
            if(count==3){
                System.out.println("你猜对了");
                break;//保底机制

            }

            if (number==guess) {
                System.out.println("你猜对了");
                break;
            }else{
                System.out.println("请在尝试一次");
            }



        }


    }
}
