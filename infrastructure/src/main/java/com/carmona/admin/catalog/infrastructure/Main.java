package com.carmona.admin.catalog.infrastructure;

import com.carmona.admin.catalog.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}