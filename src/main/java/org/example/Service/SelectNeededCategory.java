package org.example.Service;

import org.example.DTO.Category;
import org.example.DTO.Units;

public class SelectNeededCategory {
    ParseJson parser = new ParseJson();
    Units data = parser.parseJson();

    public Category selectedCategory(String categoryName){
        if(data.getUnits().get(categoryName) == null){
            throw new IllegalArgumentException("Category " + categoryName + " not found");
        }
        return data.getUnits().get(categoryName);
    }
}
