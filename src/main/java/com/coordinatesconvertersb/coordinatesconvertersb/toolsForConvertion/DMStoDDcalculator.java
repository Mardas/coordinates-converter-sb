package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;

import java.util.ArrayList;
import java.util.List;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DDcoordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DMScoordinates;
public class DMStoDDcalculator {
    public List<DDcoordinates> calculateDMStoDDcoordinates (List<DMScoordinates> list_of_DMSCoordinates){
        List<DDcoordinates> ddCoordinatesList = new ArrayList<>();
        for(int i = 0; i < list_of_DMSCoordinates.size(); i++){
            Double latitude = list_of_DMSCoordinates.get(i).getDmsLatitude()
                    .getDegrees()
                    + Double.valueOf(list_of_DMSCoordinates.get(i).getDmsLatitude().getMinutes())/60
                    + Double.valueOf(list_of_DMSCoordinates.get(i).getDmsLatitude().getSeconds())/3600;
            Double longitude = list_of_DMSCoordinates.get(i).getDmsLongitude()
                    .getDegrees()
                    + Double.valueOf(list_of_DMSCoordinates.get(i).getDmsLongitude().getMinutes())/60
                    + Double.valueOf(list_of_DMSCoordinates.get(i).getDmsLongitude().getSeconds())/3600;

            DDcoordinates ddCoordinates = new DDcoordinates();
            ddCoordinates.setLatitude(latitude);
            ddCoordinates.setLongitude(longitude);

            ddCoordinatesList.add(ddCoordinates);
        }
        return ddCoordinatesList;
    }
}
