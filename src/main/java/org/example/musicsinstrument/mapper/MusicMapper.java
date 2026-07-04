package org.example.musicsinstrument.mapper;
import lombok.Builder;
import org.example.musicsinstrument.dto.MusicCreateDto;
import org.example.musicsinstrument.dto.MusicResponse;
import org.example.musicsinstrument.entity.Music;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring"
       //builder = @Builder(disableBuilder = true)
)
public interface MusicMapper {
    MusicMapper INSTANCE = Mappers.getMapper(MusicMapper.class);

    Music toEntity(MusicCreateDto dto);

    @Mapping(source = "brand.id", target = "brandId")
    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "country.id", target = "countryId")
    MusicResponse todto (Music music);

    List<MusicResponse> toDtoList (List<Music> musics);

    Music toDelete(Long id);

    Music updateMusic(Music music);

    Music findById(Long id);
}
