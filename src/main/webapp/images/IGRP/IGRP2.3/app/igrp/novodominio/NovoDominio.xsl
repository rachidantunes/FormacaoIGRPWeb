<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/formlist/igrp.formlist.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-8b310428"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2><xsl:value-of select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-9dbf9a8f"><div class="gen-column col-sm-3"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/dominio"><div class="form-group col-sm-12   gen-fields-holder" item-name="dominio" item-type="text" required="required"><label for="{rows/content/form_1/fields/dominio/@name}"><span><xsl:value-of select="rows/content/form_1/fields/dominio/label"/></span></label><input type="text" value="{rows/content/form_1/fields/dominio/value}" class="form-control " id="{rows/content/form_1/fields/dominio/@name}" name="{rows/content/form_1/fields/dominio/@name}" required="required" maxlength="30" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/dominio"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div><div class="gen-column col-sm-9"><div class="gen-inner"><xsl:if test="rows/content/formlist_1"><div class="box box-table-contents gen-container-item " gen-class="" item-name="formlist_1"><div class="box-body table-box"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/formlist_1/fields"/><table id="formlist_1" class="table table-striped gen-data-table  IGRP_formlist  " rel="T_formlist_1" data-control="data-formlist_1"><thead><tr><xsl:if test="rows/content/formlist_1/fields/key"><th align="" class=" gen-fields-holder"><span><xsl:value-of select="rows/content/formlist_1/fields/key/label"/></span></th></xsl:if><xsl:if test="rows/content/formlist_1/fields/description"><th align="" class=" gen-fields-holder"><span><xsl:value-of select="rows/content/formlist_1/fields/description/label"/></span></th></xsl:if><xsl:if test="rows/content/formlist_1/fields/ordem"><th align="" class=" gen-fields-holder"><span><xsl:value-of select="rows/content/formlist_1/fields/ordem/label"/></span></th></xsl:if><xsl:if test="rows/content/formlist_1/fields/estado"><th align="" class=" gen-fields-holder"><span><xsl:value-of select="rows/content/formlist_1/fields/estado/label"/></span></th></xsl:if><xsl:if test="not(rows/content/formlist_1/table/value/row[position() = 1]/@noupdate) or not(rows/content/formlist_1/table/value/row[position() = 1]/@nodelete)"><th class="table-btn add"><xsl:if test="not(rows/content/formlist_1/table/value/row[position() = 1]/@noupdate)"><a class="formlist-row-add btn btn-primary" rel="formlist_1"><i class="fa fa-plus"/></a></xsl:if></th></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/formlist_1/table/value/row"><tr row="{position()}"><input type="hidden" name="p_formlist_1_id" value="{formlist_1_id}"/><input type="hidden" name="p_id_fk" value="{id}"/><input type="hidden" name="p_id_fk_desc" value="{id_desc}"/><xsl:if test="key"><xsl:if test="not(key/@visible)"><td align="" data-row="{position()}" data-title="{../../fields/key/label}" class="text" item-name="key"><input type="hidden" name="{../../../fields/key/@name}_fk_desc" value="{key_desc}"/><div class="form-group" item-name="key" item-type="text"><input type="text" name="{../../../fields/key/@name}_fk" value="{key}" class="text form-control" rel="F_formlist_1"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/formlist_1/fields/key"/></xsl:call-template></input></div></td></xsl:if></xsl:if><xsl:if test="description"><xsl:if test="not(description/@visible)"><td align="" data-row="{position()}" data-title="{../../fields/description/label}" class="text" item-name="description"><input type="hidden" name="{../../../fields/description/@name}_fk_desc" value="{description_desc}"/><div class="form-group" item-name="description" item-type="text"><input type="text" name="{../../../fields/description/@name}_fk" value="{description}" class="text form-control" rel="F_formlist_1"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/formlist_1/fields/description"/></xsl:call-template></input></div></td></xsl:if></xsl:if><xsl:if test="ordem"><xsl:if test="not(ordem/@visible)"><td align="" data-row="{position()}" data-title="{../../../fields/ordem/label}" class="number" item-name="ordem"><input type="hidden" name="{../../../fields/ordem/@name}_fk_desc" value="{ordem_desc}"/><div class="form-group" item-name="ordem" item-type="number"><input type="number" min="0" max="20" name="{../../../fields/ordem/@name}_fk" value="{ordem}" class="number form-control" rel="F_formlist_1"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/formlist_1/fields/ordem"/></xsl:call-template></input></div></td></xsl:if></xsl:if><xsl:if test="estado"><xsl:if test="not(estado/@visible)"><td align="" data-row="{position()}" data-title="{../../../fields/estado/label}" class="select" item-name="estado"><input type="hidden" name="{../../../fields/estado/@name}_fk_desc" value="{estado_desc}"/><div class="form-group" item-name="estado" item-type="select"><xsl:variable name="estado_val" select="estado"/><select class="form-control select2 " id="formlist_1_estado" input-rel="{../../../fields/estado/@name}_fk" rel="F_formlist_1"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/formlist_1/fields/estado"/></xsl:call-template><xsl:for-each select="//rows/content/formlist_1/fields/estado/list/option"><option value="{value}"><xsl:call-template name="select-multiple-value"><xsl:with-param name="value" select="value"/><xsl:with-param name="selected" select="$estado_val"/><xsl:with-param name="delimiter" select="';'"/></xsl:call-template><span><xsl:value-of select="text"/></span></option></xsl:for-each></select><input name="{../../../fields/estado/@name}_fk" type="hidden" value="{$estado_val}"/></div></td></xsl:if></xsl:if><xsl:if test="not(@nodelete) or not(@noupdate)"><td class="table-btn delete" data-row="{position()}"><xsl:if test="not(@nodelete)"><span class="formlist-row-remove btn btn-danger" rel="formlist_1"><i class="fa fa-times"/></span></xsl:if></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/formlist/igrp.formlist.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=1532608763222"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=1532608763222"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=1532608763222"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=1532608763222"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=1532608763222"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=1532608763222"/></xsl:stylesheet>