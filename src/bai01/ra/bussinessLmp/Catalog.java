package bai01.ra.bussinessLmp;

import bai01.ra.bussiness.IShop;
import utils.InputMethods;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public void increaseId(Catalog[] arrCatalog, int curIndex) {
        int maxId = 0;
        for (int i = 0; i < curIndex; i++) {
            if (arrCatalog[i].getCatalogId() > maxId) {
                maxId = arrCatalog[i].getCatalogId();
            }
        }
        this.catalogId = maxId + 1;
    }
    public Catalog() {
    }

    @Override
    public void inputData() {
        System.out.println("Nhập ID danh mục:");
        this.catalogId = InputMethods.getInteger();
        System.out.println("Nhập tên danh mục:");
        this.catalogName = InputMethods.getString();
        System.out.println("Độ ưu tiên:");
        this.priority = InputMethods.getInteger();
        System.out.println("Mô tả Danh mục:");
        this.descriptions = InputMethods.getString();
        System.out.println("Trạng thái danh mục, Có : true, Không có: phím bất kỳ:");
        this.catalogStatus = InputMethods.getBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("" +
                "\nCatalogy ID:" + catalogId +
                "\nCatalogy Name:" + catalogName +
                "\nPriority :" + priority +
                "\nDescriptions :" + descriptions +
                "\nStatus: " + (catalogStatus ? "Có sẵn" : "Không có sẵn"));
    }
}
