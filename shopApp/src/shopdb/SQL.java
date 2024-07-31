package shopdb;

public class SQL {
	
	//customer
	public static final String INSERT_CUSTOMER = "insert into `customer` set "
											   + "`custId`=?,"
											   + "`name`=?, "
											   + "`hp`=?, "
											   + "`addr`=?, "
											   + "`rdate`=now() ";
											   
	public static final String SELECT_CUSTOMER = "select * from `customer` where `custId`=?";
	public static final String SELECT_CUSTOMERS = "select * from `customer`";
	public static final String UPDATE_CUSTOMER = "update `customer` set `"
											   + "`name`=?, "
											   + "`hp`=?, "
											   + "`addr`=? "
											   + "where `custId`=?";
	public static final String DELETE_CUSTOMER = "delete from `customer` where `custId`=?";
	
	//order
	public static final String INSERT_ORDER = "insert into `order` "
											+ "(`orderId`, `orderProduct`, `orderCount`,`orderDate`)"
											+ " values (?,?,?,now())";
	public static final String SELEET_ORDER = "select a.`orderNo`, a.`orderProduct`, c.`proName`,a.`orderCount`,b.`name`, a.`orderDate` "
											+ "from `order` as a "
											+ "join `customer` as b "
											+ "on a.`orderId` = b.`custId` "
											+ "join `product` as c "
											+ "on a.`orderProduct` = c.`prodNo` "
											+ "where b.`custId` = ?"; 
											
	
	//product
	public static final String INSERT_PRODUCT = "insert into `product` set "
											  + "`proName`=?, "
											  + "`stock`=?, "
											  + "`price`=?, "
											  + "`company`=? ";
	public static final String SELECT_PRODUCT = "select * from `product` where `prodNo`=?";
	public static final String SELECT_PRODUCTS = "select * from `product`";
	public static final String UPDATE_PRODUCT = "update `product` set `"
			   								   + "`proName`=?, "
			   								   + "`stock`=?, "
			   								   + "`price`=?, "
			   								   + "`company`=? "
			   								   + "where `prodNo`=?";
	public static final String DELETE_PRODUCT = "delete from `product` where `prodNo`=?";
}
