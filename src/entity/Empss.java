package entity;

import java.util.Date;

/**
 * Ա��
 * @author hadoop
 *
 */
public class Empss {
	private Integer id;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Integer sal;
	private Integer comm;
	private Integer depno;
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public Integer getComm() {
		return comm;
	}
	public void setComm(Integer comm) {
		this.comm = comm;
	}
	public Integer getDepno() {
		return depno;
	}
	public void setDepno(Integer depno) {
		this.depno = depno;
	}
	@Override
	public String toString() {
		return "id=" + id + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", depno=" + depno;
	}
	
	

}
