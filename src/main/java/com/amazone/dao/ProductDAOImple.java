package com.amazone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.amazone.model.ProductDetails;

public class ProductDAOImple implements ProductDAO {
	
public int DAOlogin(String userId, String Password){
		
		String sql = "select adminId , password from adminDetails where adminId = ? and password = ?";	
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		String username = null;
		String password = null;
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, userId);
			statement.setString(2, Password);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				username = rs.getString("adminId");
				password = rs.getString("password");
				if(username.equalsIgnoreCase(userId)&&(password.equalsIgnoreCase(Password)))
					result = 1;
				}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if(statement!=null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
			}
		return result;		
	}

	public void addOneProduct(ProductDetails product) {
		String sql = "insert into product values(?,?,?,?,?)";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, product.getProId());
			statement.setString(2, product.getName());
			statement.setString(3, product.getBrand());
			statement.setString(4, product.getCategory());
			statement.setDouble(5, product.getPrice());
			statement.execute();
			System.out.println("Inserted \n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}

	}

	public int updateOneProduct(int proId, double price) {
		String sql = "update Product set price = ? where proId = ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setDouble(1, price);
			statement.setInt(2, proId);
			result = statement.executeUpdate();
			if (result == 1)
				System.out.println("Updated \n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return result;
	}

	public int deleteOneProduct(int proId) {
		String sql = "delete from product where proId = ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, proId);
			result = statement.executeUpdate();
			if (result == 1)
				System.out.println("Deleted \n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return result;
	}

	public List<ProductDetails> findAllProduct() {
		String sql = "select * from product";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<ProductDetails> productList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int proId = rs.getInt("proId");
				String name = rs.getString("name");
				String brand = rs.getString("brand");
				String category = rs.getString("category");
				Double price = rs.getDouble("price");
				ProductDetails product = new ProductDetails(proId, name, brand, category, price);
				productList.add(product);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return productList;
	}

}
