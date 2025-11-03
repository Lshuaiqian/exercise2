import java.util.Scanner;

public class load {
    public static void main(String[] args) {
        String rightUsername="zhangsan";
        String rightPassword="a123456";
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=2;i++) {
            System.out.println("请输入用户名");
            String username = sc.nextLine();
            System.out.println("请输入你的密码");
            String password = sc.nextLine();
            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            }else {
                if(i==2){
                    System.out.println("你的账号已经被锁定");
                    break;
                }else{
                    System.out.println("账号或密码错误,请重新登录"+(2-i)+"次之后账号将锁定");
                }

            }
        }

    }
}
