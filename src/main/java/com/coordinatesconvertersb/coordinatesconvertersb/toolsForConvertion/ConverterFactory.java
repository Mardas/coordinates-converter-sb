package com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion;
import com.coordinatesconvertersb.coordinatesconvertersb.model.CoordinatesFormat;

public class ConverterFactory {
    public Converter produce (CoordinatesFormat coordinatesFormat){
        if(CoordinatesFormat.DMS.equals(coordinatesFormat)){
            return new DMStoDDconverter();
        }
        if(CoordinatesFormat.DD.equals(coordinatesFormat)){
            return new DDtoDMSconverter();
        }
        return null;
    }
}
