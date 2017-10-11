package bean;

import java.util.List;

public class Person {
	private int id;
	private String name;
	// private List<Address> address;
	private List<TableCellsBean> tableBeanCollection;

	public final List<TableCellsBean> getTableBeanCollection() {
		return tableBeanCollection;
	}

	public final void setTableBeanCollection(List<TableCellsBean> tableBeanCollection) {
		this.tableBeanCollection = tableBeanCollection;
	}

	public Person() {

	}

	/*
	 * public List<Address> getAddress() { return address; }
	 * 
	 * public void setAddress(List<Address> address) { this.address = address; }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
