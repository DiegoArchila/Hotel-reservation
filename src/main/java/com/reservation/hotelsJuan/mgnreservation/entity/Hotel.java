package com.reservation.hotelsJuan.mgnreservation.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "Hotels")
public class Hotel {

    @Id
    @Column(name = "id", length = 50)
    private String id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "numberSuits")
    private int numberSuits;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "dateInit")
    private Date dateInit;
}







