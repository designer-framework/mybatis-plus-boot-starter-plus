package com.baomidou.mybatisplus.plus.config;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @Project: payment
 * @Package: com.wisdom.framwork.customer
 * @Author: Designer
 * @CreateTime: 2019-09-20 13
 * @Description:
 */
public class MybatisPlusConfig {

    /**
     * 自定义 SqlInjector,自行实现偷懒策略=.=
     * 里面包含自定义的全局方法
     */
    @Bean
    public AddSqlInjector myLogicSqlInjector() {
        return new AddSqlInjector();
    }

    /**
     * 乐观锁
     *
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }


    public class AddSqlInjector extends DefaultSqlInjector {

        @Override
        public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
            List<AbstractMethod> methodList = super.getMethodList(mapperClass);
            methodList.add(new ExampleAbstractMethod());
            return methodList;
        }


        /**
         * 具体偷懒策略实现可参见官方的AbstractMethod抽象类的实现
         */
        class ExampleAbstractMethod extends AbstractMethod {

            @Override
            public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
                /* 执行 SQL ，动态 SQL 参考类 SqlMethod */
                String sql = "select * from " + tableInfo.getTableName();
                /* 与 BaseMapper基类接口方法名保持一致 */
                String method = "example";
                SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
                return addSelectMappedStatementForOther(mapperClass, method, sqlSource, modelClass);
            }
        }
    }

}
