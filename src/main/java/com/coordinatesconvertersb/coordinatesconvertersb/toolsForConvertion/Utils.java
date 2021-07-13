package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;

import com.coordinatesconvertersb.coordinatesconvertersb.model.DDcoordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DMScoordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.parsers.DDparser;
import com.coordinatesconvertersb.coordinatesconvertersb.parsers.DMSparser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Utils {
    public List<DDcoordinates> dmsToDDutils (String DMScoordinates){

        String[] list = DMScoordinates.split("\\n");
        List<String> list_of_DMScoordinates = Arrays.asList(list);

        ListToTable listToTable = new ListToTable();
        String[][] table_of_coordinates = listToTable.convertToTable(list_of_DMScoordinates);

        DMSparser dmsParser = new DMSparser();
        List<DMScoordinates> list_ofDMSCoordinates = dmsParser.parseDMScoordinates(table_of_coordinates);

        DMStoDDcalculator dmsToDDcalculator = new DMStoDDcalculator();
        List<DDcoordinates> list_ofDDcoordinates = dmsToDDcalculator
                .calculateDMStoDDcoordinates(list_ofDMSCoordinates);

        return list_ofDDcoordinates;

    }

    public List<DMScoordinates> ddToDMSutils (String DDcoordinates){

        String[] list = DDcoordinates.split("\\n");
        List<String> list_of_DDcoordinates = Arrays.asList(list);

        ListToTable listToTable = new ListToTable();
        String[][] table_of_coordinates = listToTable.convertToTable(list_of_DDcoordinates);

        DDparser ddParser = new DDparser();
        List<DDcoordinates> list_of_DDCoordinates = ddParser.parseDDcoordinates(table_of_coordinates);

        DDtoDMScalculator ddToDMScalculator = new DDtoDMScalculator();
        List<DMScoordinates> list_ofDMScoordinates = ddToDMScalculator
                .calculateDDtoDMScoordinates(list_of_DDCoordinates);

        return list_ofDMScoordinates;
    }

    public String convertListOfCoordinatesToString (List<?> list){
        StringBuffer valueBuilder = new StringBuffer();
        String coordinates = new String();
        for(int i = 0; i < list.size(); i++) {
            String pairOfCoordinates = list.get(i).toString();
            valueBuilder.append(pairOfCoordinates);
            coordinates = valueBuilder.append("\n").toString();
        }
        return coordinates;
    }
}
