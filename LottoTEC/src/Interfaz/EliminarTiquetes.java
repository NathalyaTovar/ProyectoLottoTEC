/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructuras.ListaDoble;
import Gestiones.GestionPrincipal;
import Sorteo.Sorteo;
import javax.swing.table.DefaultTableModel;
import tiquete.*;

/**
 *
 * @author crisg
 */
public class EliminarTiquetes extends javax.swing.JFrame {
    int y;
    /**
     * Creates new form EliminarTiquetes
     */
    public EliminarTiquetes(int y) {
    this.y=y;
    initComponents();
    ventanilla1.addColumn("Nombre Emisor");
    ventanilla1.addColumn("Nombre Cliente");
    ventanilla1.addColumn("Tipo de Sorteo");
    ventanilla1.addColumn("Combinancion de #");
    ventanilla1.addColumn("Precio en Colones");
    ventanilla1.addColumn("Precio en Dolares $");
    Mostrar();
    Ventana.setModel(ventanilla1);
    }
DefaultTableModel ventanilla1= new DefaultTableModel();
    private EliminarTiquetes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int metodoaux(){
        return this.y;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ventana = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Eiminar Tiquete");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Ventana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Emisor", "Nombre Cliente", "Numero a Comprar", "Precio Colones", "Precio Dolares"
            }
        ));
        jScrollPane1.setViewportView(Ventana);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 335, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void Mostrar(){
        ventanilla1.setRowCount(0);
        ListaDoble aux= GestionPrincipal.getInstance().devolver();///Se obtiene la lista que contiene todos los sorteos 
        aux.gotopos(this.metodoaux());//Se va a la posicion del sorteo seleccionado
        String Dato[]=new String[6];
        
        Sorteo var= (Sorteo) aux.getElemento();
        System.err.println(var.getNombreSorteo());
        ListaDoble var2=var.getTiqueteLista();
        var2.gotostart();
        
        while (var2.next()!=false){
        Tiquete var3= (Tiquete) var2.getElemento();
        
        Dato[0]=var3.getNombreEmisor();//Asigna a cada espacio un String
        
        Dato[1]= var3.getNombreCliente();
        
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
        int t=var3.getNumeroCombinacion();
        Dato[3]=Integer.toString(t);
        Dato[4]= Double.toString(var3.getPrecioTiquete());
        Dato[5]= Double.toString(0);
        System.out.println(var.getDate().getYear());
        ventanilla1.addRow(Dato);
        //var2.next();
        }
        }
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionTiquetes ven= new GestionTiquetes();
        ven.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GestionPrincipal.getInstance().eliminarTiquete(y,Ventana.getSelectedRow());
        Mostrar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarTiquetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Ventana;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
