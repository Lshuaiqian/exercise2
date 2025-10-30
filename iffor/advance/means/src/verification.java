import java.util.Random;
import java.util.Scanner;
public class verification {
    public static void main(String[] args) {
        String m=v();//用一个变量接收,防止下面的比较语句与输出的验证码不同
       System.out.println(m);
       System.out.println("请输入验证码");
       Scanner sc = new Scanner(System.in);
       /*String input = sc.nextLine();
       if(input.equals(m)) {
           System.out.println("验证成功");
       }else{
           System.out.println("验证失败");
       }*/
        while(true){
            String input = sc.nextLine();
            if(input.equals(m)) {
                System.out.println("验证成功");
                break;
            }else{
                System.out.println("验证失败,请再次输入");
            }
        }
    }
    //一个生成验证码的方法
    public static String  v(){
        String result="";
        char[] chas=new char[52];//所有字母放在一个数组中
        for (int i = 0; i < chas.length; i++) {
            if (i<26){
                chas[i]=(char)(i+65);//通过强转ASCII码获得所有大写字母
            }else {
                chas[i]=(char)(i+97-26);//获得所有小写字母
            }
        }
        Random r=new Random();
        for (int i = 0; i <4 ; i++) {
            int random=r.nextInt(chas.length);
            result=result+chas[random];//把四个随机索引到的字母拼接
        }
        Random r2=new Random();//随机获取一个0到9的数字
        int number=r2.nextInt(10);
        //如何把这个随机数字与字母拼接
        result=result+(char)('0'+number);
        //打乱数字和字母(让数字不是一直在最后一位)
        char[] v1=result.toCharArray();
        Random r3=new Random();
        /*for (int i = 0; i < v1.length; i++) {
            int random=r3.nextInt(v1.length);
            String temp=v1[i];  不是string类型,是char
            v1[i]=v1[random];
            v1[random]=temp;

        }
        for (int i = 0; i < v1.length; i++) {
            return v1[i];  应该返回一个字符串

        }*/
        for (int i = 0; i < v1.length; i++) {
            int random = r3.nextInt(v1.length);
            char temp = v1[i];
            v1[i] = v1[random];
            v1[random] = temp;
        }
        return new String(v1);
    }
}
