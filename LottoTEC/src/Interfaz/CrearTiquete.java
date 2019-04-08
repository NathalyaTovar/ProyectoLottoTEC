/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructuras.ListaDoble;
import Gestiones.GestionPrincipal;
import Sorteo.Sorteo;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import tiquete.*;
import javax.swing.table.DefaultTableModel;


public class CrearTiquete extends javax.swing.JFrame {

    public CrearTiquete() {
    initComponents();
    ventanilla1.addColumn("Nombre");
    ventanilla1.addColumn("Codigo");
    ventanilla1.addColumn("Tipo");
    ventanilla1.addColumn("Emisiones");
    ventanilla1.addColumn("Fecha");
    ventanilla1.addColumn("# de tiquetes");
    Mostrar();
    Ventana.setModel(ventanilla1);
    }
DefaultTableModel ventanilla1= new DefaultTableModel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        caja3 = new javax.swing.JTextField();
        caja2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TipoSorteo = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ventana = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        caja4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" Crear Tiquete");

        jLabel2.setText("Nomre del Emisor");

        jLabel3.setText("Nombre Cliente");

        jLabel5.setText("Numero elegido");

        jLabel6.setText("Precio");

        caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja1ActionPerformed(evt);
            }
        });

        caja3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja3ActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear tiquete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TipoSorteo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Lotería", "Lotto", "Bingo", "Tiempos" }));
        TipoSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoSorteoActionPerformed(evt);
            }
        });

        Ventana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Codigo", "Tipo", "Emision", "Fecha", "# de Tiquetes"
            }
        ));
        jScrollPane1.setViewportView(Ventana);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Sorteos existentes");

        caja4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(690, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(caja1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caja4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(caja3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(caja2)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel7)
                        .addGap(61, 61, 61)
                        .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionTiquetes ven= new GestionTiquetes();
        ven.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja1ActionPerformed

    private void caja3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja3ActionPerformed
 public void Mostrar(){
        ventanilla1.setRowCount(0);
        ListaDoble aux= GestionPrincipal.getInstance().devolver();///Se obtiene la lista que contiene todos los sorteos 
        aux.gotostart();//Se va al inicio
        String Dato[]=new String[6];
        int Tipo= TipoSorteo.getSelectedIndex();
        
        if (Tipo==0){
        while (aux.next()!=false){
        Sorteo var= (Sorteo) aux.getElemento();

        Dato[0]= var.getNombreSorteo();//Asigna a cada espacio un String
        
        Dato[1]= var.getCodigoSorteo();
        
        int var1=var.getTipoSorteo();
        
        if (var1==0){
        Dato[2]="Loteria";
        }
        else if (var1==1){
        Dato[2]="Lotto";  
        }
        else if(var1==2){
        Dato[2]="Bingo";    
        }
        else if (var1==3){
        Dato[2]="Tiempos";
        }
        
        int t=var.getEmisionSorteo();
        Dato[3]=Integer.toString(t);
        Dato[4]= Integer.toString(var.getDate().getDate())+"/"+Integer.toString(var.getDate().getMonth()+1)+"/"+Integer.toString(var.getDate().getYear()-100);
        Dato[5]= Integer.toString(var.getTiqueteLista().size);
        System.out.println(var.getDate().getYear());
        
        ventanilla1.addRow(Dato);
        }
        }
        else if(Tipo==1){

        while (aux.next()!=false){
            
        Sorteo var= (Sorteo) aux.getElemento();
        if (var.getTipoSorteo()==Tipo-1){
        Dato[0]= var.getNombreSorteo();//Asigna a cada espacio un String
        
        Dato[1]= var.getCodigoSorteo();
        
        int var1=var.getTipoSorteo();
        
        if (var1==0){
        Dato[2]="Loteria";
        }
        else if (var1==1){
        Dato[2]="Lotto";  
        }
        else if(var1==2){
        Dato[2]="Bingo";    
        }
        else if (var1==3){
        Dato[2]="Tiempos";
        }
        int t=var.getEmisionSorteo();
        Dato[3]=Integer.toString(t);
        Dato[4]= Integer.toString(var.getDate().getDate())+Integer.toString(var.getDate().getMonth())+Integer.toString(var.getDate().getYear());
        Dato[5]= Integer.toString(var.getTiqueteLista().size);
        ventanilla1.addRow(Dato);
        }
        }
    }
        else if(Tipo==2){

        while (aux.next()!=false){
            
        Sorteo var= (Sorteo) aux.getElemento();
        if (var.getTipoSorteo()==Tipo-1){
        Dato[0]= var.getNombreSorteo();//Asigna a cada espacio un String
        
        Dato[1]= var.getCodigoSorteo();
        
        int var1=var.getTipoSorteo();
        
        if (var1==0){
        Dato[2]="Loteria";
        }
        else if (var1==1){
        Dato[2]="Lotto";  
        }
        else if(var1==2){
        Dato[2]="Bingo";    
        }
        else if (var1==3){
        Dato[2]="Tiempos";
        }
        int t=var.getEmisionSorteo();
        Dato[3]=Integer.toString(t);
        Dato[4]= Integer.toString(var.getDate().getDate())+Integer.toString(var.getDate().getMonth())+Integer.toString(var.getDate().getYear());
        Dato[5]= Integer.toString(var.getTiqueteLista().size);
        ventanilla1.addRow(Dato);
        }
        }
    }
        else if(Tipo==3){

        while (aux.next()!=false){
            
        Sorteo var= (Sorteo) aux.getElemento();
        if (var.getTipoSorteo()==Tipo-1){
        Dato[0]= var.getNombreSorteo();//Asigna a cada espacio un String
        
        Dato[1]= var.getCodigoSorteo();
        
        int var1=var.getTipoSorteo();
        
        if (var1==0){
        Dato[2]="Loteria";
        }
        else if (var1==1){
        Dato[2]="Lotto";  
        }
        else if(var1==2){
        Dato[2]="Bingo";    
        }
        else if (var1==3){
        Dato[2]="Tiempos";
        }
        int t=var.getEmisionSorteo();
        Dato[3]=Integer.toString(t);
        Dato[4]= Integer.toString(var.getDate().getDate())+Integer.toString(var.getDate().getMonth())+Integer.toString(var.getDate().getYear());
        Dato[5]= Integer.toString(var.getTiqueteLista().size);
        ventanilla1.addRow(Dato);
        }
        }
    }
        else if(Tipo==4){

        while (aux.next()!=false){
            
        Sorteo var= (Sorteo) aux.getElemento();
        if (var.getTipoSorteo()==Tipo-1){
        Dato[0]= var.getNombreSorteo();//Asigna a cada espacio un String
        
        Dato[1]= var.getCodigoSorteo();
        
        int var1=var.getTipoSorteo();
        
        if (var1==0){
        Dato[2]="Loteria";
        }
        else if (var1==1){
        Dato[2]="Lotto";  
        }
        else if(var1==2){
        Dato[2]="Bingo";    
        }
        else if (var1==3){
        Dato[2]="Tiempos";
        }
        int t=var.getEmisionSorteo();
        Dato[3]=Integer.toString(t);
        Dato[4]= Integer.toString(var.getDate().getDate())+Integer.toString(var.getDate().getMonth())+Integer.toString(var.getDate().getYear());
        Dato[5]= Integer.toString(var.getTiqueteLista().size);
        ventanilla1.addRow(Dato);
        }}}}
    private void TipoSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoSorteoActionPerformed
        Mostrar();
    }//GEN-LAST:event_TipoSorteoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.out.println(Ventana.getSelectedRow());
    if (Ventana.getSelectedRow()==-1){JOptionPane.showMessageDialog(null, "No ha seleccionado un sorteo","Error", JOptionPane.ERROR_MESSAGE);}
    String var= (String) ventanilla1.getValueAt(Ventana.getSelectedRow(), 2);
    System.out.println(var);
    int aux=0;
        switch (var) {
            case "Loteria":
                aux=0;
                break;
            case "Lotto":
                aux=1;
                break;
            case "Bingo":
                aux=2;
                break;
            default:
                aux=3;
                break;
        }
    Tiquete ticket= new Tiquete(caja1.getText(), caja2.getText(), aux,Integer.parseInt(caja3.getText()), Integer.parseInt(caja4.getText()));
    
    GestionPrincipal.getInstance().crearTiquete(Ventana.getSelectedRow(),ticket);
    Mostrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void caja4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja4ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTiquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoSorteo;
    private javax.swing.JTable Ventana;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
