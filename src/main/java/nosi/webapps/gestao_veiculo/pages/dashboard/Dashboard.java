package nosi.webapps.gestao_veiculo.pages.dashboard;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart2D;
import nosi.core.gui.components.IGRPChart3D;

public class Dashboard extends Model{		

	@RParam(rParamName = "p_data_saida")
	private String data_saida;

	@RParam(rParamName = "p_total_carro_rua_title")
	private String total_carro_rua_title;

	@RParam(rParamName = "p_total_carro_rua_lbl")
	private String total_carro_rua_lbl;

	@RParam(rParamName = "p_total_carro_rua_val")
	private String total_carro_rua_val;

	@RParam(rParamName = "p_total_carro_rua_desc")
	private String total_carro_rua_desc;

	@RParam(rParamName = "p_total_carro_rua_url")
	private String total_carro_rua_url;

	@RParam(rParamName = "p_total_carro_rua_bg")
	private String total_carro_rua_bg;

	@RParam(rParamName = "p_total_condutor_rua_title")
	private String total_condutor_rua_title;

	@RParam(rParamName = "p_total_condutor_rua_val")
	private String total_condutor_rua_val;

	@RParam(rParamName = "p_total_condutor_rua_url")
	private IGRPLink total_condutor_rua_url;
	@RParam(rParamName = "p_total_condutor_rua_url_desc")
	private String total_condutor_rua_url_desc;

	@RParam(rParamName = "p_total_condutor_rua_bg")
	private String total_condutor_rua_bg;

	@RParam(rParamName = "p_total_condutor_rua_icn")
	private String total_condutor_rua_icn;

	@RParam(rParamName = "p_total_condutor_title")
	private String total_condutor_title;

	@RParam(rParamName = "p_total_condutor_val")
	private String total_condutor_val;

	@RParam(rParamName = "p_total_condutor_url")
	private String total_condutor_url;

	@RParam(rParamName = "p_total_condutor_lbl")
	private String total_condutor_lbl;

	@RParam(rParamName = "p_total_condutor_bg")
	private String total_condutor_bg;

	@RParam(rParamName = "p_total_condutor_icn")
	private String total_condutor_icn;

	@RParam(rParamName = "p_veiculos_km_50_title")
	private String veiculos_km_50_title;

	@RParam(rParamName = "p_veiculos_km_50_val")
	private String veiculos_km_50_val;

	@RParam(rParamName = "p_veiculos_km_50_txt")
	private String veiculos_km_50_txt;

	@RParam(rParamName = "p_veiculos_km_50_url")
	private String veiculos_km_50_url;

	@RParam(rParamName = "p_veiculos_km_50_bg")
	private String veiculos_km_50_bg;

	@RParam(rParamName = "p_veiculos_km_50_icn")
	private String veiculos_km_50_icn;
	
	private List<Chart_evolucao> chart_evolucao = new ArrayList<>();	
	public void setChart_evolucao(List<Chart_evolucao> chart_evolucao){
		this.chart_evolucao = chart_evolucao;
	}
	public List<Chart_evolucao> getChart_evolucao(){
		return this.chart_evolucao;
	}

	
	private List<Chart_saida_veiculo> chart_saida_veiculo = new ArrayList<>();	
	public void setChart_saida_veiculo(List<Chart_saida_veiculo> chart_saida_veiculo){
		this.chart_saida_veiculo = chart_saida_veiculo;
	}
	public List<Chart_saida_veiculo> getChart_saida_veiculo(){
		return this.chart_saida_veiculo;
	}

	
	private List<Char_saida_condutor> char_saida_condutor = new ArrayList<>();	
	public void setChar_saida_condutor(List<Char_saida_condutor> char_saida_condutor){
		this.char_saida_condutor = char_saida_condutor;
	}
	public List<Char_saida_condutor> getChar_saida_condutor(){
		return this.char_saida_condutor;
	}

	
	public void setData_saida(String data_saida){
		this.data_saida = data_saida;
	}
	public String getData_saida(){
		return this.data_saida;
	}
	
	public void setTotal_carro_rua_title(String total_carro_rua_title){
		this.total_carro_rua_title = total_carro_rua_title;
	}
	public String getTotal_carro_rua_title(){
		return this.total_carro_rua_title;
	}
	
	public void setTotal_carro_rua_lbl(String total_carro_rua_lbl){
		this.total_carro_rua_lbl = total_carro_rua_lbl;
	}
	public String getTotal_carro_rua_lbl(){
		return this.total_carro_rua_lbl;
	}
	
	public void setTotal_carro_rua_val(String total_carro_rua_val){
		this.total_carro_rua_val = total_carro_rua_val;
	}
	public String getTotal_carro_rua_val(){
		return this.total_carro_rua_val;
	}
	
	public void setTotal_carro_rua_desc(String total_carro_rua_desc){
		this.total_carro_rua_desc = total_carro_rua_desc;
	}
	public String getTotal_carro_rua_desc(){
		return this.total_carro_rua_desc;
	}
	
	public void setTotal_carro_rua_url(String total_carro_rua_url){
		this.total_carro_rua_url = total_carro_rua_url;
	}
	public String getTotal_carro_rua_url(){
		return this.total_carro_rua_url;
	}
	
	public void setTotal_carro_rua_bg(String total_carro_rua_bg){
		this.total_carro_rua_bg = total_carro_rua_bg;
	}
	public String getTotal_carro_rua_bg(){
		return this.total_carro_rua_bg;
	}
	
	public void setTotal_condutor_rua_title(String total_condutor_rua_title){
		this.total_condutor_rua_title = total_condutor_rua_title;
	}
	public String getTotal_condutor_rua_title(){
		return this.total_condutor_rua_title;
	}
	
