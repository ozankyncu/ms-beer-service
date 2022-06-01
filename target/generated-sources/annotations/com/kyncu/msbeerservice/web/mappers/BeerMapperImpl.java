package com.kyncu.msbeerservice.web.mappers;

import com.kyncu.msbeerservice.domain.Beer;
import com.kyncu.msbeerservice.domain.Beer.BeerBuilder;
import com.kyncu.msbeerservice.web.model.BeerDto;
import com.kyncu.msbeerservice.web.model.BeerDto.BeerDtoBuilder;
import com.kyncu.msbeerservice.web.model.BeerStyleEnum;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-01T21:59:39+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class BeerMapperImpl implements BeerMapper {

    private final DateMapper dateMapper = new DateMapper();

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        if ( dto.getVersion() != null ) {
            beer.version( dto.getVersion().longValue() );
        }
        beer.createdDate( dateMapper.asTimestamp( dto.getCreatedDate() ) );
        beer.lastModifiedDate( dateMapper.asTimestamp( dto.getLastModifiedDate() ) );
        beer.beerName( dto.getBeerName() );
        if ( dto.getBeerStyle() != null ) {
            beer.beerStyle( dto.getBeerStyle().name() );
        }
        beer.upc( dto.getUpc() );
        beer.price( dto.getPrice() );

        return beer.build();
    }

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        beerDto.upc( beer.getUpc() );
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }
}
