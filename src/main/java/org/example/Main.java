package org.example;

import java.util.Arrays;
import org.example.DTO.Category;
import org.example.DTO.UnitModel;
import org.example.DTO.Units;
import org.example.Service.ParseJson;
import org.example.Service.SelectNeededCategory;
import org.example.Service.SelectNeededUnit;

public class Main {
    public static void main(String[] args) {
        ParseJson parser = new ParseJson();
        Units data = parser.parseJson();

        SelectNeededCategory selectNeededCategory = new SelectNeededCategory();
        Category selectedCategory = selectNeededCategory.selectedCategory("Data");
        SelectNeededUnit unitModel = new SelectNeededUnit();
//        if (data != null) {
//            System.out.println("Categories parsed: " + data.getUnits().keySet());
//        } else {
//            System.out.println("Parse failed");
//        }

        System.out.println(selectedCategory);
        System.out.println(Arrays.toString(unitModel.selectUnit(selectedCategory,"MB").getUnitModel()));
    }
}