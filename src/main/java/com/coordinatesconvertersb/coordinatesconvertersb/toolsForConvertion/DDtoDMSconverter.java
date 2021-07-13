package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;

import java.io.FileNotFoundException;
import java.util.List;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DMScoordinates;


public class DDtoDMSconverter implements Converter {
    @Override
    public String convert(String inputCoordinates)  {
        Utils ddtoDMSUtils = new Utils();
        List<DMScoordinates> list_of_DMScoordinates = ddtoDMSUtils.ddToDMSutils(inputCoordinates);
        String dmsCoordinates = ddtoDMSUtils.convertListOfCoordinatesToString(list_of_DMScoordinates);
        return dmsCoordinates;
    }
}
