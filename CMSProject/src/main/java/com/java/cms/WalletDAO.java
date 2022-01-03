package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletDAO {
	Connection connection;
	PreparedStatement pst;
	

	public Wallet searchWallet(int Walletid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
			String cmd = "select * from wallet where walletid=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, Walletid);
			Wallet wallet=null;
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
	    		wallet=new Wallet();
	    		wallet.setWalletid(rs.getInt("walletid"));
	    		wallet.setCustomerid(rs.getInt("customerid"));
	    		wallet.setWallettype(rs.getString("wallettype"));
	    		wallet.setAmount(rs.getString("amount"));
			}
		 return wallet;
		 
	}
	public Wallet searchCustomer1(int Customerid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
			String cmd = "select * from wallet where customerid=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, Customerid);
			Wallet wallet=null;
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
	    		wallet=new Wallet();
	    		wallet.setWalletid(rs.getInt("walletid"));
	    		wallet.setCustomerid(rs.getInt("customerid"));
	    		wallet.setWallettype(rs.getString("wallettype"));
	    		wallet.setAmount(rs.getString("amount"));
			}
		 return wallet;
		 
	}
}