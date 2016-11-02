package fcr.dao;

import fcr.model.ExpStudy;

public interface ExpStudyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpStudy record);

    int insertSelective(ExpStudy record);

    ExpStudy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpStudy record);

    int updateByPrimaryKey(ExpStudy record);
}