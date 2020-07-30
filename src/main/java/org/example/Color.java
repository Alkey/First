package org.example;

public enum Color {
    RED("красный"),
    GREEN("зеленый"),
    BLACK("черный"),
    WHITE("белый"),
    YELLOW("желтый");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
