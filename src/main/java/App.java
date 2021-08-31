import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Mời nhập số nguyên dương n >= 0");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Mời nhập lại số n >= 0");
        }

        if(n>12 || n<0 || n==0){
            System.out.println("Đây không phải là 1 tháng trong năm");
        }
        if(n>=1 && n<=12){
            int soNgay = getDaysOfMonth(n);
            System.out.println(soNgay);
        }


    }

    private static int getDaysOfMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                return 31;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            default: {
                return 30;
            }
        }

    }


}
