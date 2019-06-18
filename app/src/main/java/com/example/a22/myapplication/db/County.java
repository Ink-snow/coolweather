package com.example.a22.myapplication.db;
import org.litepal.crud.DataSupport;
/**
 * Created by stu on 2019/6/17.
 */

public class County extends DataSupport {
    private int id;  //实体类具有的id
    private String countyName;  //县的名字
    private String weatherId;
    private int cityId;

    public int getCountyId() {
        return id;
    }

    public void setCountyId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
