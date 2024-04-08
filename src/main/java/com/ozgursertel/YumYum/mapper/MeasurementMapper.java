package com.ozgursertel.YumYum.mapper;

import com.ozgursertel.YumYum.dtos.MeasurementDTO;
import com.ozgursertel.YumYum.entity.Measurement;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface MeasurementMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateMeasurementFromDto(MeasurementDTO dto, @MappingTarget Measurement entity);
}
