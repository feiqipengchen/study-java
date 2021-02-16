package com.eryueniao.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

//这里配置mapper所在的包
@Configuration
@MapperScan(basePackages = "com.eryueniao.mapper", sqlSessionTemplateRef = "test1SqlSessionTemplate")
public class DataSource1Config {

@Bean(name ="test1DataSource")
@ConfigurationProperties(prefix = "spring.datasource.test1")
//primary代表主库
@Primary
public DataSource testDataSource() {
return DataSourceBuilder.create().build();
}

@Bean(name = "test1SqlSessionFactory")
@Primary
public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
throws Exception {
SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
bean.setDataSource(dataSource);
return bean.getObject();
}

@Bean(name = "test1TransactionManager")
@Primary
public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
return new DataSourceTransactionManager(dataSource);
}

@Bean(name = "test1SqlSessionTemplate")
@Primary
public SqlSessionTemplate testSqlSessionTemplate(
@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
return new SqlSessionTemplate(sqlSessionFactory);
}
}