package nosi.webapps.imac_solution.pages.file;

import java.util.ArrayList;
import java.util.List;

/**
 * cvt00957
 * Nov 28, 2019
 */
public class RegistarProduct extends File{

	private List<TableProduct> TableProduct = new ArrayList<>();
	
	
	
	public List<TableProduct> getTableProduct() {
		return TableProduct;
	}



	public void setTableProduct(List<TableProduct> TableProduct) {
		this.TableProduct = TableProduct;
	}



	public static class TableProduct{
		private String description;
		private String reference;
		private String mostrar;
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getReference() {
			return reference;
		}
		public void setReference(String reference) {
			this.reference = reference;
		}
		public String getMostrar() {
			return mostrar;
		}
		public void setMostrar(String mostrar) {
			this.mostrar = mostrar;
		}
		
		
	}
}
