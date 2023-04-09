import java.sql.*;



import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
public class DbModel {


	String connection = "jdbc:mysql://localhost:3306/ite201infosystem";
	String username = "cay";
	String password = "12345678";
	
	Connection con;
	PreparedStatement create;
	String query;
	ResultSet rs;
	
	public void SaveButton(JTable tblstud, String studId, String studName, String studSex){
		try {
			
			Connection con = DriverManager.getConnection(connection, username, password);					
			String query ="INSERT INTO tblstudents(studID, studName, studSex) VALUES(?, ?, ?)";
			PreparedStatement create = con.prepareStatement(query);
			
			create.setString(1, studId);
			create.setString(2, studName);
			create.setString(3,  studSex);
			create.executeUpdate();
			JOptionPane.showMessageDialog(null,  "The information is saved succesfuly");
			
			String sqlAll = "Select * from tblStudents";
			PreparedStatement findAll = con.prepareStatement(sqlAll);
			ResultSet rs = findAll.executeQuery();
			tblstud.setModel(DbUtils.resultSetToTableModel(rs));
			con.close();
		
			

		} catch (Exception err) {
			{System.out.print(err);}
		}
		
	}
	
	public void ViewTable(JTable tblStudents) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(connection, username, password);
			
			
			//selecting record from the table
			String sqlAll = "Select * from tblStudents";
			PreparedStatement findAll = conn.prepareStatement(sqlAll);
			ResultSet rs = findAll.executeQuery();
			tblStudents.setModel(DbUtils.resultSetToTableModel(rs));
			
		
			conn.close();
			
		
		}catch(Exception e) {System.out.println(e);}
	}
	
	public void DeleteButton(JTable tblStud, String StudId) {
		try {
			Connection con = DriverManager.getConnection(connection, username, password);
			
			String query ="DELETE FROM tblstudents WHERE studID = ?";
			PreparedStatement create = con.prepareStatement(query);
			create.setString(1,  StudId);
			create.execute();
			
			String sqlAll = "Select * from tblStudents";
			PreparedStatement findAll = con.prepareStatement(sqlAll);
			ResultSet rs = findAll.executeQuery();
			tblStud.setModel(DbUtils.resultSetToTableModel(rs));
			con.close();
			
			String[] header = {"ID", "NAME", "SEX"};
			DefaultTableModel dtm = (DefaultTableModel) tblStud.getModel();
			dtm.setColumnIdentifiers(header);
			JOptionPane.showMessageDialog(null,  "The information is deleted succesfuly");
			
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
	}
	


	public void SearchBox(JTable tblStud, String SearchBox) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(connection, username, password);
			
			String qryFind = "Select * from tblStudents where studId = ?";
			PreparedStatement find = conn.prepareStatement(qryFind);
			find.setString(1, SearchBox);
			ResultSet rs=find.executeQuery();
			tblStud.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception ex) {System.out.println(ex);}
		
	}
	
	public void UpdateButton(JTable tblstud, String studId, String studName, String studSex) {
		try {

			Connection con = DriverManager.getConnection(connection, username, password);					
			String query ="UPDATE tblstudents SET studName = ? , studSex = ? WHERE studID = ?";
			PreparedStatement create = con.prepareStatement(query);
		    create.setString(1,  studName);
			create.setString(2,  studSex);
		    create.setString(3,  studId);
			create.executeUpdate();
			
			JOptionPane.showMessageDialog(null,  "The information is updated succesfuly");
			
			String sqlAll = "Select * from tblStudents";
			PreparedStatement findAll = con.prepareStatement(sqlAll);
			ResultSet rs = findAll.executeQuery();
			tblstud.setModel(DbUtils.resultSetToTableModel(rs));
			
			con.close();
			
		}catch(Exception a) {System.out.println(a);}
	} 
}
