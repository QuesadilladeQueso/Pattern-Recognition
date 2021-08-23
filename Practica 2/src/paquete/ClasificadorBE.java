package paquete;

import com.github.plot.Graficar;
import com.github.plot.Plot;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClasificadorBE extends javax.swing.JFrame {
    
    String [][] Datos1 = new String [6][4]; 
    String [] titulo = new String []{"Patron","Clase","x1","x2"};
    String [] titulos = new String []{"Clase","x1","x2"};
    double [] Cova1;
    double [] Cova2;
    double [] inversa1;
    double [] inversa2;
    int indiceC1=0;
    int indiceC2=0;
    DefaultTableModel dtm1;
    DefaultTableModel dtm2;

    
    public ClasificadorBE() {
              initComponents();
              setTitle("Clasificador Basado En Metricas");
              setVisible(true);
              setResizable(false);
              setSize(850,483);
              setLocation(150,150); 
              TextArea.setEditable(false);
              
              
              Datos1[0][0]="X1";Datos1[0][1]="C1";Datos1[0][2]="1.2";Datos1[0][3]="3.0";
              Datos1[1][0]="X2";Datos1[1][1]="C1";Datos1[1][2]="4.3";Datos1[1][3]="0.7";
              Datos1[2][0]="X3";Datos1[2][1]="C1";Datos1[2][2]="2.3";Datos1[2][3]="3.1";
              Datos1[3][0]="X4";Datos1[3][1]="C2";Datos1[3][2]="2.7";Datos1[3][3]="1.5";
              Datos1[4][0]="X5";Datos1[4][1]="C2";Datos1[4][2]="-0.5";Datos1[4][3]="-1.5";
              Datos1[5][0]="X6";Datos1[5][1]="C2";Datos1[5][2]="0.0";Datos1[5][3]="-2.0";
              
              dtm1 = new DefaultTableModel();
              dtm2 = new DefaultTableModel();
              dtm1.setColumnIdentifiers(titulo);
              dtm2.setColumnIdentifiers(titulos);
              Tabla1.setModel(dtm1);
              Tabla2.setModel(dtm2);
              CargarD();
              
              
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        PatronN = new javax.swing.JTextField();
        Combo = new javax.swing.JComboBox<>();
        TextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        X1N = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Xn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Yn = new javax.swing.JTextField();
        ClaseN = new javax.swing.JComboBox<>();
        Clasificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        X2N = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        FondoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patron", "Clase", "X1", "X2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 310, 330);

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clase", "x1", "x2"
            }
        ));
        jScrollPane2.setViewportView(Tabla2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(550, 30, 190, 80);

        PatronN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PatronN);
        PatronN.setBounds(80, 370, 80, 20);

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","City Block", "Euclidiana","Distancia Infinito"}));
        getContentPane().add(Combo);
        Combo.setBounds(610, 380, 120, 22);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        getContentPane().add(TextArea);
        TextArea.setBounds(550, 140, 260, 100);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clase:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 400, 40, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Elige el metodo para clasificar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 340, 190, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sección para clasificar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 220, 160, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 370, 20, 20);

        X1N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X1N);
        X1N.setBounds(200, 370, 40, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 310, 20, 20);

        Xn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Xn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XnActionPerformed(evt);
            }
        });
        getContentPane().add(Xn);
        Xn.setBounds(610, 310, 40, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(680, 310, 20, 20);

        Yn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Yn);
        Yn.setBounds(700, 310, 40, 20);

        ClaseN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","C1", "C2"}));
        getContentPane().add(ClaseN);
        ClaseN.setBounds(80, 400, 80, 20);

        Clasificar.setText("Clasificar");
        Clasificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasificarActionPerformed(evt);
            }
        });
        getContentPane().add(Clasificar);
        Clasificar.setBounds(630, 420, 90, 23);

        jButton4.setText("Graficar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(370, 90, 140, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 400, 20, 14);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Paso 2");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 340, 50, 20);

        X2N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X2N);
        X2N.setBounds(200, 400, 40, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Conjunto De Muestras De Aprendizaje");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 10, 270, 17);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Paso 1");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 280, 50, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingresa los datos del patron a clasificar");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(570, 280, 260, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Patron:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 370, 50, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Representante de cada Ci");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 10, 220, 17);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 140, 90, 23);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 430, 90, 23);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Distancias");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 120, 260, 17);

        FondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ClasificadorBS.png"))); // NOI18N
        getContentPane().add(FondoB);
        FondoB.setBounds(0, 0, 850, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void XnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XnActionPerformed

    private void ClasificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasificarActionPerformed
                    TextArea.setText("");
                                        if(Tabla2.getRowCount()>0)
                                        {
                                           int indiceT=Tabla2.getRowCount();
                                            for(int i=0;i<indiceT;i++)
                                            {
                                            dtm2.removeRow(0);
                                            }
                                        }
                    if(Combo.getSelectedItem().toString().equals(""))
                    {
                    JOptionPane.showMessageDialog(null,"Debes de selccionar un metodo para clasificar");
                    }
                    if(Combo.getSelectedItem().toString().equals("City Block"))
                            {
                                if(Xn.getText().equals("") || Yn.getText().equals("") )
                                {
                                        JOptionPane.showMessageDialog(null,"Algun campo esta vacio, en el patron a clasificar");
                                }
                                else
                                {
                                        GetMedia();
                                        String x=Xn.getText();
                                        String y=Yn.getText();
                                        int eclass=ClasificadorC(Double.parseDouble(x),Double.parseDouble(y));
                                        
                                            if(eclass ==1)
                                            {
                                            JOptionPane.showMessageDialog(null,"El patron ["+x+","+y+"] pertecene a la clase C1");
                                            }
                                            if(eclass == 2)
                                            {
                                            JOptionPane.showMessageDialog(null,"El patron ["+x+","+y+"] pertecene a la clase C2");
                                            }
                                        
                                        try 
                                        {
                                            Graficar();
                                        } catch (IOException ex) {
                                            Logger.getLogger(ClasificadorBE.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        Xn.setText("");
                                        Yn.setText("");
                                }
                            }
                    
                     if(Combo.getSelectedItem().toString().equals("Euclidiana"))
                     {
                     
                                if(Xn.getText().equals("") || Yn.getText().equals("") )
                                {
                                        JOptionPane.showMessageDialog(null,"Algun campo esta vacio, en el patron a clasificar");
                                }
                                else
                                {
                                    String x=Xn.getText();
                                    String y=Yn.getText();
                                    GetMedia();
                                    int eclass=ClasificadorE(Double.parseDouble(x),Double.parseDouble(y));
                                    
                                            if(eclass ==1)
                                            {
                                            JOptionPane.showMessageDialog(null,"El patron ["+x+","+y+"] pertecene a la clase C1");
                                            }
                                            if(eclass == 2)
                                            {
                                            JOptionPane.showMessageDialog(null,"El patron ["+x+","+y+"] pertecene a la clase C2");
                                            }
                                            
                                            try 
                                                {
                                                    Graficar();
                                                } catch (IOException ex) {
                                                    Logger.getLogger(ClasificadorBE.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                Xn.setText("");
                                                Yn.setText("");
                                
                                }
                     }
                     
                     if(Combo.getSelectedItem().toString().equals("Distancia Infinito"))
                     {
                     
                                if(Xn.getText().equals("") || Yn.getText().equals("") )
                                {
                                        JOptionPane.showMessageDialog(null,"Algun campo esta vacio, en el patron a clasificar");
                                }
                                else
                                {
                                    GetMedia();
                                        String x=Xn.getText();
                                        String y=Yn.getText();
                                        int eclass=ClasificadorI(Double.parseDouble(x),Double.parseDouble(y));
                                        
                                            if(eclass ==1)
                                            {
                                            JOptionPane.showMessageDialog(null,"El patron ["+x+","+y+"] pertecene a la clase C1");
                                            }
                                            if(eclass == 2)
                                            {
                                            JOptionPane.showMessageDialog(null,"El patron ["+x+","+y+"] pertecene a la clase C2");
                                            }
                                        
                                        try 
                                        {
                                            Graficar();
                                        } catch (IOException ex) {
                                            Logger.getLogger(ClasificadorBE.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        Xn.setText("");
                                        Yn.setText("");
                                
                                }
                     }
    }//GEN-LAST:event_ClasificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Tabla1.getRowCount()==0)
        {
        JOptionPane.showMessageDialog(null,"No hay información en la tabla para eliminar");
        }
        else
        Eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Graficar2();
        } catch (IOException ex) {
            Logger.getLogger(ClasificadorBE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
      public void Eliminar()
    {   
            int fila=Tabla1.getSelectedRow();
            if(fila==-1)
            {
                JOptionPane.showMessageDialog(null,"No haz seleccionado ningun fila");
            }
            else
            dtm1.removeRow(fila);
    }
      

    
    public void Graficar2() throws IOException
    {
    
        
        
        int indice=0;
        
        for(int i=0;i<Tabla1.getRowCount();i++)
        {
                //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                String AuxS=(String)dtm1.getValueAt(i,1);
                if(AuxS.equals("C1"))
                {
                    indice=indice+1;
                }
        }
        
        double[] Xx= new double[indice];
        double[] Xy= new double[indice];
        int aux=0;
        
                for(int i=0;i<Tabla1.getRowCount();i++)
                {
                        //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                        String AuxS=(String)dtm1.getValueAt(i,1);
                        if(AuxS.equals("C1"))
                        {   
                            Xx[aux]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                            Xy[aux]=Double.parseDouble((String)dtm1.getValueAt(i,3));
                            aux=aux+1;
                        }
                }
        ///Grafica 2
        indice=0;
        
                for(int i=0;i<Tabla1.getRowCount();i++)
                {
                        
                        String AuxS=(String)dtm1.getValueAt(i,1);
                        if(AuxS.equals("C2"))
                        {
                            indice=indice+1;
                        }
                }
        double[] Yx= new double[indice];
        double[] Yy= new double[indice];
        
        aux=0;
        
                        for(int i=0;i<Tabla1.getRowCount();i++)
                        {
                                
                                String AuxS=(String)dtm1.getValueAt(i,1);
                                if(AuxS.equals("C2"))
                                {   
                                    Yx[aux]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                                    Yy[aux]=Double.parseDouble((String)dtm1.getValueAt(i,3));
                                    aux=aux+1;
                                }
                        }
        
                    
        
            String auxN;
            auxN=JOptionPane.showInputDialog("Ingresa el nombre de la grafica");
            
        Graficar plotear = new Graficar(Xx,Xy,Yx,Yy,auxN);
        plotear.Pintar2("C1","C2",5,5);
        
    
    }
    
    public void Graficar() throws IOException
    {
    
        double[] Xx= new double[indiceC1];
        double[] Xy= new double[indiceC1];
        double[] Yx= new double[indiceC2];
        double[] Yy= new double[indiceC2];
        double Zx1 = 0.0;
        double Zy1 = 0.0;
        double Zx2 = 0.0;
        double Zy2 = 0.0;
        int indice=0;
        
        Zx1=Double.parseDouble((String)dtm2.getValueAt(0,1));
        Zy1=Double.parseDouble((String)dtm2.getValueAt(0,2));
        Zx2=Double.parseDouble((String)dtm2.getValueAt(1,1));
        Zy2=Double.parseDouble((String)dtm2.getValueAt(1,2));
        
        for(int i=0;i<Tabla1.getRowCount();i++)
        {
                //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                String AuxS=(String)dtm1.getValueAt(i,1);
                if(AuxS.equals("C1"))
                {
                    Xx[indice]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                    Xy[indice]=Double.parseDouble((String)dtm1.getValueAt(i,3));
                    indice=indice+1;
                }
        }
        
        indice=0;
        
        for(int i=0;i<Tabla1.getRowCount();i++)
        {
                //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                String AuxS=(String)dtm1.getValueAt(i,1);
                if(AuxS.equals("C2"))
                {
                    Yx[indice]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                    Yy[indice]=Double.parseDouble((String)dtm1.getValueAt(i,3));
                    indice=indice+1;
                }
        }
        
            String aux;
            aux=JOptionPane.showInputDialog("Ingresa el nombre de la grafica");
            
        Graficar plotear = new Graficar(Xx,Xy,Yx,Yy,Double.parseDouble(Xn.getText()),Double.parseDouble(Yn.getText()),aux,Zx1,Zy1,Zx2,Zy2);
        plotear.Pintar3("C1","C2",5,5);
        
    
    }
   public void CargarD()
   {
       for(int i=0;i<6;i++)
       {
           dtm1.addRow(new Object[]{
            ""+Datos1[i][0],""+Datos1[i][1],""+Datos1[i][2],""+Datos1[i][3]
            });
       }
   }
   
   public void Cargar()
   {
       String P=PatronN.getText();
       String C=ClaseN.getSelectedItem().toString();
       String X1= X1N.getText();
       String X2=X2N.getText();
       
       if(P.length()!=0 && C.length()!=0 && X1.length()!=0 && X2.length()!=0 && ClaseN.getSelectedItem().toString().length()!=0)
            {
                    dtm1.addRow(new Object[]{
                    ""+P,""+C,""+X1,""+X2
                    });
                    
                    PatronN.setText("");
                    ClaseN.setSelectedItem("");
                    X1N.setText("");
                    X2N.setText("");
            }
       else 
       JOptionPane.showMessageDialog(null,"Valida los campos para ingresar un patrón nuevo");
       
       
   
   }
    
   public void GetMedia()
   {
        double media1x=0.0;
        double media1y=0.0;
        double media2x=0.0;
        double media2y=0.0;
        
        float Auxx=0;
        float Auxy=0;
        int indice=0;
        
        for(int i=0;i<Tabla1.getRowCount();i++)
        {
                //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                String AuxS=(String)dtm1.getValueAt(i,1);
                if(AuxS.equals("C1"))
                {
                Auxx=Auxx+Float.parseFloat((String)dtm1.getValueAt(i,2));
                Auxy=Auxy+Float.parseFloat((String)dtm1.getValueAt(i,3));
                indice=indice+1;
                }
        }
        
            media1x=Auxx/indice;
            media1y=Auxy/indice;
            indiceC1=indice;
            
            Agregar("C1",""+String.format("%.2f", media1x) ,""+String.format("%.2f", media1y) );
            
            Auxx=0;
            Auxy=0;
            indice=0;
            
            for(int i=0;i<Tabla1.getRowCount();i++)
                {
                        //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                        String AuxS=(String)dtm1.getValueAt(i,1);
                        if(AuxS.equals("C2"))
                        {
                        Auxx=Auxx+Float.parseFloat((String)dtm1.getValueAt(i,2));
                        Auxy=Auxy+Float.parseFloat((String)dtm1.getValueAt(i,3));
                        indice=indice+1;
                        }
                }
            
            media1x=Auxx/indice;
            media1y=Auxy/indice;
            indiceC2=indice;
            
            
             Agregar("C2",""+String.format("%.2f", media1x) ,""+String.format("%.2f", media1y) );
        
        
   }
   
   public void Agregar(String c,String x, String y)
   {
       dtm2.addRow(new Object[]{
            ""+c,""+x,""+y
            });
   }
   
   
   
   public int  ClasificadorC(double x, double y)
   {
       
       int resul=0;
        
   float x1=Float.parseFloat((String)dtm2.getValueAt(0,1));
   float x2=Float.parseFloat((String)dtm2.getValueAt(0,2));
   
   float x3=Float.parseFloat((String)dtm2.getValueAt(1,1));
   float x4=Float.parseFloat((String)dtm2.getValueAt(1,2));
   
   double aux1=0;
   double aux2=0;
   double aux3=0;
   double aux4=0;
   double temp1=0;
   double temp2=0;
   
   aux1=x1-x;
   aux2=x2-y;
   
  
             if(aux1<0){aux1=aux1*-1;}
             if(aux2<0){aux2=aux2*-1;}
   aux3=x3-x;
   aux4=x4-y;
             if(aux3<0){aux3=aux3*-1;}
             if(aux4<0){aux4=aux4*-1;}
             
    temp1=aux1+aux2;
    temp2=aux3+aux4;
    
    TextArea.setText("");
    TextArea.append("Distancia con respecto al Z1");
    TextArea.append("\n");
    TextArea.append("City Block d(x,y)= "+String.format("%.2f", temp1));
    TextArea.append("\n");
    TextArea.append("Distancia con respecto al Z2");
    TextArea.append("\n");
    TextArea.append("City Block d(x,y)= "+String.format("%.2f", temp2));
        if(temp1<temp2)
        {resul=1;}
        else if(temp2<temp1)
        {resul=2;}
        
        return resul;
   }
   
   public int  ClasificadorE(double x, double y)
   {
       int resul=0;
        
   float x1=Float.parseFloat((String)dtm2.getValueAt(0,1));
   float x2=Float.parseFloat((String)dtm2.getValueAt(0,2));
   
   float x3=Float.parseFloat((String)dtm2.getValueAt(1,1));
   float x4=Float.parseFloat((String)dtm2.getValueAt(1,2));
   
   double aux1=0;
   double aux2=0;
   double aux3=0;
   double aux4=0;

   aux1=x1-x;
   aux2=x2-y;
   
            aux1=aux1*aux1;
            aux2=aux2*aux2;
    
   double raiz1=Math.sqrt(aux1+aux2);
   
   aux3=x3-x;
   aux4=x4-y;
   
            aux3=aux3*aux3;
            aux4=aux4*aux4;
            
    double raiz2=Math.sqrt(aux3+aux4);
            
    
    TextArea.setText("");
    TextArea.append("Distancia con respecto al Z1");
    TextArea.append("\n");
    TextArea.append("Euclideano d(x,y)= "+String.format("%.2f", raiz1));
    TextArea.append("\n");
    TextArea.append("Distancia con respecto al Z2");
    TextArea.append("\n");
    TextArea.append("Euclideano d(x,y)= "+String.format("%.2f", raiz2));
        if(raiz1<raiz2)
        {resul=1;}
        else if(raiz2<raiz1)
        {resul=2;}
        
        return resul;
   }
   
   public int  ClasificadorI(double x, double y)
   {
        int resul=0;
        
   float x1=Float.parseFloat((String)dtm2.getValueAt(0,1));
   float x2=Float.parseFloat((String)dtm2.getValueAt(0,2));
   
   float x3=Float.parseFloat((String)dtm2.getValueAt(1,1));
   float x4=Float.parseFloat((String)dtm2.getValueAt(1,2));
   
   double aux1=0;
   double aux2=0;
   double aux3=0;
   double aux4=0;
   double temp1=0;
   double temp2=0;
   
   aux1=x1-x;
   aux2=x2-y;
   
  
             if(aux1<0){aux1=aux1*-1;}
             if(aux2<0){aux2=aux2*-1;}
   aux3=x3-x;
   aux4=x4-y;
             if(aux3<0){aux3=aux3*-1;}
             if(aux4<0){aux4=aux4*-1;}
             
    temp1=Math.max(aux1,aux2);
    temp2=Math.max(aux3,aux4);
    
    TextArea.setText("");
    TextArea.append("Distancia con respecto al Z1");
    TextArea.append("\n");
    TextArea.append("D-Infinito d(x,y)= "+String.format("%.2f", temp1));
    TextArea.append("\n");
    TextArea.append("Distancia con respecto al Z2");
    TextArea.append("\n");
    TextArea.append("D-Infinito d(x,y)= "+String.format("%.2f", temp2));
        if(temp1<temp2)
        {resul=1;}
        else if(temp2<temp1)
        {resul=2;}
        
        return resul;
   }
   
   
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ClaseN;
    private javax.swing.JButton Clasificar;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JLabel FondoB;
    private javax.swing.JTextField PatronN;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField X1N;
    private javax.swing.JTextField X2N;
    private javax.swing.JTextField Xn;
    private javax.swing.JTextField Yn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
