package com.coordinatesconvertersb.coordinatesconvertersb.controller;


import com.coordinatesconvertersb.coordinatesconvertersb.model.Coordinates;
import com.coordinatesconvertersb.coordinatesconvertersb.model.CoordinatesFormat;
import com.coordinatesconvertersb.coordinatesconvertersb.service.CoordinatesConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class CoordinatesController  {

    private final CoordinatesConverter coordinatesConverter;

    public CoordinatesController(CoordinatesConverter coordinatesConverter){
        this.coordinatesConverter=coordinatesConverter;
    }

    @GetMapping("/")//convertCoordinates
    public String loadInputPageForCoordinates(Model model){
        model.addAttribute("coordinatesToConvert", new Coordinates());
        model.addAttribute("typeOfConvertion", CoordinatesFormat.values());
        return "convertCoordinates";
    }
    @PostMapping("/convertCoordinates")//convertCoordinates
    public String showConvertedCoordinats(@ModelAttribute Coordinates coordinates, Model model){
        coordinates=coordinatesConverter.convertCoordinates(coordinates);
        List<String> listOfOutputCoordinates = coordinatesConverter.convertedCoordinatesToList(coordinates.getCoordinates());
        model.addAttribute("coordinatesAfterConversion", listOfOutputCoordinates);
        model.addAttribute("formatAfterConversion", coordinates.getCoordinatesFormat());
        return "coordinatesAfterConvertion";
    }


}

