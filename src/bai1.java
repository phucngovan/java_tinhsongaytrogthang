import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count days");
        int month=sc.nextInt();
        String daysInMonth;
        switch (month) {
            case  2:
                daysInMonth="28 or 29";
                        break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth="31";
                break;
            case 4:
            case 6:
            case 11:
            case 9:
                daysInMonth="30";
                break;
                default:
                    daysInMonth="";
        }
        if(daysInMonth!="") {
            System.out.println("tháng" + month+ "có" + daysInMonth + "ngày");
        }else {
            System.out.println("invalid input");
        }
    }
}
