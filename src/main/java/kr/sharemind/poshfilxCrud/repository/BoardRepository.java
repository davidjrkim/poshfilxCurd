package kr.sharemind.poshfilxCrud.repository;

import kr.sharemind.poshfilxCrud.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
