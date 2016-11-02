package fcr.dao;

import fcr.model.ExpTest;

public interface ExpTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpTest record);

    int insertSelective(ExpTest record);

    ExpTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpTest record);

    int updateByPrimaryKey(ExpTest record);
}