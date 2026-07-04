package org.example.musicsinstrument.repository;

import org.example.musicsinstrument.dto.MusicResponse;
import org.example.musicsinstrument.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MusicRepository extends JpaRepository<Music,Long> {

    Optional<Music> findById(Long id);
}
