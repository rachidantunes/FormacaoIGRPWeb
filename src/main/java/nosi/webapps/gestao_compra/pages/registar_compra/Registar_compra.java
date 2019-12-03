package nosi.webapps.gestao_compra.pages.registar_compra;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class Registar_compra extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_loja")
	private int loja;

	@NotNull(message="Data compra é de preenchimento obrigatorio")
	@PastOrPresent(message="Data inválido")
	@RParam(rParamName = "p_data_compra")
	private String data_compra;
	
	@SeparatorList(name = Produtos.class)
	@Valid
	private List<Produtos> produtos = new ArrayList<>();	
	public void setProdutos(List<Produtos> produtos){
		this.produtos = produtos;
	}
	public List<Produtos> getProdutos(){
		return this.produtos;
	}
	@RParam(rParamName = "p_produtos_id")
	private String[] p_produtos_id;
	@RParam(rParamName = "p_produtos_del")
	private String[] p_produtos_del;
	@RParam(rParamName = "p_produtos_edit")
	private String[] p_produtos_edit;
	
	public void setP_produtos_id(String[] p_produtos_id){
		this.p_produtos_id = p_produtos_id;
	}
	public String[] getP_produtos_id(){
		return this.p_produtos_id;
	}
	
	public void setP_produtos_del(String[] p_produtos_del){
		this.p_produtos_del = p_produtos_del;
	}
	public String[] getP_produtos_del(){
		return this.p_produtos_del;
	}
	
	public void setP_produtos_edit(String[] p_produtos_edit){
		this.p_produtos_edit = p_produtos_edit;
	}
	public String[] getP_produtos_edit(){
		return this.p_produtos_edit;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setLoja(int loja){
		this.loja = loja;
	}
	public int getLoja(){
		return this.loja;
	}
	
	public void setData_compra(String data_compra){
		this.data_compra = data_compra;
	}
	public String getData_compra(){
		return this.data_compra;
	}


	public static class Produtos{
		private Pair produtos_id;
		@PairNotNull()

		private Pair produto;
		@PairNotNull()

		private Pair preco;
		@PairNotNull()

		private Pair quantidade;
		@PairNotNull()

		private Pair total;
		public void setProdutos_id(Pair produtos_id){
			this.produtos_id = produtos_id;
		}
		public Pair getProdutos_id(){
			return this.produtos_id;
		}
		public void setProduto(Pair produto){
			this.produto = produto;
		}
		public Pair getProduto(){
			return this.produto;
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

	public void loadProdutos(BaseQueryInterface query) {
		this.setProdutos(this.loadFormList(query,Produtos.class));
	}

}
