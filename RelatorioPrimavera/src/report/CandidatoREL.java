package report;

import java.util.List;

import model.Candidato;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

public class CandidatoREL {

	private String path; 
	private String pathToReportPackage;
	
	public CandidatoREL() {
		this.path = this.getClass().getClassLoader().getResource("").getPath();
		this.pathToReportPackage = this.path + "report/";
		System.out.println(path);
	}
	
	public void imprimir(List<Candidatos> candidatos) throws Exception {
		JasperReport report = JasperCompileManager.compileReport(this.getPathToReportPackage() + "Primavera.jrxml");

		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(candidatos));

		JasperExportManager.exportReportToPdfFile(print, "c:/RelatorioCANDIDATOS.pdf");
	}
	
	public String getPathToReportPackage() {
		return this.pathToReportPackage;
	}

	public String getPath() {
		return this.path;
	}
}
