package Interfaz;

import Estructuras.ListaDoble;
import Gestiones.GestionPrincipal;
import Sorteo.Sorteo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionTiquetes extends javax.swing.JFrame {

    public GestionTiquetes() {
    initComponents();
   // initComponents();
    ventanilla1.addColumn("Nombre");
    ventanilla1.addColumn("Codigo");
    ventanilla1.addColumn("Tipo");
    ventanilla1.addColumn("Emisiones");
    ventanilla1.addColumn("Fecha");
    ventanilla1.addColumn("# de tiquetes");
    Ventana.setModel(ventanilla1);
    Mostrar();
    //Ventana.setModel(ventanilla1);
    }
    DefaultTableModel ventanilla1= new DefaultTableModel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TipoSorteo = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ventana = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestion de Tiquetes");

        jButton1.setText("Crear Tiquete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Tiquete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar Tiquete");

        jButton4.setText("Consultar Tiquetes");

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Sorteos existentes");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel7)
                                .addGap(61, 61, 61)
                                .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton5))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jButton4)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if (Ventana.getSelectedRow()==-1){JOptionPane.showMessageDialog(null, "No ha seleccionado un sorteo","Error", JOptionPane.ERROR_MESSAGE);
      return;}
      EliminarTiquetes ven= new EliminarTiquetes(Ventana.getSelectedRow());
       ven.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       CrearTiquete ventana= new CrearTiquete();
       ventana.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Principal ven= new Principal();
        ven.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TipoSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoSorteoActionPerformed
        Mostrar();
    }//GEN-LAST:event_TipoSorteoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTiquetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoSorteo;
    private javax.swing.JTable Ventana;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
