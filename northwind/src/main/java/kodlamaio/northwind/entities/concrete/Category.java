package kodlamaio.northwind.entities.concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
@Table(name="Categories")

public class Category {
	@Id
	@Column(name="category_id")
	private int categoryId;
	@Column(name="category_name")
	private String CategoryName;

	
	public Category() {
		
		
	}
	
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		CategoryName = categoryName;
	}
	

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	
	

}
