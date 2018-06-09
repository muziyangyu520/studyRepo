package com.li.hello.commons.enums;

public enum CodeEnum implements EnumFormat{
    A("1243");

    private String name;

    CodeEnum(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getKey() {
        return null;
    }
}
