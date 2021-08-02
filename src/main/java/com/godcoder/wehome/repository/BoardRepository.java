package com.godcoder.wehome.repository;

import com.godcoder.wehome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
