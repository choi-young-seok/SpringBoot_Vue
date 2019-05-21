package kr.co.board.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SqlSessionFactoryTest {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void getSqlSessionFactoryTest() {
		log.info("sqlSessionFactory : " + sqlSessionFactory);
	}
}
