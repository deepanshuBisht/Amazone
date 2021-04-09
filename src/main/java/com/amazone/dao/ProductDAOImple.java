package com.amazone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.amazone.model.ProductDetails;

public class ProductDAOImple implements ProductDAO {

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
			System.out.println("Deleted \n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement != null)
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
		// TODO Auto-generated method stub
		return null;
	}


}
