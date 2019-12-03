package nosi.webapps.imac_soluction.pages.dashboad;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart2D;
import nosi.core.gui.components.IGRPChart3D;

public class Dashboad extends Model{		

	@RParam(rParamName = "p_circlestatbox_1_title")
	private String circlestatbox_1_title;

	@RParam(rParamName = "p_circlestatbox_1_lbl")
	private String circlestatbox_1_lbl;

	@RParam(rParamName = "p_circlestatbox_1_val")
	private String circlestatbox_1_val;

	@RParam(rParamName = "p_circlestatbox_1_desc")
	private String circlestatbox_1_desc;

	@RParam(rParamName = "p_circlestatbox_1_url")
	private String circlestatbox_1_url;

	@RParam(rParamName = "p_circlestatbox_1_bg")
	private String circlestatbox_1_bg;

	@RParam(rParamName = "p_quickbuttonbox_1_title")
	private String quickbuttonbox_1_title;

	@RParam(rParamName = "p_quickbuttonbox_1_val")
	private String quickbuttonbox_1_val;

	@RParam(rParamName = "p_quickbuttonbox_1_url")
	private IGRPLink quickbuttonbox_1_url;
	@RParam(rParamName = "p_quickbuttonbox_1_url_desc")
	private String quickbuttonbox_1_url_desc;

	@RParam(rParamName = "p_quickbuttonbox_1_bg")
	private String quickbuttonbox_1_bg;

	@RParam(rParamName = "p_quickbuttonbox_1_icn")
	private String quickbuttonbox_1_icn;

	@RParam(rParamName = "p_smallbox_1_title")
	private String smallbox_1_title;

	@RParam(rParamName = "p_smallbox_1_val")
	private String smallbox_1_val;

	@RParam(rParamName = "p_smallbox_1_url")
	private String smallbox_1_url;

	@RParam(rParamName = "p_smallbox_1_lbl")
	private String smallbox_1_lbl;

	@RParam(rParamName = "p_smallbox_1_bg")
	private String smallbox_1_bg;

	@RParam(rParamName = "p_smallbox_1_icn")
	private String smallbox_1_icn;

	@RParam(rParamName = "p_statbox_1_title")
	private String statbox_1_title;

	@RParam(rParamName = "p_statbox_1_val")
	private String statbox_1_val;

	@RParam(rParamName = "p_statbox_1_txt")
	private String statbox_1_txt;

	@RParam(rParamName = "p_statbox_1_url")
	private String statbox_1_url;

	@RParam(rParamName = "p_statbox_1_bg")
	private String statbox_1_bg;

	@RParam(rParamName = "p_statbox_1_icn")
	private String statbox_1_icn;

	@RParam(rParamName = "p_data_saida")
	private String data_saida;
	
	private List<Line> line = new ArrayList<>();	
	public void setLine(List<Line> line){
		this.line = line;
	}
	public List<Line> getLine(){
		return this.line;
	}

	
	private List<Pie> pie = new ArrayList<>();	
	public void setPie(List<Pie> pie){
		this.pie = pie;
	}
	public List<Pie> getPie(){
		return this.pie;
	}

	
	private List<Column> column = new ArrayList<>();	
	public void setColumn(List<Column> column){
		this.column = column;
	}
	public List<Column> getColumn(){
		return this.column;
	}

	
	public void setCirclestatbox_1_title(String circlestatbox_1_title){
		this.circlestatbox_1_title = circlestatbox_1_title;
	}
	public String getCirclestatbox_1_title(){
		return this.circlestatbox_1_title;
	}
	
	public void setCirclestatbox_1_lbl(String circlestatbox_1_lbl){
		this.circlestatbox_1_lbl = circlestatbox_1_lbl;
	}
	public String getCirclestatbox_1_lbl(){
		return this.circlestatbox_1_lbl;
	}
	
	public void setCirclestatbox_1_val(String circlestatbox_1_val){
		this.circlestatbox_1_val = circlestatbox_1_val;
	}
	public String getCirclestatbox_1_val(){
		return this.circlestatbox_1_val;
	}
	
	public void setCirclestatbox_1_desc(String circlestatbox_1_desc){
		this.circlestatbox_1_desc = circlestatbox_1_desc;
	}
	public String getCirclestatbox_1_desc(){
		return this.circlestatbox_1_desc;
	}
	
	public void setCirclestatbox_1_url(String circlestatbox_1_url){
		this.circlestatbox_1_url = circlestatbox_1_url;
	}
	public String getCirclestatbox_1_url(){
		return this.circlestatbox_1_url;
	}
	
	public void setCirclestatbox_1_bg(String circlestatbox_1_bg){
		this.circlestatbox_1_bg = circlestatbox_1_bg;
	}
	public String getCirclestatbox_1_bg(){
		return this.circlestatbox_1_bg;
	}
	
	public void setQuickbuttonbox_1_title(String quickbuttonbox_1_title){
		this.quickbuttonbox_1_title = quickbuttonbox_1_title;
	}
	public String getQuickbuttonbox_1_title(){
		return this.quickbuttonbox_1_title;
	}
	
