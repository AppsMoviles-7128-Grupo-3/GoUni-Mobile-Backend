package com.studentconnect.backendgouni.profiles.domain.model.entities;

import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Driver;
import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Passenger;
import com.studentconnect.backendgouni.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Review extends AuditableModel {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // un conductor puede tener varias reviews
    @ManyToOne
    @Getter
    @JoinColumn(name="passenger_id", nullable = false)
    private Passenger passenger;

    // una review solo puede pertenecer a un conductor
    @ManyToOne
    @Getter
    @JoinColumn(name="driver_id", nullable = false)
    private Driver driver;

    @Getter
    private String comments;

    @Getter
    private int rating;


    public Review(){
    }

    public Review(Passenger passenger, Driver driver, String comments, int rating) {
        this.passenger = passenger;
        this.driver = driver;
        this.comments = comments;
        this.rating = rating;
    }


}
