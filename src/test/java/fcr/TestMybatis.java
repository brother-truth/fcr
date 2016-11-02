package fcr;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import fcr.model.Subject;
import fcr.service.ISubjectService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	@Resource
	private ISubjectService subjectService = null;

	@Test
	public void test1() {
		Subject subject = subjectService.getSubjectById(1);
		logger.info(JSON.toJSONString(subject));
	}
	
	@Test
	public void save() {
		Subject subject = new Subject();
		subject.setId(15);
		subject.setName("小明名");
		subject.setSex("男");
		subject.setAge(15);
		subjectService.save(subject);
	}
}