	public void setQuickbuttonbox_1_val(String quickbuttonbox_1_val){
		this.quickbuttonbox_1_val = quickbuttonbox_1_val;
	}
	public String getQuickbuttonbox_1_val(){
		return this.quickbuttonbox_1_val;
	}
	
	public IGRPLink setQuickbuttonbox_1_url(String app,String page,String action){
		this.quickbuttonbox_1_url = new IGRPLink(app,page,action);
		return this.quickbuttonbox_1_url;
	}
	public IGRPLink getQuickbuttonbox_1_url(){
		return this.quickbuttonbox_1_url;
	}
	public void setQuickbuttonbox_1_url_desc(String quickbuttonbox_1_url_desc){
		this.quickbuttonbox_1_url_desc = quickbuttonbox_1_url_desc;
	}
	public String getQuickbuttonbox_1_url_desc(){
		return this.quickbuttonbox_1_url_desc;
	}
	public IGRPLink setQuickbuttonbox_1_url(String link){
		this.quickbuttonbox_1_url = new IGRPLink(link);
		return this.quickbuttonbox_1_url;
	}
	public IGRPLink setQuickbuttonbox_1_url(Report link){
		this.quickbuttonbox_1_url = new IGRPLink(link);
		return this.quickbuttonbox_1_url;
	}
	
	public void setQuickbuttonbox_1_bg(String quickbuttonbox_1_bg){
		this.quickbuttonbox_1_bg = quickbuttonbox_1_bg;
	}
	public String getQuickbuttonbox_1_bg(){
		return this.quickbuttonbox_1_bg;
	}
	
	public void setQuickbuttonbox_1_icn(String quickbuttonbox_1_icn){
		this.quickbuttonbox_1_icn = quickbuttonbox_1_icn;
	}
	public String getQuickbuttonbox_1_icn(){
		return this.quickbuttonbox_1_icn;
	}
	
	public void setSmallbox_1_title(String smallbox_1_title){
		this.smallbox_1_title = smallbox_1_title;
	}
	public String getSmallbox_1_title(){
		return this.smallbox_1_title;
	}
	
	public void setSmallbox_1_val(String smallbox_1_val){
		this.smallbox_1_val = smallbox_1_val;
	}
	public String getSmallbox_1_val(){
		return this.smallbox_1_val;
	}
	
	public void setSmallbox_1_url(String smallbox_1_url){
		this.smallbox_1_url = smallbox_1_url;
	}
	public String getSmallbox_1_url(){
		return this.smallbox_1_url;
	}
	
	public void setSmallbox_1_lbl(String smallbox_1_lbl){
		this.smallbox_1_lbl = smallbox_1_lbl;
	}
	public String getSmallbox_1_lbl(){
		return this.smallbox_1_lbl;
	}
	
	public void setSmallbox_1_bg(String smallbox_1_bg){
		this.smallbox_1_bg = smallbox_1_bg;
	}
	public String getSmallbox_1_bg(){
		return this.smallbox_1_bg;
	}
	
	public void setSmallbox_1_icn(String smallbox_1_icn){
		this.smallbox_1_icn = smallbox_1_icn;
	}
	public String getSmallbox_1_icn(){
		return this.smallbox_1_icn;
	}
	
	public void setStatbox_1_title(String statbox_1_title){
		this.statbox_1_title = statbox_1_title;
	}
	public String getStatbox_1_title(){
		return this.statbox_1_title;
	}
	
	public void setStatbox_1_val(String statbox_1_val){
		this.statbox_1_val = statbox_1_val;
	}
	public String getStatbox_1_val(){
		return this.statbox_1_val;
	}
	
	public void setStatbox_1_txt(String statbox_1_txt){
		this.statbox_1_txt = statbox_1_txt;
	}
	public String getStatbox_1_txt(){
		return this.statbox_1_txt;
	}
	
	public void setStatbox_1_url(String statbox_1_url){
		this.statbox_1_url = statbox_1_url;
	}
	public String getStatbox_1_url(){
		return this.statbox_1_url;
	}
	
	public void setStatbox_1_bg(String statbox_1_bg){
		this.statbox_1_bg = statbox_1_bg;
	}
	public String getStatbox_1_bg(){
		return this.statbox_1_bg;
	}
	
	public void setStatbox_1_icn(String statbox_1_icn){
		this.statbox_1_icn = statbox_1_icn;
	}
	public String getStatbox_1_icn(){
		return this.statbox_1_icn;
	}
	
	public void setData_saida(String data_saida){
		this.data_saida = data_saida;
	}
	public String getData_saida(){
		return this.data_saida;
	}


	public static class Line extends IGRPChart3D{
		public Line(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Line() {
		}
	}
	public static class Pie extends IGRPChart2D{
		public Pie(String eixoX, Object eixoY) {
			super(eixoX, eixoY);
		}
		public Pie() {
		}
	}
	public static class Column extends IGRPChart3D{
		public Column(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Column() {
		}
	}

	public void loadLine(BaseQueryInterface query) {
		this.setLine(this.loadTable(query,Line.class));
	}

	public void loadPie(BaseQueryInterface query) {
		this.setPie(this.loadTable(query,Pie.class));
	}

	public void loadColumn(BaseQueryInterface query) {
		this.setColumn(this.loadTable(query,Column.class));
	}

}
