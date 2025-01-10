package com.chandrika.hotel.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {
    @Id
    private String String;
    private String roomType;
    private String roomNumber;
    private Integer roomPrice;
    private Status Status;
    private String roomDescription;
    @ManyToOne
    @JsonIgnore
    private Hotel hotel;

}
