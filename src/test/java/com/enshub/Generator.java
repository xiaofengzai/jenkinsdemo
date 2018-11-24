package com.enshub;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zh
 * @ClassName cn.aduu.util.Generator
 * @Description
 * @date 2018-02-22 11:37:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JenkinsdemoApplication.class)
public class Generator {

    //@Test
    public  void generate() {
        String packageName = "com.enshub";
        boolean serviceNameStartWithI = false;//auth -> UserService, 设置成true: auth -> IUserService
        generateByTables(serviceNameStartWithI, packageName, "xiaofengzai", "mytest", "user");

        System.out.println("completed...");
    }

    /**
     * @param serviceNameStartWithI
     * @param packageName   包名
     * @param author  作者
     * @param database  数据库名
     * @param tableNames 表名
     */
    private  void generateByTables(boolean serviceNameStartWithI, String packageName, String author, String database, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://www.enshub.com:3306/" + database + "?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl(dbUrl);
        dataSourceConfig.setUsername("*****");
        dataSourceConfig.setPassword("*****");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");


        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true);
        //strategyConfig.setEntityLombokModel(false);
        strategyConfig.setDbColumnUnderline(true);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//              .setSuperMapperClass("cn.saytime.mapper.BaseMapper")
        strategyConfig.setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组

        config.setActiveRecord(false);
        config.setAuthor(author);
        config.setOutputDir("src/main/java");
        config.setFileOverride(true);
        config.setEnableCache(false);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }

        AutoGenerator generator=new AutoGenerator();
        generator.setGlobalConfig(config);
        generator.setDataSource(dataSourceConfig);
        generator.setStrategy(strategyConfig);




        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent(packageName);
        packageConfig.setController("web");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setXml("mappers");
        generator.setPackageInfo(packageConfig);

        generator.execute();
    }

}

