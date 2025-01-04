package com.turkcell.cmm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "CRM",name = "PARAM")
public class Param {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paramId")
    private Long id;

    @Column(name = "paramName")
    private String paramName;

    @Column(name = "paramType")
    private String type; // NUMBER, STRING, DATE

    @Column(name = "paramValue")
    private String value; // String olarak tutulacak, gerektiğinde dönüştürülecek

    @Column(name = "paramCreateDate")
    private LocalDateTime createDate = LocalDateTime.now();

    @Column(name = "paramStatus")
    private Integer status;

}
