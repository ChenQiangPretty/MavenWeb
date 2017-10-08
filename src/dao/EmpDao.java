package dao;


import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import util.JdbcUtil;

import entity.Empss;


/**
 *
 *
 * @author hadoop
 */
@Repository
public class EmpDao {

    /**
     *
     */
    public List<Empss> findAll() throws Exception {
        QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "select * from emp";
        List<Empss> empList = runner.query(sql, new BeanListHandler<Empss>(
                Empss.class));
        System.out.println("runing");
        return empList;

    }

	/*
     * public List<Map<String, Object>> findAll() throws Exception {
	 * JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getDataSource());
	 * String sql = "select * from emp"; List<Map<String, Object>> queryForList
	 * = jdbcTemplate.queryForList(sql); return queryForList;
	 *
	 * }
	 */

    // �����Ƿ������ӵ���ݿ�
	/*
	 * public static void main(String[] args) throws Exception { EmpDao dao =
	 * new EmpDao(); List<Map<String, Object>> findAll = dao.findAll();
	 * for(Map<String, Object> map2:findAll){ Set<Entry<String,Object>> entrySet
	 * = map2.entrySet(); Iterator<Entry<String, Object>> iterator =
	 * entrySet.iterator(); while(iterator.hasNext()){
	 * System.out.print(iterator.next().getValue()+":"); }
	 * System.out.println("\n"); }
	 *
	 * }
	 */
}
