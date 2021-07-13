package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;

import java.util.List;

import com.coordinatesconvertersb.coordinatesconvertersb.model.DDcoordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion.Utils;

public class DMStoDDconverter implements Converter {
    @Override
    public String convert(String DMScoordinates) {
        Utils dmsToDDutils = new Utils();
        List<DDcoordinates> list_ofDDcoordinates = dmsToDDutils.dmsToDDutils(DMScoordinates);
        String ddCoordinates = dmsToDDutils.convertListOfCoordinatesToString(list_ofDDcoordinates);
        return ddCoordinates;
    }
}
