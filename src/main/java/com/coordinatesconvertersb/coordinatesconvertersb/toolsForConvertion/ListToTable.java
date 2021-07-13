package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;

import java.util.List;

public class ListToTable {
    public String [][] convertToTable (List<String> list_of_coordinates){
        String[] table_of_readLine;
        String[][] table_of_coordinates = new String[list_of_coordinates.size()][2];
        for(int i=0; i<list_of_coordinates.size(); i++){
            table_of_readLine = list_of_coordinates.get(i).split(";");

            table_of_coordinates[i][0] = table_of_readLine[0];
            table_of_coordinates[i][1] = table_of_readLine[1];
        }
        return table_of_coordinates;
    }
}
