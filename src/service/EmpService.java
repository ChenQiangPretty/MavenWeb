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

		List<Empss> empList = empDao.findAll();
		return empList;
	}

}
