/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author nguye
 */
public class SanPhamDAO {
Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<SanPham> getTop6() {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select top 6 * from SanPham order by ngaycapnhat";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    public ArrayList<SanPham> getByCategory(int macd) {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select * from SanPham where macd=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, macd);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
}
