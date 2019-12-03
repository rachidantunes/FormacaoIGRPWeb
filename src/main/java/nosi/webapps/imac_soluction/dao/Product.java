package nosi.webapps.imac_soluction.dao;

import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import nosi.base.ActiveRecord.BaseActiveRecord;

@Entity
@Table(name="tbl_produto")
public class Product extends BaseActiveRecord<Product>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "reference", nullable = true)
	private String reference;
	
	private String fileId;
	
	@OneToMany(mappedBy = "product")
	@JsonIgnore
	private Set<Purchase> purchases;
	
	public Product() {
		this.setReadOnly(true);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Set<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(Set<Purchase> purchases) {
		this.purchases = purchases;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	
}
