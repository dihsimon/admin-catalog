package com.carmona.admin.catalog.domain;

import com.carmona.admin.catalog.domain.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void testNewCategory(){
        Assertions.assertNotNull(new Category());
    }
}
