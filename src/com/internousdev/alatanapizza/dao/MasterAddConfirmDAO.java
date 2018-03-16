package com.internousdev.alatanapizza.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.alatanapizza.dto.ProductDTO2;
import com.internousdev.alatanapizza.util.DBConnector;



public class MasterAddConfirmDAO {

	private DBConnector dbConnector=new DBConnector();

	private Connection connection=dbConnector.getConnection();

	ProductDTO2 dto=new ProductDTO2();



	private String sql="SELECT* from product_info where itemName=?\"";




public ProductDTO2 checkItemInfo(String itemName,String itemKanaName) throws SQLException{

	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);

		preparedStatement.setString(1, itemName);
		preparedStatement.setString(2, itemKanaName);


		ResultSet resultSet=preparedStatement.executeQuery();

			if(!(resultSet.getString("product_name").equals(itemName))) {
				dto.setItemName(itemName);
				dto.setItemKanaName(itemKanaName);

			}

	}catch(Exception e){
		throw new RuntimeException(e);
	}finally{
		connection.close();
	}

	return dto;
}



}








