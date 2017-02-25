package edu.eci.invPrototype.model;

import java.util.Date;

/**
 * Created by andre on 25/02/2017.
 */
public class Diagnostic {

    public Diagnostic() {
    }

    private Integer systolicPressure;
    private Integer diastolicPressure;
    private Integer bloodCholesterol;
    private Integer heartRate;
    private Date date;

    public Diagnostic(Integer systolicPressure, Integer diastolicPressure, Integer bloodCholesterol, Integer heartRate, Date date) {
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.bloodCholesterol = bloodCholesterol;
        this.heartRate = heartRate;
        this.date = date;
    }

    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public Integer getBloodCholesterol() {
        return bloodCholesterol;
    }

    public void setBloodCholesterol(Integer bloodCholesterol) {
        this.bloodCholesterol = bloodCholesterol;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
