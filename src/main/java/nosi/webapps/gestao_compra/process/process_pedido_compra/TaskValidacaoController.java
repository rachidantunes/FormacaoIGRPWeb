package nosi.webapps.gestao_compra.process.process_pedido_compra;

import java.io.IOException;
import nosi.core.webapp.Response;
import javax.servlet.ServletException;
import nosi.core.webapp.Core;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;
import nosi.core.webapp.bpmn.BPMNTaskController;
import nosi.webapps.gestao_compra.pages.validacao.Validacao;
import nosi.webapps.gestao_compra.pages.validacao.ValidacaoView;
/*----#start-code(packages_import)----*/

import nosi.webapps.gestao_compra.dao.ItemRequisicao;
import nosi.webapps.gestao_compra.dao.Requisicao;
import nosi.webapps.gestao_compra.pages.validacao.Validacao.Formlist_1;
import java.util.List;
/*----#end-code----*/



/**
 *demo@nosi.cv
 *27-11-2019
*/

public class TaskValidacaoController extends BPMNTaskController {

	public Response actionIndex() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {
		ValidacaoView view = new ValidacaoView();
		Validacao model = new Validacao();
		model.load();

		/*----#start-code(index)----*/
		view.aprovar.loadDomain("SIM_NAO","-- selecionar --");
        model.loadFromTask("Pedido");
        Core.setMessageInfo("justificacao:"+Core.getTaskVariable("Pedido", "p_justificacao"));
        Core.setTaskVariableInt("decisao","local", 1);//Variavel local, acessivel apenas dentro de task
        Core.setTaskVariableInt("decisao", 1);//Variavel global acessivel em todo processo
		/*----#end-code----*/

		return super.index("gestao_compra",model,view,this);
	}

	public Response actionSave() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {

		/*----#start-code(save)----*/
		if(1!=0) {
			return this.forward("gestao_compra", "TaskValidacao", "index");
		}
		/*try {
			Validacao model = new Validacao();
			model.load();
			Requisicao req = new Requisicao();
			req.setJustificacao(Core.getTaskVariable("Pedido", "p_justificacao"));
			req.setData_requisicao(Core.getCurrentDateSql());
			String estado = ("SIM".compareTo(model.getAprovar())==0)?"APROVADO":"REJEITADO";
			req.setEstado(estado);
			req = req.insert();
			for(Formlist_1 f:model.getFormlist_1()){
				ItemRequisicao item = new ItemRequisicao();
				item.setDescricao(f.getDescricao().getKey());
				item.setQuantidade(Core.toInt(f.getQuantidade().getKey()));
				item.setRequisicao_id(req.getId());
				item.insert();
			}
			if(req.hasError()) {
				
			}
		}catch (Exception e) {
			Core.setMessageError(e.getMessage());
			return this.forward("gestao_compra", "TaskValidacao", "index");
		}*/
		/*----#end-code----*/

		return super.save();
	}

	public Response actionUpdate() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {

		/*----#start-code(update)----*/

		/*----#end-code----*/

		return super.update();
	}

	public List<TipoDocumentoEtapa> getInputDocumentType() {
		return super.getInputDocumentType();
	}

	public List<TipoDocumentoEtapa> getOutputDocumentType() {
		return super.getOutputDocumentType();
	}



	/*----#start-code(custom_actions)----*/

	/*----#end-code----*/



}
