package com.valdir.bookstore.mappers;

import com.valdir.bookstore.domain.Author;
import com.valdir.bookstore.dtos.AuthorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDto (Author author);
}
