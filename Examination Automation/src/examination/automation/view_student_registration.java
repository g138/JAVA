/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * view_student_registration.java
 *
 * Created on 9 Sep, 2018, 1:15:14 PM
 */
package examination.automation;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hp
 */
public class view_student_registration extends javax.swing.JInternalFrame {

    /** Creates new form view_student_registration */
    public view_student_registration() {
        initComponents();
        fnx();
    }
    
    public void fnx(){
        Connection con = null;
        String str = "jdbc:odbc:Exam_auto";
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Class.forName("sun:jdbc:odbc:JdbcOdbcDriver");
            con = DriverManager.getConnection(str);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select stu_id,stu_name,course,ppr_code,pwd from student_registration");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException cnfex){
            cnfex.printStackTrace();
        }
        catch(SQLException sqlexp){
            sqlexp.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Course", "Paper Code Provided", "Password Provided"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
