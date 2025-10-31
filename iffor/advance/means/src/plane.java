import java.util.Scanner;

public class plane {
    public static void main(String[] args) {
        double newPrice;
        System.out.println("请输入飞机票的原价");
        Scanner sc = new Scanner(System.in);
        double originalPrice = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入座位类型:i.头等舱 2.经济舱");
        int seat = sc.nextInt();
        if(month>=5 && month<=10){
            if(seat==1){
                newPrice = originalPrice*0.9;
            }else{
                newPrice = originalPrice*0.85;
            }


        }else{
            if(seat==1){
                newPrice = originalPrice*0.7;
            }else{
                newPrice = originalPrice*0.65;
            }


        }
        System.out.println(newPrice);



    }

}
