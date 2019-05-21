//package kr.co.board.config;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//
//@Bean(name = "dataSource")
//@ConditionalOnProperty(
//  name = "usemysql", 
//  havingValue = "custom")
//@ConditionalOnMissingBean
//public class DbBoardConfig {
//
//	public DataSource dataSource2() {
//	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	         
//	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	    dataSource.setUrl(env.getProperty("mysql.url"));
//	    dataSource.setUsername(env.getProperty("mysql.user") != null ? env.getProperty("mysql.user") : "");
//	    dataSource.setPassword(env.getProperty("mysql.pass") != null ? env.getProperty("mysql.pass") : "");
//	         
//	    return dataSource;
//	}
//	
//}
