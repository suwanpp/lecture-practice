package com.ohgiraffers.section01.common;

public class MenuDTO {

    private int sequence;
    private String name;
    private int price;

    public MenuDTO (){}

    public MenuDTO(int sequence, String name, int price) {
        this.sequence = sequence;
        this.name = name;
        this.price = price;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "sequence=" + sequence +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
