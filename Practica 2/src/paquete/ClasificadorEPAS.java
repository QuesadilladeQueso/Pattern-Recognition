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
import paquete.MayorOMenor;


public class ClasificadorEPAS extends javax.swing.JFrame {
    
    String [][] Datos1 = new String [8][4]; 
    String [] titulo = new String []{"# Caso","X","Y","Ci"};
    String [] titulos = new String []{"# Caso","dE Ordenadas","Clase"};
    int indiceC1=0;
    int indiceC2=0;
    DefaultTableModel dtm1;
    DefaultTableModel dtm2;

    
    public ClasificadorEPAS() {
              initComponents();
              setTitle("Clasificadores estadísticos-probabilísticos con aprendizaje supervizado: Método k-NN ");
              setVisible(true);
              setResizable(false);
              setSize(850,483);
              setLocation(150,150); 
              
              
              
              Datos1[0][0]="1";Datos1[0][1]="1";Datos1[0][2]="1";Datos1[0][3]="0";
              Datos1[1][0]="2";Datos1[1][1]="2";Datos1[1][2]="4";Datos1[1][3]="0";
              Datos1[2][0]="3";Datos1[2][1]="3";Datos1[2][2]="2";Datos1[2][3]="0";
              Datos1[3][0]="4";Datos1[3][1]="3";Datos1[3][2]="5";Datos1[3][3]="0";
              Datos1[4][0]="5";Datos1[4][1]="4";Datos1[4][2]="4";Datos1[4][3]="0";
              Datos1[5][0]="6";Datos1[5][1]="4";Datos1[5][2]="7";Datos1[5][3]="1";
              Datos1[6][0]="7";Datos1[6][1]="6";Datos1[6][2]="4";Datos1[6][3]="1";
              Datos1[7][0]="8";Datos1[7][1]="6";Datos1[7][2]="6";Datos1[7][3]="1";
              
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

        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        PatronN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        X1N = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Kn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Yn = new javax.swing.JTextField();
        ClaseN = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        X2N = new javax.swing.JTextField();
        Xn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
                "# Caso", "X", "Y", "Ci"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(2).setHeaderValue("Y");
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 30, 240, 330);

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "# Caso", "dE Ordenada", "Clase"
            }
        ));
        jScrollPane1.setViewportView(Tabla2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 30, 260, 330);

        PatronN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PatronN);
        PatronN.setBounds(80, 370, 80, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clase:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 400, 40, 14);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sección para clasificar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 50, 160, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 370, 20, 20);

        X1N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X1N);
        X1N.setBounds(200, 370, 40, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("K:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 170, 20, 20);

        Kn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Kn);
        Kn.setBounds(380, 170, 40, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 110, 20, 20);

        Yn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Yn);
        Yn.setBounds(470, 110, 40, 20);

        ClaseN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","0", "1"}));
        getContentPane().add(ClaseN);
        ClaseN.setBounds(80, 400, 80, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 400, 20, 14);

        X2N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X2N);
        X2N.setBounds(200, 400, 40, 20);

        Xn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Xn);
        Xn.setBounds(380, 110, 40, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos Ordenados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(630, 10, 130, 17);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Paso 1");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 80, 50, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingresa el valor de k");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(340, 140, 150, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Patron:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 370, 50, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Paso 2");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 140, 50, 20);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ingresa los datos del patron a clasificar");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(340, 80, 190, 20);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X1");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(360, 110, 20, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Conjunto De Muestra De Aprendizaje");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 270, 17);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Tache.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(250, 370, 40, 50);

        jButton3.setText("Clasificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 210, 110, 23);

        jButton2.setText("Graficar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 430, 90, 23);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 430, 90, 23);

        FondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ClasificadorBS.png"))); // NOI18N
        getContentPane().add(FondoB);
        FondoB.setBounds(0, 0, 850, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Tabla1.getRowCount()==0)
        {
        JOptionPane.showMessageDialog(null,"No hay información en la tabla para graficar");
        }
        else
            try {
                Graficar2();
        } catch (IOException ex) {
            Logger.getLogger(ClasificadorEPAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
                String k = Kn.getText();
                String kx = Xn.getText();
                String ky = Yn.getText();
                if(k.equals("")||kx.equals("")||ky.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"El valor de campo 'k', 'x' o 'y' es invalido, intenta de nuevo");
                }
                else 
                {
                    
                    if(Tabla2.getRowCount()>0)
                        {
                           int indiceT=Tabla2.getRowCount();
                            for(int i=0;i<indiceT;i++)
                            {
                            dtm2.removeRow(0);
                            }
                        }
                
                    int kn = Integer.parseInt(k);
                        if(kn>Tabla1.getRowCount())
                        {
                          JOptionPane.showMessageDialog(null,"Valida de nuevo, el CMA  tiene solo tiene "+Tabla1.getRowCount()+" vecinos");  
                        }
                        else
                        {
                        dE();
                                if(kn==1)
                                {
                                    //(String)dtm1.getValueAt(i,3);
                                    JOptionPane.showMessageDialog(null,"El patron {"+Xn.getText()+","+Yn.getText()+"} pertenece a la clase: "+(String)dtm2.getValueAt(0,2));
                                }
                                else if(kn>1)
                                {
                                    int Clase0=0;
                                    int Clase1=0;
                                    
                                       for(int i=0;i<kn;i++)
                                       {
                                           String aux= (String)dtm2.getValueAt(i,2);
                                           if(aux.equals("0"))
                                           {
                                               Clase0=Clase0+1;
                                           }
                                       }
                                       for(int i=0;i<kn;i++)
                                       {
                                           String aux= (String)dtm2.getValueAt(i,2);
                                           if(aux.equals("1"))
                                           {
                                               Clase1=Clase1+1;
                                           }
                                       }
                                       System.out.println("Clase0: "+Clase0);
                                       System.out.println("Clase1: "+Clase1);
                                       
                                            if(Clase0==0 || Clase1==0)
                                            {
                                             JOptionPane.showMessageDialog(null,"El patron {"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase: "+(String)dtm2.getValueAt(0,2));
                                            }
                                            else if(Clase0>=1 && Clase1>=1)
                                            {
                                                String opc;
                                                while(true)
                                                    {
                                                    opc=JOptionPane.showInputDialog("Existe un empate de clases con k="+kn+" =C \n ¡No te preocupes! \n Aplicaremos un metodo para el desempate \n Selecciona una opcion: \n 1- Metodo con distancia media \n 2- Metodo con distancia minima");
                                                    if(opc.equals("1")|| opc.equals("2"))break;
                                                    }
                                                    
                                                        if(opc.equals("1"))
                                                        {
                                                            double eDmedia1=0;
                                                            double eDmedia2=0;
                                                            
                                                                for(int i=0;i<kn;i++)
                                                                {
                                                                    String aux= (String)dtm2.getValueAt(i,2);
                                                                            if(aux.equals("0"))
                                                                            {
                                                                                eDmedia1=eDmedia1+Double.parseDouble((String)dtm2.getValueAt(i,1));
                                                                            }
                                                                }
                                                                eDmedia1=eDmedia1/Clase0;
                                                                
                                                                for(int i=0;i<kn;i++)
                                                                {
                                                                    String aux= (String)dtm2.getValueAt(i,2);
                                                                            if(aux.equals("1"))
                                                                            {
                                                                                eDmedia2=eDmedia2+Double.parseDouble((String)dtm2.getValueAt(i,1));
                                                                            }
                                                                }
                                                                eDmedia2=eDmedia2/Clase1;
                                                                
                                                                System.out.println("Media1: "+eDmedia1);
                                                                System.out.println("Media2: "+eDmedia2);
                                                                
                                                                  if(eDmedia1<eDmedia2)
                                                                    {
                                                                        JOptionPane.showMessageDialog(null,""
                                                                            + "Media de la clase 0 es: "+String.format("%.4f", eDmedia1)+"\n"
                                                                            + "Media de la clase 1 es: "+String.format("%.4f", eDmedia2)+"\n"
                                                                            + "¡uff! ¡Logramos el desempate de clases! \n"
                                                                            + "el patron{"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase 0"); 
                                                                    }
                                                                  else if(eDmedia2<eDmedia1)
                                                                    {
                                                                        JOptionPane.showMessageDialog(null,""
                                                                            + "Media de la clase 0 es: "+String.format("%.4f", eDmedia1)+"\n"
                                                                            + "Media de la clase 1 es: "+String.format("%.4f", eDmedia2)+"\n"
                                                                            + "¡uff! ¡Logramos el desempate de clases! \n"
                                                                            + "el patron{"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase 1");  
                                                                    }
                                                        }
                                                        if(opc.equals("2"))
                                                        {
                                                            if(Clase1==1 && Clase0==1)
                                                            {
                                                                int clase=0;
                                                                
                                                                    double aux1=0;
                                                                    double aux2=0;
                                                                    
                                                                        for(int i=0;i<kn;i++)
                                                                        {
                                                                            String aux= (String)dtm2.getValueAt(i,2);
                                                                                    if(aux.equals("0"))
                                                                                    {
                                                                                        aux1=aux1+Double.parseDouble((String)dtm2.getValueAt(i,1));
                                                                                    }
                                                                                    if(aux.equals("1"))
                                                                                    {
                                                                                        aux2=aux2+Double.parseDouble((String)dtm2.getValueAt(i,1));
                                                                                    }
                                                                        }
                                                                                if(aux1<aux2)
                                                                                    {
                                                                                    JOptionPane.showMessageDialog(null,""
                                                                                        + "La distancia minima de la clase 0 con respecto al patron a clasificar es: "+String.format("%.4f", aux1)+"\n"
                                                                                        + "La distancia minima de la clase 1 con respecto al patron a clasificar es: "+String.format("%.4f", aux2)+"\n"
                                                                                        + "¡uff! ¡Logramos el desempate de clases! \n"
                                                                                        + "el patron{"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase 0"); 
                                                                                    }
                                                                                else if(aux2<aux1)
                                                                                    {
                                                                                    JOptionPane.showMessageDialog(null,""
                                                                                        + "La distancia minima de la clase 0 con respecto al patron a clasificar es: "+String.format("%.4f", aux1)+"\n"
                                                                                        + "La distancia minima de la clase 1 con respecto al patron a clasificar es: "+String.format("%.4f", aux2)+"\n"
                                                                                        + "¡uff! ¡Logramos el desempate de clases! \n"
                                                                                        + "el patron{"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase 1"); 
                                                                                    }
                                                            }
                                                            else if(Clase1>=1 || Clase0>=1)
                                                            {
                                                                    double[] eD0 = new double [Clase0];int a=0;
                                                                    double[] eD1 = new double [Clase1];int b=0;
                                                                    
                                                                    for(int i=0;i<(Clase0+Clase1);i++)
                                                                    {
                                                                        String aux= (String)dtm2.getValueAt(i,2);
                                                                                    if(aux.equals("0"))
                                                                                    {
                                                                                        
                                                                                        eD0[a]=Double.parseDouble((String)dtm2.getValueAt(i,1));
                                                                                        a=a+1;
                                                                                    }
                                                                                    if(aux.equals("1"))
                                                                                    {
                                                                                        
                                                                                        eD1[b]=Double.parseDouble((String)dtm2.getValueAt(i,1));
                                                                                        b=b+1;
                                                                                    }
                                                                    }
                                                                    MayorOMenor p = new MayorOMenor();
                                                                    double C1= p.GetMenor(eD0);
                                                                    double C2= p.GetMenor(eD1);
                                                                    
                                                                                if(C1<C2)
                                                                                    {
                                                                                    JOptionPane.showMessageDialog(null,""
                                                                                        + "La distancia minima de la clase 0 con respecto al patron a clasificar es: "+String.format("%.4f", C1)+"\n"
                                                                                        + "La distancia minima de la clase 1 con respecto al patron a clasificar es: "+String.format("%.4f", C2)+"\n"
                                                                                        + "¡uff! ¡Logramos el desempate de clases! \n"
                                                                                        + "el patron{"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase 0"); 
                                                                                    }
                                                                                else if(C2<C1)
                                                                                    {
                                                                                    JOptionPane.showMessageDialog(null,""
                                                                                        + "La distancia minima de la clase 0 con respecto al patron a clasificar es: "+String.format("%.4f", C1)+"\n"
                                                                                        + "La distancia minima de la clase 1 con respecto al patron a clasificar es: "+String.format("%.4f", C2)+"\n"
                                                                                        + "¡uff! ¡Logramos el desempate de clases! \n"
                                                                                        + "el patron{"+Xn.getText()+","+Yn.getText()+"} con k="+kn+" pertenece a la clase 1"); 
                                                                                    }
                                                            }
                                                        }
                                            }
                                }
                        }
                        
                        //
                            try 
                            {
                            Graficar();
                            } catch (IOException ex) {
                                Logger.getLogger(ClasificadorEPAS.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Xn.setText("");
                            Yn.setText("");
                            Kn.setText("");
                            }
                
                
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Eliminar();
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
                String AuxS=(String)dtm1.getValueAt(i,3);
                if(AuxS.equals("0"))
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
                        String AuxS=(String)dtm1.getValueAt(i,3);
                        if(AuxS.equals("0"))
                        {   
                            Xx[aux]=Double.parseDouble((String)dtm1.getValueAt(i,1));
                            Xy[aux]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                            aux=aux+1;
                        }
                }
        ///Grafica 2
        indice=0;
        
                for(int i=0;i<Tabla1.getRowCount();i++)
                {
                        
                        String AuxS=(String)dtm1.getValueAt(i,3);
                        if(AuxS.equals("1"))
                        {
                            indice=indice+1;
                        }
                }
        double[] Yx= new double[indice];
        double[] Yy= new double[indice];
        
        aux=0;
        
                        for(int i=0;i<Tabla1.getRowCount();i++)
                        {
                                
                                String AuxS=(String)dtm1.getValueAt(i,3);
                                if(AuxS.equals("1"))
                                {   
                                    Yx[aux]=Double.parseDouble((String)dtm1.getValueAt(i,1));
                                    Yy[aux]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                                    aux=aux+1;
                                }
                        }
        
                    
        
            String auxN;
            auxN=JOptionPane.showInputDialog("Ingresa el nombre de la grafica");
            
        Graficar plotear = new Graficar(Xx,Xy,Yx,Yy,auxN);
        plotear.Pintar4("Clase 0","Clase 1");
        
    
    }
    
    public void Graficar() throws IOException
    {
    
        int indice=0;
        
        for(int i=0;i<Tabla1.getRowCount();i++)
        {
                //total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                String AuxS=(String)dtm1.getValueAt(i,3);
                if(AuxS.equals("0"))
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
                        String AuxS=(String)dtm1.getValueAt(i,3);
                        if(AuxS.equals("0"))
                        {   
                            Xx[aux]=Double.parseDouble((String)dtm1.getValueAt(i,1));
                            Xy[aux]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                            aux=aux+1;
                        }
                }
        ///Grafica 2
        indice=0;
        
                for(int i=0;i<Tabla1.getRowCount();i++)
                {
                        
                        String AuxS=(String)dtm1.getValueAt(i,3);
                        if(AuxS.equals("1"))
                        {
                            indice=indice+1;
                        }
                }
        double[] Yx= new double[indice];
        double[] Yy= new double[indice];
        
        aux=0;
        
                        for(int i=0;i<Tabla1.getRowCount();i++)
                        {
                                
                                String AuxS=(String)dtm1.getValueAt(i,3);
                                if(AuxS.equals("1"))
                                {   
                                    Yx[aux]=Double.parseDouble((String)dtm1.getValueAt(i,1));
                                    Yy[aux]=Double.parseDouble((String)dtm1.getValueAt(i,2));
                                    aux=aux+1;
                                }
                        }
        
            String auxN;
            auxN=JOptionPane.showInputDialog("Ingresa el nombre de la grafica");
            
        Graficar plotear = new Graficar(Xx,Xy,Yx,Yy,auxN,Double.parseDouble(Xn.getText()),Double.parseDouble(Yn.getText()));
        plotear.Pintar5("Clase 0","Clase 1",10,10);
        
    
    }
   public void CargarD()
   {
       for(int i=0;i<8;i++)
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
                    ""+P,""+X1,""+X2,""+C
                    });
                    
                    PatronN.setText("");
                    ClaseN.setSelectedItem("");
                    X1N.setText("");
                    X2N.setText("");
            }
       else 
       JOptionPane.showMessageDialog(null,"Valida los campos para ingresar un patrón nuevo");   
   }
    
   
   
   public void Agregar(String c,String x, String y)
   {
       dtm2.addRow(new Object[]{
            ""+c,""+x,""+y
            });
   }
   
   public void dE()
   {
       String Xx=Xn.getText();
       String Yy=Yn.getText();
       double x=Double.parseDouble(Xx);
       double y=Double.parseDouble(Yy);
        
        String[][] dE= new String[Tabla1.getRowCount()][3];
        
         for(int i=0;i<Tabla1.getRowCount();i++)
        {
               double x2=Double.parseDouble((String)dtm1.getValueAt(i,1));
               double y2=Double.parseDouble((String)dtm1.getValueAt(i,2));
               dE[i][0]=(String)dtm1.getValueAt(i,0); 
               dE[i][1]=""+GeteD(x,y,x2,y2);
               dE[i][2]=(String)dtm1.getValueAt(i,3);
        }
         
         String [][] datosOrdenados = Ordenar(dE);
                    
        String[][] DatosSinOrden= new String[Tabla1.getRowCount()][3];
        
         for(int i=0;i<Tabla1.getRowCount();i++)
        {
               double x2=Double.parseDouble((String)dtm1.getValueAt(i,1));
               double y2=Double.parseDouble((String)dtm1.getValueAt(i,2));
               DatosSinOrden[i][0]=(String)dtm1.getValueAt(i,0); 
               DatosSinOrden[i][1]=""+GeteD(x,y,x2,y2);
               DatosSinOrden[i][2]=(String)dtm1.getValueAt(i,3);
        }
         
         for(int a=datosOrdenados.length-1;a>=0;a--)
             
         {
             String aux= datosOrdenados[a][1];
             
                       for(int b=0;b<DatosSinOrden.length;b++)
                           
                       {
                           if(DatosSinOrden[b][1].equals(aux))
                           {
                                
                                 double auxD=Double.parseDouble(DatosSinOrden[b][1]);
                                 dtm2.addRow(new Object[]{
                                ""+DatosSinOrden[b][0],""+String.format("%.4f",auxD),""+DatosSinOrden[b][2]});
                               
                           }
                       }   
         }   
   }
  
   public String [][] Ordenar (String [][] eD)
   {
      
       String [][] datos = eD;
    for (int x = 0; x < datos.length; x++) 
    {
        for (int i = 0; i < datos.length-x-1; i++) 
        {
            if(Double.parseDouble(datos [i][1]) < Double.parseDouble((datos [i+1][1])))
            {
                double tmp = Double.parseDouble(datos [i+1][1]);
                //
                datos [i+1][1] = datos [i][1];
                //
                datos [i][1] = ""+tmp;
            }
        }
    }
          return datos;
   }
   
   public double GeteD(double x1,double y1,double x2, double y2)
   {
       double aux1=0;
       double aux2=0;
       aux1=x2-x1;
       aux2=y2-y1; 
       
       aux1=aux1*aux1;
       aux2=aux2*aux2;
       
      
       double distancia = Math.sqrt(aux1+aux2);
       return distancia;
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ClaseN;
    private javax.swing.JLabel FondoB;
    private javax.swing.JTextField Kn;
    private javax.swing.JTextField PatronN;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField X1N;
    private javax.swing.JTextField X2N;
    private javax.swing.JTextField Xn;
    private javax.swing.JTextField Yn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
