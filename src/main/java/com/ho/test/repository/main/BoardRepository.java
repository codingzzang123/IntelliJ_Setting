package com.ho.test.repository.main;

import com.ho.test.entity.main.Board;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {

    public List<Board> findAll();

    public Board findByNo(Integer no);

    public List<Board> findByName(String name);

//    @Query(value="update board set views = views + 1 where no = :integer",nativeQuery = true)
//    public void save(Integer integer);

}
