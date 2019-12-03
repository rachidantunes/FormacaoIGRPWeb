package nosi.webapps.imac_solution.process.requisicao_material;

import java.io.IOException;
import java.util.List;
import nosi.core.webapp.Response;
import javax.servlet.ServletException;
import nosi.core.webapp.Core;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;
import nosi.core.webapp.bpmn.BPMNTaskController;
/*----#start-code(packages_import)----*/

/*----#end-code----*/



/**
 *demo@nosi.cv
 *25-11-2019
*/

public class TaskSolicitacaoController extends BPMNTaskController {

	public Response actionIndex() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {

		/*----#start-code(index)----*/

		/*----#end-code----*/

		return super.index();
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
