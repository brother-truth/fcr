package fcr.dao;

import fcr.model.ExpImitation;

public interface ExpImitationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpImitation record);

    int insertSelective(ExpImitation record);

    ExpImitation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpImitation record);

    int updateByPrimaryKey(ExpImitation record);
}