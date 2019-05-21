package kr.co.board.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootApplication
@Slf4j
public class DataSourceTest {

	@Autowired
	DataSource dataSource;
	
	@Test
	public void testConnection() throws SQLException {
		log.info("application.yml DataSource : " + dataSource);
		
		Connection connection = dataSource.getConnection();
		
		log.info("DataSoucre connection : " + connection);
	}
}
