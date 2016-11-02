package fcr.dao;

import fcr.model.ExpPuzzle;

public interface ExpPuzzleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpPuzzle record);

    int insertSelective(ExpPuzzle record);

    ExpPuzzle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpPuzzle record);

    int updateByPrimaryKey(ExpPuzzle record);
}