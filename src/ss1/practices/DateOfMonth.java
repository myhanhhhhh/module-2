package ss1.practices;

import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang ma ban muon kiem tra");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 hoac 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = " 31 ";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30 3";
                break;
            default:
                daysInMonth = "";
                break;

        }
        if (!daysInMonth.equals("")) System.out.printf("thang %d co %s ngay!", month, daysInMonth);
        else System.out.println("khong tim thay ");
    }
}
