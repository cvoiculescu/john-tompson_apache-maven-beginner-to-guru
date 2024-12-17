package org.voiculescu.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.voiculescu.domain.Car;
import org.voiculescu.dto.CarDto;

@Mapper
public interface CarMapper {

    @Mapping(target = "seatCount", source = "numberOfSeats")
    CarDto toDto(Car car);

}
