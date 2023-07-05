package ss3.practice;

import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student[] = {"hanh", "lien", "hau", "long", "thien"};
        System.out.println("nhap ten vao day");
        String input = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if(student[i].equals(input)){
                System.out.println("vi tri cua hoc sinh trong danh sach " + input + " la: " + i);
                isExist=true;
                break;
            }
            
        }
        if(!isExist){
            System.out.println("khong tim thay " + input + "trong danh sach");
        }
    }
}
