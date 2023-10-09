package bai02;

import utils.InputMethods;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {

    static Scanner sc = new Scanner(System.in);
    //    static Stack<String> stack = new Stack<>();
    static String inputText = "";

    public static void main(String[] args) {

        do {
            System.out.println("\n" +
                    "****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát\n" +
                    "Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại:");

            }
        } while (true);
    }

    public static void case1() {
        System.out.print("Nhập câu: ");
        inputText = InputMethods.getString();
        System.out.println("Câu vừa nhập: " + inputText);
    }

    public static void case2() {
        Stack<String> stack = new Stack<>();
        String[] arrText = inputText.split(" ");
        for (int i = 0; i < arrText.length; i++) {
            stack.push(arrText[i]);
        }
        System.out.println("Câu đảo ngược :");
        String daoNguoc = "";
        for (int i = 0; i < arrText.length; i++) {
            daoNguoc += stack.pop() + " ";
        }
        System.out.println(daoNguoc);
    }
}
