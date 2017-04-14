package com.xpanxion.report;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.xpanxion.model.Customer;
/*import com.xpanxion.gym.model.Employee;*/
import com.xpanxion.model.Fees;
import com.xpanxion.service.CustomerService;
import com.xpanxion.service.CustomerServiceImpl;

/**
 * This view class generates a PDF document 'on the fly' based on the data
 * contained in the model.
 * @author www.codejava.net
 *
 */
public class PDFBuilder extends AbstractITextPdfView {
	
	@Autowired
	private CustomerService customerService;
	
	private List<Customer> listCustomer=null;

	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// get data model which is passed by the Spring container
		List<Fees> listFees = (List<Fees>) model.get("listFees");
		listCustomer = (List<Customer>) model.get("customers");
		for (Customer fee :listCustomer) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(fee.getEmail());
			
		}
		
		doc.add(new Paragraph("                                                                   Monthly Fees Payments"));
		doc.add(new Paragraph("                                                                  ======================="));
		PdfPTable table = new PdfPTable(6);
		table.setWidthPercentage(100.0f);
		table.setWidths(new float[] {0.70f, 0.5f, 3.30f, 3.0f, 1.5f, 1.5f });
		table.setSpacingBefore(10);
		
		// define font for table header row
		Font font = FontFactory.getFont(FontFactory.COURIER);
		font.setColor(BaseColor.WHITE);
		
		// define table header cell
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.BLUE);
		cell.setPadding(5);
		
		// write table header 
		cell.setPhrase(new Phrase("PId", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Id", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Name", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Date", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Amount", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Scheme", font));
		table.addCell(cell);
	
		
		
		// write table row data
		for (Fees fee :listFees) {
			table.addCell(Integer.toString(fee.getPaymentId()));
			table.addCell(Integer.toString(fee.getCustId()));
			table.addCell(getCustName(fee.getCustId()));
			table.addCell(fee.getDate());
			table.addCell(Integer.toString(fee.getScheme().getPrice()));
			table.addCell(fee.getScheme().getWorkoutType().getWorkoutName());
		}
		
		doc.add(table);
		
	}
	
	private String getCustName (int id){
		
		for (Customer c :listCustomer) {
			if (id == c.getCust_Id()){
				return (c.getFirst_Name()+" " + c.getLast_Name());
				
			}
		}
		return null;
		
	}
	
	private String getSchemeForAmount(int a){
		String scheme = null;
		 
		return scheme;
	}

}