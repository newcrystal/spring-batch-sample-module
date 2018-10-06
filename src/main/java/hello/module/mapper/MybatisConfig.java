package hello.module.mapper;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages="hello.module.mapper", sqlSessionFactoryRef="moduleSqlSessionFactory")
public class MybatisConfig {
	 @Bean
	  public SqlSessionFactory moduleSqlSessionFactory(DataSource dataSource) throws Exception {
	    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	    sessionFactory.setDataSource(dataSource);
	    sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("hello/module/mapper/xml/*"));
	    return sessionFactory.getObject();
	  }
}
