package nosi.webapps.imac_solution.process.process_test1;

import java.io.IOException;
import java.util.List;
import nosi.core.webapp.Response;
import javax.servlet.ServletException;
import nosi.core.webapp.Core;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;
import nosi.core.webapp.bpmn.BPMNTaskController;
import nosi.webapps.imac_solution.pages.qualificacao.Qualificacao;
import nosi.webapps.imac_solution.pages.qualificacao.QualificacaoView;
/*----#start-code(packages_import)----*/

/*----#end-code----*/



/**
 *demo@nosi.cv
 *26-11-2019
*/

public class TaskQualificacaoController extends BPMNTaskController {

	public Response actionIndex() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {
		QualificacaoView view = new QualificacaoView();
		Qualificacao model = new Qualificacao();
		model.load();

		/*----#start-code(index)----*/
		view.aprovar.setQuery(Core.query(null,"SELECT 'A' as ID,'Aprovado' as NAME UNION SELECT 'R' as ID,'Rejeitado' as NAME"),"--- Selecionar Opcao ---");
		/*----#end-code----*/

		return super.index("imac_solution",model,view,this);
	}

	public Response actionSave() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {

		/*----#start-code(save)----*/

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
