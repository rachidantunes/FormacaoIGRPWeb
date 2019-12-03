/*---------------------- Create Model ----------------------*/
package nosi.webapps.gestao_compra.pages.tbl_productform;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Tbl_productForm extends Model{		

	@RParam(rParamName = "p_id")
	private int id;

	@RParam(rParamName = "p_description")
	private String description;

	@RParam(rParamName = "p_reference")
	private String reference;

	@RParam(rParamName = "p_id_user")
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
	
	public void setReference(String reference){
		this.reference = reference;
	}
	public String getReference(){
		return this.reference;
	}
	
	public void setId_user(int id_user){
		this.id_user = id_user;
	}
	public int getId_user(){
		return this.id_user;
	}



}
/*-------------------------*/