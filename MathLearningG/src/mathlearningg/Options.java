/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathlearningg;

import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    public String username ;
    Myprofile a= new Myprofile();
  
    public int sum []= new int [1000];
    
    public int wrong []= new int [1000];
    public int   right[]= new int [1000];
     public int sum2 []= new int [1000];
    
    public int wrong2 []= new int [1000];
    public int   right2[]= new int [1000];
    public int Serial[]= new int [1000];
    Gamerun m = new Gamerun();
    public Options() {
        //this.<error> = username;
        initComponents();
         
        this.setLocationRelativeTo(null);
          //public int score = 0,flag=0,total=0,wrong=0,correct=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        type1 = new javax.swing.JButton();
        type2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player Mode");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        type1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type1.setText("Play As You Want!");
        type1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type1ActionPerformed(evt);
            }
        });

        type2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type2.setText("Don't Make Any Mistakes!!");
        type2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        type2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("My Profile");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(type2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(type1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(type2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type1ActionPerformed
       
        
        long startTime = System.currentTimeMillis();
        double st =startTime/1000;
     
         int i=0;
         
        
        try{
            Connection con = Connect.ConnectedDB();
            Statement stmt = con.createStatement();
        
       
        String qnum = JOptionPane.showInputDialog("How Many Questions You Want to Face??");
        int n = Integer.parseInt(qnum);
         for (int j = 0; j < n; j++) {
            int rand = (int)(Math.random()*4);
           switch(rand){
               case 0: 
                   m.learnSum();
                    break;
                case 1:
                   m.learnSub();
                    break;
                case 2:
                    m.learnMulti();
                    break;
                default:
                    m.learnDiv();
           }
         }
        
        long endTime = System.currentTimeMillis();
        double et = endTime/1000;
       double totalTime = et-st;
       int rightsum=0, wrongsum=0,wholesum=0;
        JOptionPane.showMessageDialog(null,"Score is : "+m.score+"\nCorrect Ans : "+m.correct+"\nWrong Ans : "+m.wrong+"\nTotal : "+m.total+"\nTotal Time: "+totalTime+"s" );
        
        
        String query = "SELECT * FROM userdata WHERE name = '" + username + "'";
        ResultSet result =stmt.executeQuery(query);
        
         while(result.next())
                    {
                    sum[i] = result.getInt("total");
                    right[i]= result.getInt("thik");
                    wrong[i] = result.getInt("bhul");
                    rightsum = right[i]+m.correct;
                    wrongsum =wrong[i]+m.wrong;
                    wholesum =rightsum + wrongsum;
                  
                    
                    i++;
                    }
         
         
         String query3 = "UPDATE userdata SET thik ='"+rightsum+"',"+"bhul='"+wrongsum+"',total ='"+wholesum+"'WHERE name ='"+username+"'"; 
         int value =stmt.executeUpdate(query3);
         if(value > 0){
                JOptionPane.showMessageDialog(null,"Update Done");
                
            }else{
                JOptionPane.showMessageDialog(null,"Update Failed!");
            }
          con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         
         
         
        
     i=0;
        
        
    }//GEN-LAST:event_type1ActionPerformed

    private void type2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type2ActionPerformed
        // TODO add your handling code here:
       // Gamerun m = new Gamerun();
        int i=0;
        Connection con = Connect.ConnectedDB();
        
        try {
            Statement stmt = con.createStatement();
       
        
        long startTime = System.currentTimeMillis();
        double st =startTime/1000;
        
        System.out.println(startTime);
       
        do{
            int rand = (int)(Math.random()*4);
            switch(rand){
                case 0: 
                    m.learnSum();
                    break;
                case 1:
                    m.learnSub();
                    break;
                case 2:
                    m.learnMulti();
                    break;
                default:
                    m.learnDiv();
            }
        }while(m.flag!=1); //lm.flag==0

        long endTime = System.currentTimeMillis();
        double et = endTime/1000;
       double totalTime = et-st;
       
       int rightsum2=0, wrongsum2=0,wholesum2=0;
       
        JOptionPane.showMessageDialog(null,"Score is : "+m.score+"\nCorrect Ans : "+m.correct+"\nWrong Ans : "+m.wrong+"\nTotal : "+m.total+"\nTotal Time: "+totalTime+"s" );
        String query = "SELECT * FROM userdata WHERE name = '" + username + "'";
        ResultSet result =stmt.executeQuery(query);
        
         while(result.next())
                    {
                    sum2[i] = result.getInt("total");
                    right2[i]= result.getInt("thik");
                    wrong2[i] = result.getInt("bhul");
                     rightsum2 = right2[i]+m.correct;
                     wrongsum2 =wrong2[i]+m.wrong;
                     wholesum2 =rightsum2 + wrongsum2;
                  
                    
                    i++;
                    }
         
         
         String query3 = "UPDATE userdata SET thik ='"+rightsum2+"',"+"bhul='"+wrongsum2+"',total ='"+wholesum2+"'WHERE name ='"+username+"'"; 
         int value4 =stmt.executeUpdate(query3);
         if(value4 > 0){
                JOptionPane.showMessageDialog(null,"Update Done");
                
            }else{
                JOptionPane.showMessageDialog(null,"Update Failed!");
            }
          con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        i=0;
        
    }//GEN-LAST:event_type2ActionPerformed
    
        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Playerlogin a= new Playerlogin();
        a.setVisible(true);
        this.setVisible(false);
        Gamerun m = new Gamerun();
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Myprofile a= new Myprofile();
        a.setVisible(true);
        this.setVisible(false);
        a. myname= username;
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton type1;
    private javax.swing.JButton type2;
    // End of variables declaration//GEN-END:variables
}
