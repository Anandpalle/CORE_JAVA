package com.jdbc;

public class JDBCdriverClass {
    public static void main(String[] args) {
        JDBCEstablishment jdbc = new JDBCEstablishment();
        jdbc.insert();
        jdbc.select();
    }
}