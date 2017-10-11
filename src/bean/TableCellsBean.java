package bean;

import java.util.ArrayList;
import java.util.List;

public class TableCellsBean {

    private String name;
    private double value;

    public TableCellsBean(String name,double value){
        this.name = name;
        this.value = value;
    }
    public static List<TableCellsBean> getDatasource(){
    	//Collection<TableCellsBean> coll = new ArrayList<TableCellsBean>();
        List<TableCellsBean> coll = new ArrayList<TableCellsBean>();
//        String[] values = fieldValue.split(":");
//        for (String v : values) {
//            String[] sp = v.split("_");
            coll.add(new TableCellsBean("abc", 22.26));
            coll.add(new TableCellsBean("pqr", 11.26));
            coll.add(new TableCellsBean("xyz", 33.26));
//        }
        return coll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
