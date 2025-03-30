/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlsv;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author NVK
 */
public class MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    String url = "jdbc:sqlserver://192.168.1.10:1436;databaseName=QLSV;encrypt=true;trustServerCertificate=true";
    String user = "userQLSV";
    String password = "userisgay";
    public void loadDataFromDatabase()
    {
        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from dbo.sinhvien");
            
            DefaultTableModel model = (DefaultTableModel)jTableDataSinhVien.getModel();
            model.setRowCount(0);
            
            while(rs.next())
            {
                String a = rs.getString("ID");
                String b = rs.getString("Name");
                String c = rs.getString("Age");
                String d = rs.getString("Phone");
                String e = rs.getString("Email");
                
                model.addRow(new Object[]{a, b, c, d, e});
            }
            JOptionPane.showMessageDialog(this, "LOAD DATA SUCCESS!", "ALERT", JOptionPane.INFORMATION_MESSAGE);
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDataSinhVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtFindID = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtFindName = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtFindPhone = new javax.swing.JTextField();
        loadButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableDataSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Phone Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDataSinhVien.setCellSelectionEnabled(true);
        jTableDataSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellClick(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDataSinhVien);

        jScrollPane2.setViewportView(jScrollPane1);

        lbID.setText("ID");
        lbID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbName.setText("NAME");
        lbName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbAge.setText("AGE");
        lbAge.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbPhone.setText("PHONE");
        lbPhone.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbEmail.setText("EMAIL");
        lbEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtID)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail)))
        );

        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataToDatabase(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editData(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteData(evt);
            }
        });

        jButton4.setText("FIND ID");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findDataWithID(evt);
            }
        });

        txtFindID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setText("FIND NAME");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findDataWithName(evt);
            }
        });

        txtFindName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setText("FIND PHONE");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findDataWithPhone(evt);
            }
        });

        txtFindPhone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        loadButton.setText("LOAD");
        loadButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFindPhone))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFindID)
                            .addComponent(txtFindName)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFindID, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFindName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFindPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cellClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellClick
        int row = jTableDataSinhVien.getSelectedRow();
        if(row >= 0)
        {
            String a = jTableDataSinhVien.getValueAt(row, 0).toString();
            String b = jTableDataSinhVien.getValueAt(row, 1).toString();
            String c = jTableDataSinhVien.getValueAt(row, 2).toString();
            String d = jTableDataSinhVien.getValueAt(row, 3).toString();
            String e = jTableDataSinhVien.getValueAt(row, 4).toString();
            
            txtID.setText(a);
            txtName.setText(b);
            txtAge.setText(c);
            txtPhone.setText(d);
            txtEmail.setText(e);
        }
    }//GEN-LAST:event_cellClick

    private void addDataToDatabase(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataToDatabase
                               
    try {
        Connection conn = DriverManager.getConnection(url, user, password);

        // Câu lệnh INSERT dùng PreparedStatement để tránh lỗi SQL Injection
        String query = "INSERT INTO dbo.sinhvien (ID, Name, Age, Phone, Email) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        
        pstmt.setString(1, txtID.getText().trim());
        pstmt.setString(2, txtName.getText().trim());
        pstmt.setInt(3, Integer.parseInt(txtAge.getText().trim())); // Chuyển Age về kiểu số
        pstmt.setString(4, txtPhone.getText().trim());
        pstmt.setString(5, txtEmail.getText().trim());

        // Thực thi câu lệnh INSERT
        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Thêm thành công", "ALERT", JOptionPane.INFORMATION_MESSAGE);
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Tuổi không hợp lệ", "ERROR", JOptionPane.ERROR_MESSAGE);
    }                                
    }//GEN-LAST:event_addDataToDatabase

    private void editData(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editData
        // TODO add your handling code here:
        int row = jTableDataSinhVien.getSelectedRow();
        String _tempID = txtID.getText();
        if(row >= 0){
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                String query = "Update dbo.sinhvien set ID = ?, Name = ?, Age = ?, Phone = ?, Email = ? where ID = ?";
                
                PreparedStatement pstmt = conn.prepareStatement(query);
                
                pstmt.setString(1, txtID.getText().trim());
                pstmt.setString(2, txtName.getText().trim());
                pstmt.setInt(3, Integer.parseInt(txtAge.getText().trim())); // Chuyển Age về kiểu số
                pstmt.setString(4, txtPhone.getText().trim());
                pstmt.setString(5, txtEmail.getText().trim());
                pstmt.setString(6, _tempID.trim());
                
                pstmt.executeUpdate();
                pstmt.close();
                conn.close();
                JOptionPane.showMessageDialog(this, "Sửa thành công", "CONGRATULATION!!!", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Tuổi không hợp lệ!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editData

    private void deleteData(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteData
        // TODO add your handling code here:
        int row = jTableDataSinhVien.getSelectedRow();
        
        if(row >= 0){
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                
                String query = "Delete from dbo.sinhvien where id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                
                int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa ID " + txtID.getText(), "ALERT", JOptionPane.OK_CANCEL_OPTION);
                if(x == 0){
                    try{
                        pstmt.setString(1, txtID.getText().trim());
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(this, "SUCCESS", "CONGRATULATION!!!", JOptionPane.INFORMATION_MESSAGE);
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(this, "Somthing went wrong!", "ERROR", JOptionPane.ERROR);
                    }
                }
                else
                {
                    pstmt.close();
                    conn.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteData

    private void findDataWithID(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDataWithID
        // TODO add your handling code here:
        if(txtFindID.getText().isEmpty()){
            return;
        }
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            
            String query = "Select * from dbo.sinhvien where ID = " + txtFindID.getText();
            
            ResultSet rs = stmt.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)jTableDataSinhVien.getModel();
            model.setRowCount(0);
            int count = 0;
            while(rs.next()){
                String a = rs.getString("ID");
                String b = rs.getString("Name");
                String c = rs.getString("Age");
                String d = rs.getString("Phone");
                String e = rs.getString("Email");
                model.addRow(new Object[]{a, b, c, d, e});
                count++;
            }
            if(count == 0){
                JOptionPane.showMessageDialog(this, "DATA NOT FOUND", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                stmt.close();
                conn.close();
            }else{
                JOptionPane.showMessageDialog(this, "DATA FOUND", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                stmt.close();
                conn.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something went wrong!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findDataWithID

    private void findDataWithName(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDataWithName
        // TODO add your handling code here:
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            
            String query = "Select * from dbo.sinhvien where Name = " + txtFindName.getText();
            
            ResultSet rs = stmt.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)jTableDataSinhVien.getModel();
            model.setRowCount(0);
            int count = 0;
            while(rs.next()){
                String a = rs.getString("ID");
                String b = rs.getString("Name");
                String c = rs.getString("Age");
                String d = rs.getString("Phone");
                String e = rs.getString("Email");
                model.addRow(new Object[]{a, b, c, d, e});
                count++;
            }
            if(count == 0){
                JOptionPane.showMessageDialog(this, "DATA NOT FOUND", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                stmt.close();
                conn.close();
            }else{
                JOptionPane.showMessageDialog(this, "DATA FOUND", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                stmt.close();
                conn.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something went wrong!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findDataWithName

    private void findDataWithPhone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDataWithPhone
        // TODO add your handling code here:
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            
            String query = "Select * from dbo.sinhvien where Phone = " + txtFindPhone.getText();
            
            ResultSet rs = stmt.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)jTableDataSinhVien.getModel();
            model.setRowCount(0);
            int count = 0;
            while(rs.next()){
                String a = rs.getString("ID");
                String b = rs.getString("Name");
                String c = rs.getString("Age");
                String d = rs.getString("Phone");
                String e = rs.getString("Email");
                model.addRow(new Object[]{a, b, c, d, e});
                count++;
            }
            if(count == 0){
                JOptionPane.showMessageDialog(this, "DATA NOT FOUND", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                stmt.close();
                conn.close();
            }else{
                JOptionPane.showMessageDialog(this, "DATA FOUND", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                stmt.close();
                conn.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something went wrong!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findDataWithPhone

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        loadDataFromDatabase();
    }//GEN-LAST:event_loadButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDataSinhVien;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFindID;
    private javax.swing.JTextField txtFindName;
    private javax.swing.JTextField txtFindPhone;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
