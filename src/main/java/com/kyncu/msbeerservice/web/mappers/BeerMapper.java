package com.kyncu.msbeerservice.web.mappers;

import com.kyncu.msbeerservice.domain.Beer;
import com.kyncu.msbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto dto);

    BeerDto beerToBeerDto(Beer beer);
}
