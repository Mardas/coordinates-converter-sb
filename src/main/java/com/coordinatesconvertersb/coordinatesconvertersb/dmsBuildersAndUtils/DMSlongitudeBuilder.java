package com.coordinatesconvertersb.coordinatesconvertersb.dmsBuildersAndUtils;

import com.coordinatesconvertersb.coordinatesconvertersb.model.DMSlongitude;
import org.springframework.stereotype.Component;

@Component
public class DMSlongitudeBuilder {
    public DMSlongitude dmsLongitude;

    public DMSlongitudeBuilder (){
        dmsLongitude = new DMSlongitude();
    }

    public DMSlongitudeBuilder degrees (Integer d){
        dmsLongitude.setDegrees(d);
        return this;
    }

    public DMSlongitudeBuilder minutes (Integer m) {
        dmsLongitude.setMinutes(m);
        return this;
    }

    public DMSlongitudeBuilder seconds (Double s){
        dmsLongitude.setSeconds(s);
        return this;
    }

    public DMSlongitude buildDMSlongitude(){
        return dmsLongitude;
    }
}
