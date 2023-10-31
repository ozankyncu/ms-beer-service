package com.kyncu.msbeerservice.events;

import com.kyncu.msbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@RequiredArgsConstructor
public class BeerEvent implements Serializable {
    static final long serialVersionUID = 594412047893665730L;

    private final BeerDto beerDto;
}
