package org.example.musicsinstrument.mapper;

import org.example.musicsinstrument.dto.UserCreateDto;
import org.example.musicsinstrument.dto.UserResponse;
import org.example.musicsinstrument.entity.User;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring",builder = @Builder(disableBuilder = true))
public interface UserMapper {

    User toEntity(UserCreateDto dto);

    UserResponse toDto(User user);
}
