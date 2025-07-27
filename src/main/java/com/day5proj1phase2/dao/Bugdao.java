package com.day5proj1phase2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.day5proj1phase2.models.Bug;
import com.day5proj1phase2.utils.DbUtil;

public class Bugdao {
    public void insertbBug(Bug b){
        try {
           Connection con= DbUtil.getConnection();
           PreparedStatement ps=con.prepareStatement("insert into bugtable(title,description,status)values(?,?,?)");
           ps.setString(1,b.getTitle());
           ps.setString(2,b.getDescription());
           ps.setString(3,b.getStatus());
           ps.executeUpdate();
           System.out.println("Bug inserted Succesfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Bug> Display(){
        List<Bug> l = new LinkedList<>();
        try {
            Connection con=DbUtil.getConnection();
            PreparedStatement p=con.prepareStatement("SELECT * FROM bugtable");
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                  Bug b=new Bug();
                  b.setId(rs.getInt("id"));
                    b.setTitle(rs.getString("title"));
                    b.setDescription(rs.getString("description"));
                    b.setStatus(rs.getString("status"));
                    l.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        l.sort((b1, b2) -> Integer.compare(b1.getId(), b2.getId()));
        return l;
    }
    public void update(Bug b){
        try {
            Connection con=DbUtil.getConnection();
            PreparedStatement ps=con.prepareStatement("UPDATE bugtable SET status=? WHERE id=?");   
            ps.setString(1, b.getStatus());
            ps.setInt(2, b.getId());
            ps.executeUpdate();
            System.out.println("Bug updated successfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(Bug b){
        try {
            Connection con=DbUtil.getConnection();
            PreparedStatement ps=con.prepareStatement("DELETE FROM bugtable WHERE id=?");
            ps.setInt(1, b.getId());
            ps.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
