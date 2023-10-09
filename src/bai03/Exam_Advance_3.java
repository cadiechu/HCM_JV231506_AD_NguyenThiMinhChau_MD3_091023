package bai03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    static Scanner sc = new Scanner(System.in);
    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n" +
                    "****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                    "2. Phụ huynh tiếp theo\n" +
                    "3. Thoát\n" +
                    "Nhập lựa chọn:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên phụ huynh: ");
                    String namePhuHuynh = sc.nextLine();
                    queue.add(namePhuHuynh);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Không có thông tin nào!");
                        break;
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                default:
                    System.out.println("Nhập lại:");
            }
        }
    }
}
