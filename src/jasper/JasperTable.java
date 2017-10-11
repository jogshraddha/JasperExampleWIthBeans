package jasper;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import bean.Person;
import bean.TableCellsBean;

public class JasperTable {
	static Logger logger = Logger.getLogger("JasperTable");
	public static List<Person> main() {
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("AAAA");
		List<TableCellsBean> dataSource = TableCellsBean.getDatasource(); 
		System.out.println(dataSource);
		p1.setTableBeanCollection(dataSource);
		/*List<Address> pa1 = new ArrayList<Address>();
		Address a1 = new Address();
		a1.setId(1);
		a1.setStreet("Karve road");
		a1.setLandmark("mall");
		a1.setPincode("411038");

		Address a2 = new Address();
		a2.setId(2);
		a2.setStreet("Karve road");
		a2.setLandmark("mall");
		a2.setPincode("411038");

		Address a3 = new Address();
		a3.setId(3);
		a3.setStreet("Karve road");
		a2.setLandmark("mall");
		a3.setPincode("411038");
		p1.setAddress(pa1);

		pa1.add(a1);
		pa1.add(a2);
		pa1.add(a3);
*/		
		/*Person p2 = new Person();
		p2.setId(2);
		List<String> pa2 = new ArrayList<String>();
		pa2.add("aa");
		pa2.add("bb");
		pa2.add("cc");
		p2.setAddress(pa2);
		p2.setName("BBB");
		
		Person p3 = new Person();
		p3.setId(3);
		p3.setName("CCC");
		p3.setAddress(pa2);*/
		
		
		people.add(p1);
		//logger.info("P1 added");
		//people.add(p2);
		//logger.info("P2 added");
		//people.add(p3);
		System.out.print("Hello world! " + people.toString());
		return people;
	}
}
