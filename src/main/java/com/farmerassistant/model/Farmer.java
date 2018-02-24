package main.java.com.farmerassistant.model;

import java.util.Date;

public class Farmer {
    private Long farmerId;

    private String farmerName;

    private String farmerTel;

    private String farmerRealname;

    private String farmerEmail;

    private Integer farmerAge;

    private String farmerDesc;

    private String country;

    private String province;

    private String city;

    private String towns;

    private String detailaddress;

    private String farmerIdcard;

    private String farmerLicense;

    private Date createTime;

    private Date updateTime;

    private Boolean isdeleted;

    public Long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(Long farmerId) {
        this.farmerId = farmerId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName == null ? null : farmerName.trim();
    }

    public String getFarmerTel() {
        return farmerTel;
    }

    public void setFarmerTel(String farmerTel) {
        this.farmerTel = farmerTel == null ? null : farmerTel.trim();
    }

    public String getFarmerRealname() {
        return farmerRealname;
    }

    public void setFarmerRealname(String farmerRealname) {
        this.farmerRealname = farmerRealname == null ? null : farmerRealname.trim();
    }

    public String getFarmerEmail() {
        return farmerEmail;
    }

    public void setFarmerEmail(String farmerEmail) {
        this.farmerEmail = farmerEmail == null ? null : farmerEmail.trim();
    }

    public Integer getFarmerAge() {
        return farmerAge;
    }

    public void setFarmerAge(Integer farmerAge) {
        this.farmerAge = farmerAge;
    }

    public String getFarmerDesc() {
        return farmerDesc;
    }

    public void setFarmerDesc(String farmerDesc) {
        this.farmerDesc = farmerDesc == null ? null : farmerDesc.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getTowns() {
        return towns;
    }

    public void setTowns(String towns) {
        this.towns = towns == null ? null : towns.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getFarmerIdcard() {
        return farmerIdcard;
    }

    public void setFarmerIdcard(String farmerIdcard) {
        this.farmerIdcard = farmerIdcard == null ? null : farmerIdcard.trim();
    }

    public String getFarmerLicense() {
        return farmerLicense;
    }

    public void setFarmerLicense(String farmerLicense) {
        this.farmerLicense = farmerLicense == null ? null : farmerLicense.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}