package com.example.a22.myapplication.db;
import org.litepal.crud.DataSupport;
/**
 * Created by stu on 2019/6/17.
 */

public class Province extends DataSupport {
    private int id;  //实体类具有的id
    private String provinceName;  //省份的名字
    private int provinceCode;  //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
