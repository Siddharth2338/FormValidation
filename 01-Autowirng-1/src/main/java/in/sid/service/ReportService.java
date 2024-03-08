package in.sid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sid.ReportDao;

@Service
public class ReportService {
	
	@Autowired
	private ReportDao reportdata;
	
	
	public void setReportdata(ReportDao reportdata) {
		System.out.println("setReport dao method get called....");
		this.reportdata = reportdata;
	}

	public void generateReport() {
		reportdata.findDao();
		System.out.println("Generating Report.....");
	}

}
