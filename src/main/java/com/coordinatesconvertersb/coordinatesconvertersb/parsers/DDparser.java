package com.coordinatesconvertersb.coordinatesconvertersb.parsers;

import java.util.ArrayList;
import java.util.List;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DDcoordinates;

public class DDparser {
    public List<DDcoordinates> parseDDcoordinates (String[][] table_of_coordinates) {
        Double latitude;
        Double longitude;

        List<DDcoordinates> ddCoordinatesList = new ArrayList<>();
        for (int row = 0; row < table_of_coordinates.length; row++) {
            latitude = Double.parseDouble(table_of_coordinates[row][0]);
            longitude = Double.parseDouble(table_of_coordinates[row][1]);

            DDcoordinates ddCoordinates = new DDcoordinates();

            ddCoordinates.setLatitude(latitude);
            ddCoordinates.setLongitude(longitude);

            ddCoordinatesList.add(ddCoordinates);
        }
        return ddCoordinatesList;
    }
}
