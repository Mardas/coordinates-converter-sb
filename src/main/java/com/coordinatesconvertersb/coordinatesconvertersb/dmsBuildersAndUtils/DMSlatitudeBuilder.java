package com.coordinatesconvertersb.coordinatesconvertersb.dmsBuildersAndUtils;
import com.coordinatesconvertersb.coordinatesconvertersb.model.DMSlatitude;
import org.springframework.stereotype.Component;

@Component
public class DMSlatitudeBuilder {
    public DMSlatitude dmsLatitude;

    public DMSlatitudeBuilder(){
        dmsLatitude = new DMSlatitude();
    }

    public DMSlatitudeBuilder degrees (Integer d){
        dmsLatitude.setDegrees(d);
        return this;
    }

    public DMSlatitudeBuilder minutes (Integer m){
        dmsLatitude.setMinutes(m);
        return this;
    }

    public DMSlatitudeBuilder seconds(Double s){
        dmsLatitude.setSeconds(s);
        return this;
    }

    public DMSlatitude builldDMSlatitude(){
        return dmsLatitude;
    }
}
