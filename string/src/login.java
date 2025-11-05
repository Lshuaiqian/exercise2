import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc2 = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入  1.注册  2.登录 ");
            int chioce = sc2.nextInt();
            switch (chioce) {
                case 1:
                    System.out.println("请注册用户名:");
                    String rightUsername = sc.nextLine();
                    System.out.println("请设置密码:");
                    String rightPassword = sc.nextLine();
                    students.add(new Student(rightUsername, rightPassword));
                    break;
                case 2:
                    for (int i = 0; i <= 2; i++) {
                        System.out.println("请输入用户名");
                        String username = sc.nextLine();
                        System.out.println("请输入你的密码");
                        String password = sc.nextLine();
                        boolean isLogin = false;
                        for (Student student : students) {
                            if (student.matches(username, password)) {  // 使用实例方法
                                System.out.println("登录成功！");
                                isLogin = true;
                                break;
                            }
                        }
                        if (isLogin) {
                            break;
                        }
                       /*if(Student.matches(username,password)){
                           System.out.println("登录成功");
                           break;*/
                        else {
                            if (i == 2) {
                                System.out.println("你的账号已经被锁定");
                                break;
                            } else {
                                System.out.println("账号或密码错误,请重新登录" + (2 - i) + "次之后账号将锁定");
                            }

                        }
                    }
                    break;
                default:
                    return;
            }


        }

    }
}
//实例方法与静态方法?
//增强型for循环  只要求遍历