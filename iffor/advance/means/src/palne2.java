import java.util.Scanner;

public class palne2 {
    public static void main(String[] args) {

        System.out.println("请输入飞机票的原价");
        Scanner sc = new Scanner(System.in);
        int Price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入座位类型:i.头等舱 2.经济舱");
        int seat = sc.nextInt();
        if(month>=5 && month<=10){
            Price =seat(Price,seat,0.9,0.85);//直接填写数字,不能有赋值操作(如v1=0.9)//


        }else{
            Price=seat(Price,seat,0.7,0.65);

        }
        System.out.println(Price);
    }
    public static int seat(int Price, int seat,double v1,double v2){
        if(seat==1){
            Price=(int)(Price*v1);//强制转化为int,否则会报错//
        }else if(seat==2){
            Price=(int)(Price*v2);
        }
        return Price;
    }
}
