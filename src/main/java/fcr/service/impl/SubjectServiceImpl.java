package fcr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import fcr.dao.SubjectMapper;
import fcr.model.Subject;
import fcr.service.ISubjectService;

@Service("subjectService")
public class SubjectServiceImpl implements ISubjectService {

	@Resource
	private SubjectMapper subjectMapper;

	@Override
	public Subject getSubjectById(int subjectId) {
		// TODO Auto-generated method stub
		return this.subjectMapper.selectByPrimaryKey(subjectId);
	}

	@Override
	public void save(Subject subject) {
		// TODO Auto-generated method stub
		this.subjectMapper.insert(subject);
	}


}
