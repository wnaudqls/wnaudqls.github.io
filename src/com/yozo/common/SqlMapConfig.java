package com.yozo.common;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {

	// static ��� �ʵ�� SQlSessionFactory type����
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "com/yozo/common/mybatis-config.xml";
		Reader reader = null;

		try {

			reader = Resources.getResourceAsReader(resource);
			// SqlSessionFactory ��ü�� �������� ���� ����ʵ忡 ����
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
}
