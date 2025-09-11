package org.example;

import org.example.DTO.Units;
import org.example.Service.ParseJson;

public class Main {
    public static void main(String[] args) {
        ParseJson parser = new ParseJson();
        Units data = parser.parseJson();

        if (data != null) {
            System.out.println("Categories parsed: " + data.getUnits().keySet());
        } else {
            System.out.println("Parse failed");
        }
    }
}