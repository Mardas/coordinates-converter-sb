package com.coordinatesconvertersb.coordinatesconvertersb.service;

import java.util.Arrays;
import java.util.List;

import com.coordinatesconvertersb.coordinatesconvertersb.model.Coordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion.ConverterFactory;
import com.coordinatesconvertersb.coordinatesconvertersb.model.CoordinatesFormat;
import com.coordinatesconvertersb.coordinatesconvertersb.toolsForConvertion.Converter;
import org.springframework.stereotype.Service;

@Service
public class CoordinatesConverter {

    public Coordinates convertCoordinates (Coordinates coordinates) {
        String inputCoordinates = coordinates.getCoordinates();
        CoordinatesFormat coordinatesFormat = coordinates.getCoordinatesFormat();

        ConverterFactory converterFactory = new ConverterFactory();
        Converter converter = converterFactory.produce(coordinatesFormat);

        String outputCoordinates = converter.convert(inputCoordinates);
        coordinates.setCoordinates(outputCoordinates);
        if(coordinatesFormat.equals(CoordinatesFormat.DMS)){
            coordinates.setCoordinatesFormat(CoordinatesFormat.DD);
        }else {
            coordinates.setCoordinatesFormat(CoordinatesFormat.DMS);
        }
        return coordinates;
    }

    public List<String> convertedCoordinatesToList(String convertedCoordinates){
        //List<String> listOfConvertedCoordinates = new ArrayList<>();
        String[] list = convertedCoordinates.split("\\n");
        List<String> listOfConvertedCoordinates = Arrays.asList(list);
        return  listOfConvertedCoordinates;
    }

}
