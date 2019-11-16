package com.dataaccess.AccessDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.dataaccess.model.customer;

public class customerDao {

	private String sql="insert into customer(fname, gender, category, message) values(?,?,?,?)";
	private String sqllist="select custid,fname,gender, category, message from customer  order by custid";
	private String sqllistsearch=
"select custid,fname,gender, category, message from customer where  fname=? OR gender=? OR category=? OR message LIKE ? order by custid";
	@Resource(name="jdbc/web_test")
	private DataSource resource;
	
	
	public customerDao() {
		
		
		try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            this.resource = (DataSource) envContext.lookup("jdbc/web_wap");
            System.out.println("connected");
        } catch (NamingException e) {
            System.err.println(e);
        }
	}
	
	public int insertdata(customer cust) {
		
		try {
			Connection con=resource.getConnection();
			
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1, cust.getFname());
			st.setString(2, cust.getGender());
			st.setString(3, cust.getCategory());
			st.setString(4, cust.getMessage());
			
			int flag=	st.executeUpdate();
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("can not insert");
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<customer> searchCustomers(String input){
		List<customer> custs=new ArrayList<>();
		
		
		try {
			Connection con=resource.getConnection();
			
			PreparedStatement st= con.prepareStatement(sqllistsearch);
							
							st.setString(1, input);
							st.setString(2, input);
							st.setString(3,input);
							st.setString(4, "%" + input + "%");
			ResultSet rs=	st.executeQuery();
			while(rs.next()) {
				custs.add(new customer(rs.getInt("custid"),rs.getString("fname"),rs.getString("gender"),rs.getString("category"),rs.getString("message")));
				
			}
			return custs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("can not insert");
			e.printStackTrace();
		}
		
		return custs;
	
		
	} 
	public List<customer> allCustomers(){
		List<customer> custs=new ArrayList<>();
		try {
			Connection con=resource.getConnection();
			
			PreparedStatement st= con.prepareStatement(sqllist);
		
			ResultSet rs=	st.executeQuery();
			while(rs.next()) {
				custs.add(new customer(rs.getInt("custid"),rs.getString("fname"),rs.getString("gender"),rs.getString("category"),rs.getString("message")));
				
			}
			return custs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("can not insert");
			e.printStackTrace();
		}
		
		return custs;
	}
	
	public static void main(String args[]) {
		
		new customerDao();
	}
}
