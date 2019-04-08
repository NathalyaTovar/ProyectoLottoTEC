/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructuras.ListaDoble;
import Gestiones.GestionPrincipal;
import Sorteo.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juli, Cris, Nathalia
 */
public class Principal extends javax.swing.JFrame {
    //Constructores
    public Principal() {
        
    initComponents();
    ventanilla1.addColumn("Nombre");
    ventanilla1.addColumn("Codigo");
    ventanilla1.addColumn("Tipo");
    ventanilla1.addColumn("Emisiones");
    ventanilla1.addColumn("Fecha");
    Mostrar();
    Ventana.setModel(ventanilla1);
    
    }
    DefaultTableModel ventanilla1= new DefaultTableModel();
    //Metodos
    public void Mostrar(){
        ventanilla1.setRowCount(0);
        ListaDoble aux= GestionPrincipal.getInstance().devolver();///Se obtiene la lista que contiene todos los sorteos 
        aux.gotostart();//Se va al inicio
        String Dato[]=new String[5];
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
        ventanilla1.addRow(Dato);
        }}}}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ventana = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        caja2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TipoSorteo = new javax.swing.JComboBox<String>();
        Boton7 = new javax.swing.JButton();
        Traer = new javax.swing.JButton();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        caja3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Crear Sorteo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar Sorteo");

        jButton5.setText("Eliminar Sorteo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Pestaña Principal Lotto TEC");

        Ventana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Codigo", "Tipo", "Emision", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(Ventana);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Sorteos existentes");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Opciones");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText(" Modificar Sorteos");

        jLabel5.setText("Nombre");

        jLabel6.setText("Tipo de sorteo");

        Combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lotería", "Lotto", "Bingo", "Tiempos" }));

        jLabel7.setText("Emision");

        caja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha de sorteo");

        TipoSorteo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Lotería", "Lotto", "Bingo", "Tiempos" }));
        TipoSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoSorteoActionPerformed(evt);
            }
        });

        Boton7.setText("Modificar");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Traer.setText("Traer");
        Traer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraerActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo:");

        jButton6.setText("Ir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel11.setText("Gestion de Tiquetes");

        jLabel12.setText("Gestion de Tiquetes");

        jButton7.setText("Ir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(Traer))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(45, 45, 45)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(50, 50, 50)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Combo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(jButton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(jButton7)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(522, 522, 522))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(153, 153, 153)
                                    .addComponent(jLabel2)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton7)
                            .addComponent(Traer))
                        .addGap(1, 1, 1)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jButton7))
                        .addGap(85, 85, 85))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton que vuelve a pestaña de inicio
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio = new Inicio();
        dispose();
        inicio.setVisible(true);  //Maximiza la pestaña de inicio
        this.setVisible(false); //Minimiza la pestaña actual
    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton que sale del sistema Lotto TEC
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int opcion = JOptionPane.YES_NO_OPTION;
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Salir", opcion);
        if (confirmar == 0){System.exit(0);}
    }//GEN-LAST:event_jButton2ActionPerformed
//Boton que abre la pestaña para crear sorteo
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CrearSorteo nuevo = new CrearSorteo();
        dispose();
        nuevo.setVisible(true); //Maximiza la pestaña para crear nuevo sorteo
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TipoSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoSorteoActionPerformed
Mostrar();        
    }//GEN-LAST:event_TipoSorteoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    int var= Ventana.getSelectedRow();
    int y=0;
    if (TipoSorteo.getSelectedIndex()==0){
    GestionPrincipal.getInstance().eliminarSorteo(var);
    Mostrar();
    }
    else{
    GestionPrincipal.getInstance().eliminarSorteo2((String) ventanilla1.getValueAt(var, 0));
    Mostrar();
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraerActionPerformed
        int var1=Ventana.getSelectedRow();
        
        caja1.setText((String) ventanilla1.getValueAt(var1, 0));
        caja2.setText((String) ventanilla1.getValueAt(var1, 1));
        caja3.setText((String) ventanilla1.getValueAt(var1, 3));
        Combo1.setSelectedItem((String) ventanilla1.getValueAt(var1,2));
        Date e=new Date((String) ventanilla1.getValueAt(var1,4));
        e.setMonth(-2);
        e.setYear(+100);
        Fecha.setDate(e);
        //Fecha.set
    }//GEN-LAST:event_TraerActionPerformed

    private void caja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        GestionPrincipal.getInstance().modificarSorteo(Ventana.getSelectedRow(), caja1.getText(), caja2.getText(), (int)Combo1.getSelectedIndex(), Integer.parseInt(caja3.getText()), Fecha.getDate());
        Mostrar();
    }//GEN-LAST:event_Boton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      GestionTiquetes ven= new GestionTiquetes();
      ven.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Pedidos ven=new Pedidos();
ven.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton7;
    private javax.swing.JComboBox<String> Combo1;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JComboBox<String> TipoSorteo;
    private javax.swing.JButton Traer;
    private javax.swing.JTable Ventana;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
