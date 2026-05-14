package org.example.musicsinstrument.service;

import lombok.RequiredArgsConstructor;
import org.example.musicsinstrument.dto.MusicCreateDto;
import org.example.musicsinstrument.dto.MusicResponse;
import org.example.musicsinstrument.entity.Music;
import org.example.musicsinstrument.mapper.MusicMapper;
import org.example.musicsinstrument.repository.MusicRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicService {
    private final MusicRepository musicRepository;
    private final MusicMapper musicMapper;

    public  MusicResponse addMusic( MusicCreateDto dto) {
        Music music = musicMapper.toEntity(dto);

        Music savedMusic = musicRepository.save(music);
        MusicResponse musicResponse = musicMapper.todto(savedMusic);
        return musicResponse;
    }

    public List<MusicResponse> getMusic() {
         return musicMapper.toDtoList(musicRepository.findAll());
    }

//    public void deleteMusic(Long id) {
//       musicRepository.deleteById(id);
//    }
}
