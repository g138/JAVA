/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * student_test.java
 *
 * Created on 29 Aug, 2018, 2:23:32 PM
 */
package examination.automation;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author hp
 */
public class student_test extends javax.swing.JFrame {
int qno = 1;
int i = 0;
String stu_id, stu_name;
    /** Creates new form student_test */
    public student_test() {
        
        
        
    }
    public student_test(String id, String name){
        initComponents();
        this.stu_id = id;
        this.stu_name = name;
        jLabel2.setText((stu_id));
        jLabel15.setText(name);
        fnx4();
        fnx1();
        fnx2();
        fnx();
        jTextField1.setEditable(false);
        jLabel2.setVisible(false);
        jLabel14.setVisible(false);
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 24));
        jLabel1.setText("Welcome");

        jLabel2.setText("jLabel2");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jLabel3.setText("Paper Code:");

        jLabel4.setFont(jLabel4.getFont().deriveFont((float)18));
        jLabel4.setText("jLabel4");

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jLabel5.setText("Question Number:");

        jLabel6.setFont(jLabel6.getFont().deriveFont((float)18));
        jLabel6.setText("jLabel6");

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jLabel7.setText("Qusetion:");

        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getStyle() | java.awt.Font.BOLD, 16));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD, 17));
        jButton1.setText("Next >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(jRadioButton1.getFont().deriveFont((float)20));
        jRadioButton1.setText("A");

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getStyle() | java.awt.Font.BOLD, 17));
        jLabel8.setText("jLabel8");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(jRadioButton2.getFont().deriveFont((float)20));
        jRadioButton2.setText("B");

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getStyle() | java.awt.Font.BOLD, 17));
        jLabel9.setText("jLabel9");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(jRadioButton3.getFont().deriveFont((float)18));
        jRadioButton3.setText("C");

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getStyle() | java.awt.Font.BOLD, 17));
        jLabel10.setText("jLabel10");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(jRadioButton4.getFont().deriveFont((float)20));
        jRadioButton4.setText("D");

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getStyle() | java.awt.Font.BOLD, 17));
        jLabel11.setText("jLabel11");

        jLabel12.setFont(jLabel12.getFont().deriveFont((float)18));
        jLabel12.setText("jLabel12");

        jLabel13.setFont(jLabel13.getFont().deriveFont(jLabel13.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jLabel13.setText("Total Question:");

        jLabel14.setText("jLabel14");

        jLabel15.setFont(jLabel15.getFont().deriveFont((jLabel15.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 24));
        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(1252, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 828, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(239, 239, 239))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel15))
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(545, 545, 545)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel12)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(436, 436, 436)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))
                                .addGap(74, 74, 74)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel11))
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void fnx(){
   // fnx2();
    Connection con = null;
    try{
        String str = "jdbc:odbc:Exam_auto";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection(str);
        Statement st = con.createStatement();
     
        ResultSet rs = st.executeQuery("Select * from create_question_paper where ppr_code = '"+jLabel4.getText()+"' and qid = "+qno+" ");
        if(rs.next()){
            if(qno == Integer.parseInt(jLabel12.getText())){
                jTextField1.setText(rs.getString("qs"));
                jLabel8.setText(rs.getString("opt_a"));
                jLabel9.setText(rs.getString("opt_b"));
                jLabel10.setText(rs.getString("opt_c"));
                jLabel11.setText(rs.getString("opt_d"));
                jLabel6.setText(Integer.toString(qno));
                jLabel14.setText(rs.getString("correct_opt"));
                //qno = qno +1;
                jButton1.setText("Result");
                
            }
            else{
                jTextField1.setText(rs.getString("qs"));
                jLabel8.setText(rs.getString("opt_a"));
                jLabel9.setText(rs.getString("opt_b"));
                jLabel10.setText(rs.getString("opt_c"));
                jLabel11.setText(rs.getString("opt_d"));
                jLabel6.setText(Integer.toString(qno));
                jLabel14.setText(rs.getString("correct_opt"));
                qno = qno +1;
            }
            
        }
        con.close();
        st.close();
    }
    catch(ClassNotFoundException cnfex){
        cnfex.printStackTrace();
    }
    catch(SQLException sqlexp){
        sqlexp.printStackTrace();
    }
}

Timer timer = new Timer();
public void fnx4(){
    //i = 0;
    //TimerTask tsk1  = new TimerTask();
    TimerTask task = new TimerTask(){
        public void run(){
           if(jButton1.getText().equals("Result")){
               timer.cancel();
           }
           else{
               if(i == 10){
                   fnx();
                   i = 0;
               }
               i++;
               jLabel16.setText(Integer.toString(i));
           }
        }
    };
    timer.schedule(task, 0, 1000);
}

public void fnx2(){
   // fnx1();
    Connection con = null;
    //int stu_id = 1;
    try{
        String str = "jdbc:odbc:Exam_auto";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection(str);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(" Select max(qid) as max_qid from create_question_paper where ppr_code = '"+jLabel4.getText()+"' ");
        if(rs.next()){
            jLabel12.setText(Integer.toString(rs.getInt("max_qid")));
        }
        con.close();
        st.close();
        
    }
    catch(ClassNotFoundException cnfex){
        cnfex.printStackTrace();
    }
    catch(SQLException sqlexp){
        sqlexp.printStackTrace();
    }
}

public void fnx1(){
    Connection con = null;
   
    try{
        String str = "jdbc:odbc:Exam_auto";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection(str);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(" Select ppr_code from student_registration where stu_id = '"+(jLabel2.getText())+"' ");
        if(rs.next()){
            jLabel4.setText(rs.getString("ppr_code"));
        }
        con.close();
        st.close();
    }
    catch(ClassNotFoundException cnfex){
        cnfex.printStackTrace();
    }
    catch(SQLException sqlexp){
        sqlexp.printStackTrace();
    }
}


public void fnx3(){
    jRadioButton1.setActionCommand(jRadioButton1.getText());
    jRadioButton2.setActionCommand(jRadioButton2.getText());
    jRadioButton3.setActionCommand(jRadioButton3.getText());
    jRadioButton4.setActionCommand(jRadioButton4.getText());
    Connection con = null;
    int stu_id = 1;
    //String sel = buttonGroup1.;
    if(buttonGroup1.getSelection() != null){
        try{
        String str = "jdbc:odbc:Exam_auto";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection(str);
        Statement st = con.createStatement();
        int i = st.executeUpdate(" Insert into save_attempt values("+Integer.parseInt(jLabel6.getText())+", '"+(buttonGroup1.getSelection().getActionCommand()) +"', '"+jLabel2.getText()+"', '"+jLabel4.getText()+"' ) ");
        con.close();
        st.close();
        }
        catch(ClassNotFoundException cnfex){
            cnfex.printStackTrace();
        }
        catch(SQLException sqlexp){
            sqlexp.printStackTrace();
        }
    }
}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
   if(jButton1.getText().equals("Result")){
       fnx4();
       fnx3();
       new result(jLabel2.getText()).setVisible(true);
       this.dispose();
   }
   else{
      // fnx4();
       fnx3();
       fnx();
       
       i = 0;
   }
    
}//GEN-LAST:event_jButton1ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(student_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new student_test().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}