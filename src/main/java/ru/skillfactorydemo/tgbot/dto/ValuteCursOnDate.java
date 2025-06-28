package ru.skillfactorydemo.tgbot.dto;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ValuteCursOnDate")
@Data
public class ValuteCursOnDate {

    @XmlElement(name = "Vname")
    private String name;

    @XmlElement(name = "Vnom")
    private int nominal;

    @XmlElement(name = "Vcurs")
    private double course;

    @XmlElement(name = "Vcode")
    private String code;

    @XmlElement(name = "VchCode")
    private String chCode;
}
