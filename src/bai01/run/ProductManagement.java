package bai01.run;

import bai01.ra.bussinessLmp.Catalog;
import bai01.ra.bussinessLmp.Product;
import utils.InputMethods;

import java.util.Scanner;

public class ProductManagement {
    static Scanner sc = new Scanner(System.in);
    static int curIndex = 0;
    static final Catalog[] arrCatalog = new Catalog[100];
    static final Product[] arrProduct = new Product[100];

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n" +
                    "****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "\t\t\t1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục\n" +
                    "\t\t\t2. Nhập số sản phẩm và nhập thông tin các sản phẩm \n" +
                    "\t\t\t3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)\n" +
                    "\t\t\t4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                    "\t\t\t5. Thoát " +
                    "\nNhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputCatalog();
                    break;
                case 2:
                   inputProduct();
                    break;
                case 3:
                    sortByPrice();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc!!!");
                    System.exit(0);
                default:
                    System.out.println("Nhập lại lựa chọn: ");
            }
        }
    }

    public static void inputCatalog() {
        int CatalogSize;
        System.out.print("Nhập số danh mục mà bạn muốn điền thông tin: ");
        while (true) {
            CatalogSize = InputMethods.getInteger();
            if (CatalogSize > 0) {
                break;
            } else {
                System.err.println("Số lượng danh mục phải lớn hơn 0");
            }
        }

        for (int i = 0; i < CatalogSize; i++) {
            System.out.printf("Nhập thông tin sách thứ %d: \n", i + 1);
            arrCatalog[curIndex] = new Catalog();
            arrCatalog[curIndex].increaseId(arrCatalog, curIndex);
            arrCatalog[curIndex].inputData();
            curIndex++;
            System.out.println("--------------------");
        }
    }

    public static void inputProduct() {
        int ProductSize;
        System.out.print("Nhập số danh mục mà bạn muốn điền thông tin: ");
        while (true) {
            ProductSize = InputMethods.getInteger();
            if (ProductSize > 0) {
                break;
            } else {
                System.err.println("Số lượng danh mục phải lớn hơn 0");
            }
        }

        for (int i = 0; i < ProductSize; i++) {
            System.out.printf("Nhập thông tin sách thứ %d: \n", i + 1);
            arrProduct[curIndex] = new Product();
            arrProduct[curIndex].increaseId(arrProduct, curIndex);
            arrProduct[curIndex].inputData();
            curIndex++;
            System.out.println("--------------------");
        }
    }
    public static void sortByPrice() {
        for (int i = 0; i < curIndex - 1; i++) {
            for (int j = i + 1; j < curIndex; j++) {
                if (arrProduct[i].getExportPrice() < arrProduct[j].getExportPrice()) {
                    Product temp = arrProduct[i];
                    arrProduct[i] = arrProduct[j];
                    arrProduct[j] = temp;
                }
            }
        }

        System.out.println("Đã sắp xếp sách theo lợi nhuận giam dần" );
    }
    public static void searchProduct() {
        int index = -1;
        int count = 0;
        System.out.print("Nhập tên sách mà bạn muốn tìm: ");
        String inputText = InputMethods.getString();

        for (int i = 0; i < curIndex; i++) {
            if (arrProduct[i].getProductName().toLowerCase().contains(inputText.toLowerCase())) {
                index = i;
                arrProduct[i].displayData();
                count++;
                System.out.println("--------------------");
            }
        }
        if (index == -1) {
            System.out.printf("Không tìm thấy SP nào có tên hay mô tả là \"%s\"\n", inputText);
        } else {
            System.out.printf("Đã tìm thấy %d SP có tên hay mô tả là \"%s\"\n", count, inputText);
        }
    }

}
