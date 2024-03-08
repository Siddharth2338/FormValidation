package in.sid;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao {
	
	public ReportDaoImpl() {
		System.out.println("ReportDao :: Constructor");
	}

	@Override
	public String findDao() {
		System.out.println("fetching report from db....");
		return "Report Data";
	}

}
