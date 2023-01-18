package com.carmona.admin.catalog.application;

import com.carmona.admin.catalog.domain.category.Category;

public class UseCase {

    public Category execute(){
        return new Category();
    }
}