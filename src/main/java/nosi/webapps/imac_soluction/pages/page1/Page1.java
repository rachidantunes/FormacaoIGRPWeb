package nosi.webapps.imac_soluction.pages.page1;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
public class Page1 extends Model{		
	
	@SeparatorList(name = Formlist_1.class)
	@Valid
	private List<Formlist_1> formlist_1 = new ArrayList<>();	
	public void setFormlist_1(List<Formlist_1> formlist_1){
		this.formlist_1 = formlist_1;
	}
	public List<Formlist_1> getFormlist_1(){
		return this.formlist_1;
	}
	@RParam(rParamName = "p_formlist_1_id")
	private String[] p_formlist_1_id;
	@RParam(rParamName = "p_formlist_1_del")
	private String[] p_formlist_1_del;
	@RParam(rParamName = "p_formlist_1_edit")
	private String[] p_formlist_1_edit;
	
	public void setP_formlist_1_id(String[] p_formlist_1_id){
		this.p_formlist_1_id = p_formlist_1_id;
	}
	public String[] getP_formlist_1_id(){
		return this.p_formlist_1_id;
	}
	
	public void setP_formlist_1_del(String[] p_formlist_1_del){
		this.p_formlist_1_del = p_formlist_1_del;
	}
	public String[] getP_formlist_1_del(){
		return this.p_formlist_1_del;
	}
	
	public void setP_formlist_1_edit(String[] p_formlist_1_edit){
		this.p_formlist_1_edit = p_formlist_1_edit;
	}
	public String[] getP_formlist_1_edit(){
		return this.p_formlist_1_edit;
	}


	public static class Formlist_1{
		private Pair formlist_1_id;

		private Pair produtos;

		private Pair preco;

		private Pair quantidade;

		private Pair total;
		public void setFormlist_1_id(Pair formlist_1_id){
			this.formlist_1_id = formlist_1_id;
		}
		public Pair getFormlist_1_id(){
			return this.formlist_1_id;
		}
		public void setProdutos(Pair produtos){
			this.produtos = produtos;
		}
		public Pair getProdutos(){
			return this.produtos;
		}

		public void setPreco(Pair preco){
			this.preco = preco;
		}
		public Pair getPreco(){
			return this.preco;
		}

		public void setQuantidade(Pair quantidade){
			this.quantidade = quantidade;
		}
		public Pair getQuantidade(){
			return this.quantidade;
		}

		public void setTotal(Pair total){
			this.total = total;
		}
		public Pair getTotal(){
			return this.total;
		}

	}

	public void loadFormlist_1(BaseQueryInterface query) {
		this.setFormlist_1(this.loadFormList(query,Formlist_1.class));
	}

}
