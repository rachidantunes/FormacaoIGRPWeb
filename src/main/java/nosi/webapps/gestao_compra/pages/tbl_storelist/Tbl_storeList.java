/*---------------------- Create Model ----------------------*/
package nosi.webapps.gestao_compra.pages.tbl_storelist;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Tbl_storeList extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private int id;
		private String description;
		private String location;
		private int id_user;
		public void setId(int id){
			this.id = id;
		}
		public int getId(){
			return this.id;
		}

		public void setDescription(String description){
			this.description = description;
		}
		public String getDescription(){
			return this.description;
		}

		public void setLocation(String location){
			this.location = location;
		}
		public String getLocation(){
			return this.location;
		}

		public void setId_user(int id_user){
			this.id_user = id_user;
		}
		public int getId_user(){
			return this.id_user;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
/*-------------------------*/