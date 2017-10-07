package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ������
 * @author hadoop
 *
 */
public class JdbcUtil {
   /**
    * ȥsrcĿ¼�¼���c3p0-config.xml�����ļ�
    */
   private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
   /**
    * ��ȡ���Դ
    */
   public static ComboPooledDataSource getDataSource() {
	return dataSource;
  }
   
   
}
