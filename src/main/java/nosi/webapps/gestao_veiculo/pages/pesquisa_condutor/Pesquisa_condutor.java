package nosi.webapps.gestao_veiculo.pages.pesquisa_condutor;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Pesquisa_condutor extends Model{		

	@RParam(rParamName = "p_bi_search")
	private String bi_search;

	@RParam(rParamName = "p_nome_search")
	private String nome_search;
	
	private List<Condutor> condutor = new ArrayList<>();	
	public void setCondutor(List<Condutor> condutor){
		this.condutor = condutor;
	}
	public List<Condutor> getCondutor(){
		return this.condutor;
	}

	
	public void setBi_search(String bi_search){
		this.bi_search = bi_search;
	}
	public String getBi_search(){
		return this.bi_search;
	}
	
	public void setNome_search(String nome_search){
		this.nome_search = nome_search;
	}
	public String getNome_search(){
		return this.nome_search;
	}


	public static class Condutor extends IGRPTable.Table{
		private String nome;
		private String bi;
		private String n_carta_conducao;
		private Integer id_condutor;
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setBi(String bi){
			this.bi = bi;
		}
		public String getBi(){
			return this.bi;
		}

		public void setN_carta_conducao(String n_carta_conducao){
			this.n_carta_conducao = n_carta_conducao;
		}
		public String getN_carta_conducao(){
			return this.n_carta_conducao;
		}

		public void setId_condutor(Integer id_condutor){
			this.id_condutor = id_condutor;
		}
		public Integer getId_condutor(){
			return this.id_condutor;
		}

	}

	public void loadCondutor(BaseQueryInterface query) {
		this.setCondutor(this.loadTable(query,Condutor.class));
	}

}
