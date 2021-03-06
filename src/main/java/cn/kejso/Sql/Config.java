package cn.kejso.Sql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Config {
	
	private static Logger logger = LoggerFactory.getLogger(Config.class);
	
	//mybatis配置文件
	public static final  String   Mybatis_config="mybatis_config.xml"; 
	
	//jar文件前缀
	public static String   prefix_jarfile="file:///";
	
	private static String  Jdbc_config;
	
	public  static String  database_name;
		
	
	public static String getJdbc_config() {
		if(Jdbc_config!=null&&!Jdbc_config.equals(""))
			return Jdbc_config;
		else
			return null;
	}
	public static void setJdbc_config(String jdbc_config) {
		Jdbc_config = jdbc_config;
		logger.info("set jdbc config file [ {} ] .",jdbc_config);
	}
	
	// 复制表结构
	public static final String  copyTableStructure="SqlMapper.TemplateMapper.copyTableStructure";
	// 复制表数据
	public static final String  copyTableData="SqlMapper.TemplateMapper.copyTableData";
	// 更新一行
	public static final String  updateColumn="SqlMapper.TemplateMapper.updateColumn";
	// 获得所有数据
	public static final String  getAllData="SqlMapper.TemplateMapper.getAllData";
	
	// 添加一列
	public static final String  addColumn="SqlMapper.TemplateMapper.addColumn";
	// 获得指定Column的所有数据
	public static final String  getDataFromSideTable="SqlMapper.TemplateMapper.getDataFromSideTable";
	// 添加一列
	public static final String  copyDatatoColumn="SqlMapper.TemplateMapper.copyDatatoColumn";
    // 删除一列
	public static final String deleteColumn ="SqlMapper.TemplateMapper.deleteColumn";
	
	//获得列名称
	public static final String getColumns = "SqlMapper.TemplateMapper.getColumns";
	//插入实体
	public static final String insertEntity = "SqlMapper.TemplateMapper.insertEntity";
	
	//drop id
	public static final String dropID = "SqlMapper.TemplateMapper.dropID";
	//add id
	public static final String addID = "SqlMapper.TemplateMapper.addID";
	//primary id
	public static final String primaryID = "SqlMapper.TemplateMapper.primaryID";
	
	//add table
	public static final String addTable = "SqlMapper.TemplateMapper.addTable";
	//delete table
	public static final String deleteTable = "SqlMapper.TemplateMapper.deleteTable";
	//rename table
	public static final String renameTable = "SqlMapper.TemplateMapper.renameTable";
	
	
}