	public void setTotal_condutor_rua_val(String total_condutor_rua_val){
		this.total_condutor_rua_val = total_condutor_rua_val;
	}
	public String getTotal_condutor_rua_val(){
		return this.total_condutor_rua_val;
	}
	
	public IGRPLink setTotal_condutor_rua_url(String app,String page,String action){
		this.total_condutor_rua_url = new IGRPLink(app,page,action);
		return this.total_condutor_rua_url;
	}
	public IGRPLink getTotal_condutor_rua_url(){
		return this.total_condutor_rua_url;
	}
	public void setTotal_condutor_rua_url_desc(String total_condutor_rua_url_desc){
		this.total_condutor_rua_url_desc = total_condutor_rua_url_desc;
	}
	public String getTotal_condutor_rua_url_desc(){
		return this.total_condutor_rua_url_desc;
	}
	public IGRPLink setTotal_condutor_rua_url(String link){
		this.total_condutor_rua_url = new IGRPLink(link);
		return this.total_condutor_rua_url;
	}
	public IGRPLink setTotal_condutor_rua_url(Report link){
		this.total_condutor_rua_url = new IGRPLink(link);
		return this.total_condutor_rua_url;
	}
	
	public void setTotal_condutor_rua_bg(String total_condutor_rua_bg){
		this.total_condutor_rua_bg = total_condutor_rua_bg;
	}
	public String getTotal_condutor_rua_bg(){
		return this.total_condutor_rua_bg;
	}
	
	public void setTotal_condutor_rua_icn(String total_condutor_rua_icn){
		this.total_condutor_rua_icn = total_condutor_rua_icn;
	}
	public String getTotal_condutor_rua_icn(){
		return this.total_condutor_rua_icn;
	}
	
	public void setTotal_condutor_title(String total_condutor_title){
		this.total_condutor_title = total_condutor_title;
	}
	public String getTotal_condutor_title(){
		return this.total_condutor_title;
	}
	
	public void setTotal_condutor_val(String total_condutor_val){
		this.total_condutor_val = total_condutor_val;
	}
	public String getTotal_condutor_val(){
		return this.total_condutor_val;
	}
	
	public void setTotal_condutor_url(String total_condutor_url){
		this.total_condutor_url = total_condutor_url;
	}
	public String getTotal_condutor_url(){
		return this.total_condutor_url;
	}
	
	public void setTotal_condutor_lbl(String total_condutor_lbl){
		this.total_condutor_lbl = total_condutor_lbl;
	}
	public String getTotal_condutor_lbl(){
		return this.total_condutor_lbl;
	}
	
	public void setTotal_condutor_bg(String total_condutor_bg){
		this.total_condutor_bg = total_condutor_bg;
	}
	public String getTotal_condutor_bg(){
		return this.total_condutor_bg;
	}
	
	public void setTotal_condutor_icn(String total_condutor_icn){
		this.total_condutor_icn = total_condutor_icn;
	}
	public String getTotal_condutor_icn(){
		return this.total_condutor_icn;
	}
	
	public void setVeiculos_km_50_title(String veiculos_km_50_title){
		this.veiculos_km_50_title = veiculos_km_50_title;
	}
	public String getVeiculos_km_50_title(){
		return this.veiculos_km_50_title;
	}
	
	public void setVeiculos_km_50_val(String veiculos_km_50_val){
		this.veiculos_km_50_val = veiculos_km_50_val;
	}
	public String getVeiculos_km_50_val(){
		return this.veiculos_km_50_val;
	}
	
	public void setVeiculos_km_50_txt(String veiculos_km_50_txt){
		this.veiculos_km_50_txt = veiculos_km_50_txt;
	}
	public String getVeiculos_km_50_txt(){
		return this.veiculos_km_50_txt;
	}
	
	public void setVeiculos_km_50_url(String veiculos_km_50_url){
		this.veiculos_km_50_url = veiculos_km_50_url;
	}
	public String getVeiculos_km_50_url(){
		return this.veiculos_km_50_url;
	}
	
	public void setVeiculos_km_50_bg(String veiculos_km_50_bg){
		this.veiculos_km_50_bg = veiculos_km_50_bg;
	}
	public String getVeiculos_km_50_bg(){
		return this.veiculos_km_50_bg;
	}
	
	public void setVeiculos_km_50_icn(String veiculos_km_50_icn){
		this.veiculos_km_50_icn = veiculos_km_50_icn;
	}
	public String getVeiculos_km_50_icn(){
		return this.veiculos_km_50_icn;
	}


	public static class Chart_evolucao extends IGRPChart3D{
		public Chart_evolucao(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_evolucao() {
		}
	}
	public static class Chart_saida_veiculo extends IGRPChart2D{
		public Chart_saida_veiculo(String eixoX, Object eixoY) {
			super(eixoX, eixoY);
		}
		public Chart_saida_veiculo() {
		}
	}
	public static class Char_saida_condutor extends IGRPChart3D{
		public Char_saida_condutor(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Char_saida_condutor() {
		}
	}

	public void loadChart_evolucao(BaseQueryInterface query) {
		this.setChart_evolucao(this.loadTable(query,Chart_evolucao.class));
	}

	public void loadChart_saida_veiculo(BaseQueryInterface query) {
		this.setChart_saida_veiculo(this.loadTable(query,Chart_saida_veiculo.class));
	}

	public void loadChar_saida_condutor(BaseQueryInterface query) {
		this.setChar_saida_condutor(this.loadTable(query,Char_saida_condutor.class));
	}

}
