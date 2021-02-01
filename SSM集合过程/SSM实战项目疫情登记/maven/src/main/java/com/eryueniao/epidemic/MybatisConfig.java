package com.eryueniao.epidemic;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Mybatis配置类
 */
@Configuration
@MapperScan(basePackages = "com.eryueniao.epidemic.mapper")
public class MybatisConfig {
    @Bean
    public BasicDataSource basicDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/epidemic");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        //配置连接池的相关参数
        dataSource.setInitialSize(3);//连接池的初始容量
        dataSource.setMaxActive(10);//连接最大的活动数量
        dataSource.setMaxIdle(1);//连接最大的空闲数量
        dataSource.setMaxWait(4000);//连接的超时时间
        dataSource.setDefaultAutoCommit(false);//取消sql语句的自动提财
        return dataSource;
    }
   @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean =new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        //给实体类越别名 com.eryueniao.epidemic.bean. UserInfo --- UserInfo
        factoryBean.setTypeAliasesPackage("com.eryueniao.epidemic.bean");
        //创建一个配置对象，该对象可以设置实体类中的成员变量名与数据库的对应关系
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
   //将数据库表中的字段名中的下划线取消,紧跟后面的第一个字符变大写，形成实体类中的成员变量名 user_id --- userIdl
    configuration.setMapUnderscoreToCamelCase(true);
    factoryBean.setConfiguration(configuration);
        SqlSessionFactory sessionFactory= null;
        try {
            sessionFactory = factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
