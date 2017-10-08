package service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.EmpDao;
import entity.Empss;



/**
 * Ա������ģ�� ҵ���ʵ����
 *
 * @author hadoop
 *
 */
@Service
public class EmpService {
	@Resource
	private EmpDao empDao;

	public List<Empss> findAll() throws Exception {
        System.out.println("hello");
        System.out.println("oo");
        System.out.println("yy");
		List<Empss> all = empDao.findAll();
		return all;
	}

}
