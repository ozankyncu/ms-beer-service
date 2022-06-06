package com.kyncu.msbeerservice.services;

import com.kyncu.msbeerservice.web.model.BeerDto;
import com.kyncu.msbeerservice.web.model.BeerPagedList;
import com.kyncu.msbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
