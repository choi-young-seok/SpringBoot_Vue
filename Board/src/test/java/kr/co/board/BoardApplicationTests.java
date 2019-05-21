package kr.co.board;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class BoardApplicationTests {

	@Autowired
	private DataSource datasource;
	
	@Test
	public void contextLoads() {
	}
	
//	@Test
//	public void testConnection() throws Exception{
//		log.info("ds : " + datasource);
//		
//		Connection con = datasource.getConnection();
//		
//		log.info("con : " + con);
//	}

}
