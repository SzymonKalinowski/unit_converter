package org.example.Service;

import org.example.DTO.Category;
import org.example.DTO.UnitModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SelectNeededUnit {
    public UnitModel selectUnit(Category category, String unitName) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        UnitModel unitModel = null;
        for (Map.Entry<String, String> entry : category.entrySet()) {
            if (entry.getValue().equals(unitName) || entry.getKey().equals(unitName)) {
                unitModel = new UnitModel(new String[]{entry.getKey(), entry.getValue()});
            }
        }
        return unitModel;
    }
}