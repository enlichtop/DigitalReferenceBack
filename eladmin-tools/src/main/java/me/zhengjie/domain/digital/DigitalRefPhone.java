package me.zhengjie.domain.digital;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * 数码参考主表配置类
 * @author enlich
 * @date 2020-12-26 12:57
 */
@Data
@Entity
@Table(name = "drphone", schema = "digital")
public class DigitalRefPhone {


    private String id;
    private String phonename;
    private String cpuname;
    private String brand;
    private String publishdate;
    private String os;
    private String gpu;
    private String networksystem;
    private Double screensize;
    private String details;
    private Integer refreshrate;
    private String screentype;
    private String cpuseries;
    private String cpumodel;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "phonename")
    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    @Basic
    @Column(name = "cpuname")
    public String getCpuname() {
        return cpuname;
    }

    public void setCpuname(String cpuname) {
        this.cpuname = cpuname;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "publishdate")
    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    @Basic
    @Column(name = "os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "gpu")
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Basic
    @Column(name = "networksystem")
    public String getNetworksystem() {
        return networksystem;
    }

    public void setNetworksystem(String networksystem) {
        this.networksystem = networksystem;
    }

    @Basic
    @Column(name = "screensize")
    public Double getScreensize() {
        return screensize;
    }

    public void setScreensize(Double screensize) {
        this.screensize = screensize;
    }

    @Basic
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "refreshrate")
    public Integer getRefreshrate() {
        return refreshrate;
    }

    public void setRefreshrate(Integer refreshrate) {
        this.refreshrate = refreshrate;
    }

    @Basic
    @Column(name = "screentype")
    public String getScreentype() {
        return screentype;
    }

    public void setScreentype(String screentype) {
        this.screentype = screentype;
    }

    @Basic
    @Column(name = "cpuseries")
    public String getCpuseries() {
        return cpuseries;
    }

    public void setCpuseries(String cpuseries) {
        this.cpuseries = cpuseries;
    }

    @Basic
    @Column(name = "cpumodel")
    public String getCpumodel() {
        return cpumodel;
    }

    public void setCpumodel(String cpumodel) {
        this.cpumodel = cpumodel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        DigitalRefPhone drphone = (DigitalRefPhone) o;
        return Objects.equals(id, drphone.id) && Objects.equals(phonename, drphone.phonename) && Objects.equals(cpuname, drphone.cpuname) && Objects.equals(brand, drphone.brand) && Objects.equals(publishdate, drphone.publishdate) && Objects.equals(os, drphone.os) && Objects.equals(gpu, drphone.gpu) && Objects.equals(networksystem, drphone.networksystem) && Objects.equals(screensize, drphone.screensize) && Objects.equals(details, drphone.details) && Objects.equals(refreshrate, drphone.refreshrate) && Objects.equals(screentype, drphone.screentype) && Objects.equals(cpuseries, drphone.cpuseries) && Objects.equals(cpumodel, drphone.cpumodel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phonename, cpuname, brand, publishdate, os, gpu, networksystem, screensize, details, refreshrate, screentype, cpuseries, cpumodel);
    }
}
