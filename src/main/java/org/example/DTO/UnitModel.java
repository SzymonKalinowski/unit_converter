package org.example.DTO;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitModel {
    @SerializedName("unitModel")
    private String[] unitModel = new String[2];
}
