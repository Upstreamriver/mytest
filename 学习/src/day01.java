import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("输入你的月薪:");
            int a = scanner.nextInt();
            System.out.println("一年多少个月薪：");
            int b = scanner.nextInt();
            int c =a*b;
            System.out.println("你的年薪为："+c);
            System.out.println("输入88退出应用，输入66则重新计算");
            int d = scanner.nextInt();
            if (88==d){
                System.out.println("退出软件");
                break;
            }
            if (66==d){
                System.out.println("请重新输入数据");
                continue;
            }
        }
    }
}
