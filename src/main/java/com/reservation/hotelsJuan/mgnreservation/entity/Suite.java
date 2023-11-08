package com.reservation.hotelsJuan.mgnreservation.entity;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Suites")
public class Suite {

        @Id
        @Column(name = "id", length = 50)
        private String id;

        @Column(name = "name", length = 255, nullable = false)
        private String name;

        @Column(name = "number")
        private int number;

        @Column(name = "status", length = 255)
        private String status;

        @Column(name = "hotelId", length = 50)
        private String hotelId;

        @Column(name = "price")
        private int price;

        @Column(name = "dateStatus")
        private Date dateStatus;

        @ManyToOne
        @JoinColumn(name = "hotelId", referencedColumnName = "id", insertable = false, updatable = false)
        private Hotel hotel;
}

