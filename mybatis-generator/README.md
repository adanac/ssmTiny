当配置完 generatorConfig.xml 后(只需要改个表名)，只需要打开控制台，执行脚本：
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite  即可。
这样在生成之后，就可以在src目录下找到相应的文件夹，每个表格都会对应三个文件（实体类、接口、配置文件）。

注意：
如果接口extends BaseDao<Teacher, Long>，需要修改 mapper 文件中根据主键查询或删除的parameterType="java.lang.Long"