package com.xiaoyuan.generator;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.thymeleaf.model.IModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * mybatisPlus代码生成器
 */
public class mybatisPlusGenerator {
    /**
     * 数据库连接地址
     */
    public static final String URL = "jdbc:mysql://rm-wz942s30t361ycw1ufo.mysql.rds.aliyuncs.com:3306/xiaoyuan?useUnicode=true&useSSL=false&characterEncoding=utf8";
    /**
     * 数据库连接用户名
     */
    public static final String USER_NAME = "xiaoyuan123";
    /**
     * 数据库连接密码
     */
    public static final String PASSWORD = "xiaoyuan";
    /**
     * 包路径
     * 包路径为:PACKAGE_PATH + 输入的模块名 ；
     */
    public static final String PACKAGE_PATH = "com";
    /**
     * 表前缀
     */
    public static final String TABLE_PREFIX = "tl_school";

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void generator(){
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jobob");
        gc.setOpen(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        //gc.setMapperName("%sMapper");
        //gc.setXmlName("%sMapper");
        //gc.setServiceName("I%sService");
        //gc.setServiceImplName("%sServiceImpl");
        //gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(URL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(USER_NAME);
        dsc.setPassword(PASSWORD);
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(scanner("模块名"));
        pc.setParent(PACKAGE_PATH);
        mpg.setPackageInfo(pc);
        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        //String templatePath = "/templates/mapper.xml.vm";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);

        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 公共父类
        //strategy.setSuperControllerClass(PACKAGE_PATH +".BaseController");
        // 写于父类中的公共字段
        // strategy.setSuperEntityColumns("id");
        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        //strategy.setInclude(new String[] { "tl_school_user_info" });// 需要生成的表
        //strategy.setInclude(new String[] { "tl_school_user_notes" });
        //strategy.setInclude(new String[] { "tl_school_activity" });
        //strategy.setInclude(new String[] { "tl_school_advertisement" });
        //strategy.setInclude(new String[] { "tl_school_amusement" });
        //strategy.setInclude(new String[] { "tl_school_announcement" });
        //strategy.setInclude(new String[] { "tl_school_attenceer" });
        //strategy.setInclude(new String[] { "tl_school_band" });
        //strategy.setInclude(new String[] { "tl_school_class" });
        //strategy.setInclude(new String[] { "tl_school_educational_administration" });
        //strategy.setInclude(new String[] { "tl_school_homework" });
        //strategy.setInclude(new String[] { "tl_school_homework_return" });
        //strategy.setInclude(new String[] { "tl_school_news" });
        //strategy.setInclude(new String[] { "tl_school_order" });
        //strategy.setInclude(new String[] { "tl_school_parent" });
        //strategy.setInclude(new String[] { "tl_school_school" });
        //strategy.setInclude(new String[] { "tl_school_staff" });
        //strategy.setInclude(new String[] { "tl_school_students" });
        //strategy.setInclude(new String[] { "tl_school_teachers" });
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(TABLE_PREFIX + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }



    public static void main(String[] args) {
        generator();
    }
}
