package org.example.Service;

import com.google.gson.Gson;
import org.example.DTO.Units;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ParseJson {

    public Units parseJson() {
        Gson gson = new Gson();
        InputStream inputStream = ParseJson.class.getClassLoader().getResourceAsStream("units.json");

        if (inputStream == null) {
            throw new IllegalArgumentException("Resource not found: units.json");
        }
        try (Reader reader = new InputStreamReader(inputStream)) {
            Units units = gson.fromJson(reader, Units.class);
            System.out.println("Parsed object: " + units);
            return units;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}