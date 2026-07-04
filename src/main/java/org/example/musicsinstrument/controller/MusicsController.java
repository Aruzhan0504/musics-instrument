package org.example.musicsinstrument.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.musicsinstrument.dto.MusicCreateDto;
import org.example.musicsinstrument.dto.MusicResponse;
import org.example.musicsinstrument.dto.MusicUpdateDto;
import org.example.musicsinstrument.repository.MusicRepository;
import org.example.musicsinstrument.service.MusicService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicsModel")
//musics-model
@RequiredArgsConstructor
public class MusicsController {

    private final MusicService musicService;
    private final MusicRepository musicRepository;

    @GetMapping
    public List<MusicResponse> getAllMusic(){
        return musicService.getMusic();
    }

    @PreAuthorize("hasAnyRole('MANAGER','ADMIN')")
    @PostMapping
    public ResponseEntity<MusicResponse> addMusicsInstrument(@Valid @RequestBody MusicCreateDto dto){
        return ResponseEntity.status(201).body(musicService.addMusic(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusicInstrument(@PathVariable Long id){
        musicRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<MusicResponse> updateMusicsInstrument(@Valid @RequestBody MusicUpdateDto dto){
        return ResponseEntity.status(200).body(musicService.updateMusic(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicResponse> getMusicById(@PathVariable Long id){
        return ResponseEntity.status(200).body(musicService.getMusicById(id));
    }

    @GetMapping("/test")
    public String test() {
        return "GET работает";
    }

}