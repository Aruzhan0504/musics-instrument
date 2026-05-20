package org.example.musicsinstrument.repository;

import org.example.musicsinstrument.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
