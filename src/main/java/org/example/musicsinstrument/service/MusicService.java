package org.example.musicsinstrument.service;

import lombok.RequiredArgsConstructor;
import org.example.musicsinstrument.dto.MusicCreateDto;
import org.example.musicsinstrument.dto.MusicResponse;
import org.example.musicsinstrument.dto.MusicUpdateDto;
import org.example.musicsinstrument.entity.Category;
import org.example.musicsinstrument.entity.Music;
import org.example.musicsinstrument.mapper.MusicMapper;
import org.example.musicsinstrument.repository.CategoryRepository;
import org.example.musicsinstrument.repository.MusicRepository;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicService {
    private final MusicRepository musicRepository;
    private final MusicMapper musicMapper;
    private final CategoryRepository categoryRepository;

    public  MusicResponse addMusic( MusicCreateDto dto) {
        Music music = musicMapper.toEntity(dto);

        Music savedMusic = musicRepository.save(music);
        MusicResponse musicResponse = musicMapper.todto(savedMusic);
        return musicResponse;
    }

    public List<MusicResponse> getMusic() {
         return musicMapper.toDtoList(musicRepository.findAll());
    }

    public MusicResponse updateMusic(MusicUpdateDto dto) {
        Music music = musicRepository.findById(dto.getId()).orElseThrow(()->new NullPointerException("Don't data"));
        if (dto.getName() != null && !dto.getName().isBlank()) {
            music.setName(dto.getName());
        }
        if (dto.getBrandId() != null ){
            music.setName(dto.getBrandId().toString());
        }
        if (dto.getModel() != null && !dto.getModel().isBlank()){
            music.setModel(dto.getModel());
        }
        if (dto.getCategoryId() != null){
            Category category = categoryRepository.findById(dto.getCategoryId()).orElseThrow(()-> new RuntimeException("Category not found with id: "+dto.getCategoryId()));
            music.setCategory(category);
        }
        if (dto.getMaterial()!=null && !dto.getMaterial().isBlank()){
            music.setMaterial(dto.getMaterial());
        }
        if (dto.getPrice()!=null){
            music.setPrice(dto.getPrice());
        }
        if (dto.getDescription()!=null && !dto.getDescription().isBlank()){
            music.setDescription(dto.getDescription());
        }
        music.setUpdatedAt(Instant.now());
        return musicMapper.todto(music);
    }

//    public void deleteMusic(Long id) {
//       musicRepository.deleteById(id);
//    }
}
