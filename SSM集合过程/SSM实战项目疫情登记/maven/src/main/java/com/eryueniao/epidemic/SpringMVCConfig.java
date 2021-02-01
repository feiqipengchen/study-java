package com.eryueniao.epidemic;

import com.eryueniao.epidemic.common.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

//springMVC框架的配置类
@Configuration//表示当前类是配置类
@EnableWebMvc//当前文件是SprngMVC配置类
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
//将Controller注解的类纳入springMVC的组件扫描中( 让springMVC管理Controller类)
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
    //1.用下面的代码代替 private DateConverter dateConverter=new DateConverter();
    @Autowired
    private DateConverter dateConverter;

    /*
    url请求没有匹配到后台方法,就使用默认方法定位都一个静态页面
    */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();//默认给静态页面资源放行
    }

    /*
    添加格式化规则
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(dateConverter);////将日期转换器的格式设置给框架
    }

    /*
    添加视图控制器
    ∶没置默认的资源访问路径
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("epidemic");
    }

    /*
    配置视图解析器
    :给视图添加前缀和后纲
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/", ".jsp");
    }
}
