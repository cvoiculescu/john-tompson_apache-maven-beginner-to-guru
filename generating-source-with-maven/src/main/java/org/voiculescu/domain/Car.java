package org.voiculescu.domain;

import lombok.Data;

@Data
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;
}
