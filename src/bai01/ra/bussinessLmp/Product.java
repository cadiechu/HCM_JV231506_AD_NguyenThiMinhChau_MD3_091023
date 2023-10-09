package bai01.ra.bussinessLmp;

import bai01.ra.bussiness.IShop;
import utils.InputMethods;

public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;
    private float interest;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public Product() {
    }

    public void calProfit() {
        this.interest = (float) (this.exportPrice - this.importPrice);
    }

    public void exportPrice() {
        this.exportPrice = importPrice * RATE;
    }
    public void increaseId(Product[] arrProduct, int curIndex) {
        int maxId = 0;
        for (int i = 0; i < curIndex; i++) {
            if (arrProduct[i].getProductId() > maxId) {
                maxId = arrProduct[i].getProductId();
            }
        }
        this.productId = maxId + 1;
    }
    @Override
    public void inputData() {
        System.out.println("Nhập ID SP:");
        this.productId = InputMethods.getInteger();
        System.out.println("Nhập tên SP:");
        this.productName = InputMethods.getString();
        System.out.println("Tiêu đề SP:");
        this.title = InputMethods.getString();
        System.out.println("Gía nhập:");
        this.importPrice = InputMethods.getFloat();
        System.out.println("Trạng thái: Có sẳn - true, Không có sẳn - phím bất kỳ!");
        this.productStatus = InputMethods.getBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Product ID:" + productId +
                "Product Name:" + productName +
                "Tittle :" + title +
                "Descriptions :" + descriptions +
                "Import Price :" + importPrice +
                "ExportPrice :" + exportPrice +
                "Staus :" + (productStatus ? "Có sẳn" : "Không có sẳn!"));
    }

}
