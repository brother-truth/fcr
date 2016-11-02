package fcr.service;

import fcr.model.Subject;

public interface ISubjectService {
	public Subject getSubjectById(int subjectId);

    public void save(Subject subject);
}
