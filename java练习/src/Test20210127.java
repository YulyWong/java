import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class Test20210127 {
//    public static void main(String[] args){
//        System.out.println("Hello World");
//    }

//    public static void main(String[] args) {
//        int a;
//
//        a = 10;
//        System.out.println(a);
//
//        a = 20;
//        System.out.println(a);
//
//    }
//public static void main(String[] args) {
////    byte a = 10;
////    byte b = 2;
////    byte c = a + b;
////
//
//
//    int num = 10;
//    String str1 = num + "";
//    String str2 = String.valueOf(num);
//
//    System.out.println(str1);
//    System.out.println(str2);
//}

    //判定是否闰年
//    public static void main(String[] args) {
//        int year = 2000;
//        if(year % 100 == 0){
//            //判定是否世纪闰年
//            if(year % 400 == 0){
//                System.out.println("是闰年");
//            }
//            else{
//                System.out.println("不是闰年");
//            }
//        }
//        else{
//            //判定普通闰年
//            if(year % 4 == 0){
//                System.out.println("是闰年");
//            }
//            else{
//                System.out.println("不是闰年");
//            }
//        }
//    }

    //判定周几
//    public static void main(String[] args) {
//        int day = 2;
//        switch(day){
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            case 4:
//                System.out.println("星期四");
//                break;
//            case 5:
//                System.out.println("星期五");
//                break;
//            case 6:
//                System.out.println("星期六");
//                break;
//            case 7:
//                System.out.println("星期天");
//                break;
//            default:
//                System.out.println("输入有误");
//        }
//    }

    //打印1-10
//    public static void main(String[] args) {
//        int x = 1;
//        while(x <= 10){
//            System.out.println(x);
//            x++;
//        }
//    }


    //计算1！+2！+3！+4！+5！
//    public static void main(String[] args) {
//        int num = 1;
//        int sum = 0;
//        int temp = 1;
//        while(num <= 5){
//            temp *= num;
//            sum += temp;
//            num++;
//        }
//        System.out.println(sum);
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
//        scanner.nextDouble();
//        //读取到空白符就结束
//        scanner.next();
//        //读到换行符
//        scanner.nextLine();


    //猜数字游戏
//    public static void main(String[] args) {
//        Random random = new Random(); // 默认随机种子是系统时间
//        Scanner sc = new Scanner(System.in);
//        int toGuess = random.nextInt(100);
//        System.out.println("toGuess:" + toGuess);
//        while(true){
//            System.out.println("请输入要输入的数字：（1-100）");
//            int num = sc.nextInt();
//            if(num < toGuess){
//                System.out.println("低了");
//            }
//            else if(num < toGuess){
//                System.out.println("高了");
//            }
//            else{
//                System.out.println("猜对了");
//                break;
//            }
//        }
//        sc.close();
//    }


    //求0-999之间的所有水仙花数并输出

//    public static void main(String[] args) {
//
//        for(int i = 0; i < 999; i++) {
//            if(isNarcissusNum(i)){
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean isNarcissusNum(int num) {
//        //取出个位
//        int ge = num % 10;
//        //取出十位
//        int tmp = num / 10;
//        int shi = tmp % 10;
//        //取出百位
//        tmp /= 10;
//        int bai =tmp % 10;
//
//        //判断立方和是否相等
//        if(power(ge) + power(shi) + power(bai) == num)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//
//    }
//
//    public static int power(int i) {
//        return i * i * i;
//    }

    //猜数字
//    public static void main(String[] args) {
//        while (true){
//            int choice = menu();
//            if(choice == 1){
//                game();
//            } else if (choice == 0){
//                System.out.println("Goodbye");
//                break;
//            } else {
//                System.out.println("输入有误");
//                continue;
//            }
//        }
//
//}
//
//    public static void game() {
//        //生成一个1-99之间的随机数
//        Random random = new Random();
//        int toGuess = random.nextInt(100);
//        //猜数字
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入要猜的数字：");
//            int num = scanner.nextInt();
//            //进行比较
//            if (num < toGuess) {
//                System.out.println("低了");
//            } else if (num > toGuess) {
//                System.out.println("高了");
//            } else {
//                System.out.println("猜对了");
//                break;
//            }
//        }
//    }
//
//    public static int menu() {
//        System.out.println("===================");
//        System.out.println("=====1.开始游戏=====");
//        System.out.println("=====0.退出游戏=====");
//        System.out.println("===================");
//        System.out.println("====请输入选择：=====");
//        System.out.println("===================");
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        return choice;
//    }


    

}

