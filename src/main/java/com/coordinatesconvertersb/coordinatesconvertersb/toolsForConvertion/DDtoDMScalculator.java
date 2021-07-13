package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DMScoordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DDcoordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.dmsBuildersAndUtils.DMSutils;
public class DDtoDMScalculator {
    public List<DMScoordinates> calculateDDtoDMScoordinates(List<DDcoordinates> list_of_DDCoordinates){
        List<DMScoordinates> dmsCoordinatesList = new ArrayList<>();
        for (int i = 0; i < list_of_DDCoordinates.size(); i++){
            Double latitude = list_of_DDCoordinates.get(i).getLatitude();
            Double longitude = list_of_DDCoordinates.get(i).getLongitude();

            Integer dLatitude = latitude.intValue();

            Double minutesLatitude = (latitude%latitude.intValue())*60;
            Integer mLatitude = minutesLatitude.intValue();

            Double sLatitude = (minutesLatitude%minutesLatitude.intValue())*60;
            BigDecimal bd = new BigDecimal(sLatitude).setScale(2, RoundingMode.HALF_UP);
            sLatitude = bd.doubleValue();

            Integer dLongitude = longitude.intValue();

            Double minutesLongitude = (longitude%longitude.intValue())*60;
            Integer mLongitude = minutesLongitude.intValue();

            Double sLongitude = (minutesLongitude%minutesLongitude.intValue())*60;
            bd = new BigDecimal(sLongitude).setScale(2, RoundingMode.HALF_UP);
            sLongitude = bd.doubleValue();

            DMSutils dmsUtils = new DMSutils();
            DMScoordinates dmsCoordinates = dmsUtils
                    .setDMScoordinates(dLatitude, mLatitude, sLatitude, dLongitude, mLongitude, sLongitude);
            dmsCoordinatesList.add(dmsCoordinates);
        }
        return dmsCoordinatesList;
    }
}
