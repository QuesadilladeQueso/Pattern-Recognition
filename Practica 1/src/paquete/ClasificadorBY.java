package paquete;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClasificadorBY extends javax.swing.JFrame {
    
    DefaultTableModel dtm1;
    DefaultTableModel dtm2;
    DefaultTableModel dtm3;
    DefaultTableModel temmodelo;
    String[] titulos = new String[]{"Ci \\ grs","70","75","80","85","90","95","100"};
    String[] titulo = new String[]{"Ci","|Ci|","P(Ci)"};
    String[] nuevorow;
    String[] c1 = new String[]{"Litchies","0","0","602","1640","8","0","0"};
    String[] c2 = new String[]{"Rambutan","627","1650","23","8","0","0","0"};
    String[] c3 = new String[]{"Jocotes","0","0","0","10","2035","405","0"};
    
    public ClasificadorBY(String[] titulos, String[] nuevorow, int i) {
              initComponents();
              setTitle("Clasificador Bayesiano Simple");
              setVisible(true);
              setResizable(false);
              setSize(850,450);
              setLocation(150,150);         
              this.titulos=titulos;
              this.nuevorow=nuevorow;
              dtm1 = new DefaultTableModel();
              dtm2 = new DefaultTableModel();
              dtm3 = new DefaultTableModel();
              dtm1.setColumnIdentifiers(titulos);
              dtm2.setColumnIdentifiers(titulos);
              dtm3.setColumnIdentifiers(titulo);
              Tabla1.setEnabled(false);
              Tabla2.setEnabled(false);
              Tabla3.setEnabled(false);
              Tabla1.setModel(dtm1);
              Tabla2.setModel(dtm2);
              Tabla3.setModel(dtm3);
              B2.setEnabled(false);
              Texto.setEditable(false);
              Entrenamiento.setEnabled(false);
              Clasificar.setEnabled(false);
              Eliminar.setEnabled(false);
              Text.setEditable(false);
              if(i==1)
              {
                  dtm1.addRow(c1);
                  dtm1.addRow(c2);
                  dtm1.addRow(c3);
              }
              else
              {
              dtm1.addRow(nuevorow);
              }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Text = new javax.swing.JTextField();
        Clasificar = new javax.swing.JButton();
        Texto = new javax.swing.JTextField();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        Generar = new javax.swing.JButton();
        Entrenamiento = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Titul2 = new javax.swing.JLabel();
        Titul1 = new javax.swing.JLabel();
        FondoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(440, 210, 100, 23);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar);
        Agregar.setBounds(440, 180, 100, 23);

        Text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Text);
        Text.setBounds(560, 390, 80, 16);

        Clasificar.setText("Clasificar");
        Clasificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasificarActionPerformed(evt);
            }
        });
        getContentPane().add(Clasificar);
        Clasificar.setBounds(650, 390, 90, 23);

        Texto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Texto);
        Texto.setBounds(50, 180, 80, 16);

        B2.setText("Guardar");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(300, 180, 130, 23);

        B1.setText("Modificar datos");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(150, 180, 130, 23);

        Generar.setText("Calcular");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        getContentPane().add(Generar);
        Generar.setBounds(740, 180, 90, 23);

        Entrenamiento.setText("Entrenamiento");
        Entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenamientoActionPerformed(evt);
            }
        });
        getContentPane().add(Entrenamiento);
        Entrenamiento.setBounds(410, 390, 130, 23);

        Tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane4.setViewportView(Tabla4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(560, 250, 180, 130);

        Tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(Tabla3);
        if (Tabla3.getColumnModel().getColumnCount() > 0) {
            Tabla3.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(560, 40, 270, 130);

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(Tabla2);
        if (Tabla2.getColumnModel().getColumnCount() > 0) {
            Tabla2.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            Tabla2.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            Tabla2.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            Tabla2.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            Tabla2.getColumnModel().getColumn(5).setHeaderValue("Title 6");
            Tabla2.getColumnModel().getColumn(6).setHeaderValue("Title 7");
            Tabla2.getColumnModel().getColumn(7).setHeaderValue("Title 8");
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 250, 520, 130);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            Tabla1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            Tabla1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            Tabla1.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            Tabla1.getColumnModel().getColumn(5).setHeaderValue("Title 6");
            Tabla1.getColumnModel().getColumn(6).setHeaderValue("Title 7");
            Tabla1.getColumnModel().getColumn(7).setHeaderValue("Title 8");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 520, 130);

        Titul2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Titul2.setText("Tabla de entrenamiento");
        getContentPane().add(Titul2);
        Titul2.setBounds(170, 210, 210, 20);

        Titul1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Titul1.setText("Tabla de distribucion");
        getContentPane().add(Titul1);
        Titul1.setBounds(180, 10, 180, 20);

        FondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ClasificadorBS.png"))); // NOI18N
        getContentPane().add(FondoB);
        FondoB.setBounds(0, 0, 850, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenamientoActionPerformed
        GenerarEntrenamiento();
        Entrenamiento.setEnabled(false);
        Clasificar.setEnabled(true);
        Text.setEditable(true);
    }//GEN-LAST:event_EntrenamientoActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        Calcular();
        Generar.setEnabled(false);
    }//GEN-LAST:event_GenerarActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        B2.setEnabled(false);
        B1.setEnabled(true);
        Eliminar.setEnabled(false); 
        Tabla1.setEnabled(false);
        BorrarTabla(dtm2, Tabla2);
        BorrarTabla(dtm3, Tabla3);
        BorrarTabla(temmodelo, Tabla4);
        Update();
        Generar.setEnabled(true);
        Entrenamiento.setEnabled(false);
        Clasificar.setEnabled(false);
        Text.setEditable(false);
        Texto.setEditable(false);
        Text.setText("");
    }//GEN-LAST:event_B2ActionPerformed
    
    public void Update()
    {
        int fila=Tabla1.getSelectedRow();
        int columna=Tabla1.getSelectedColumn();
        String aux="";
        if(Texto.getText().equals("") || Texto.getText().equals(" "))
            aux="0";
        else aux=Texto.getText();
        dtm1.setValueAt(aux, fila,columna);
        Texto.setText("");
    }
    public void BorrarTabla(DefaultTableModel modelo,JTable tabla)
    {
        
            int f1=tabla.getRowCount();
            for(int i=f1-1;i>=0;i--)modelo.removeRow(i);
    
    }
    
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        B1.setEnabled(false);
        B2.setEnabled(true);
        Eliminar.setEnabled(true);
        Tabla1.setEnabled(true);
        Texto.setEditable(true);
    }//GEN-LAST:event_B1ActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        if(evt.getButton()==1){SetValues();}
    }//GEN-LAST:event_Tabla1MouseClicked

    private void ClasificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasificarActionPerformed
        Clasificar();
    }//GEN-LAST:event_ClasificarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Agregar();
        Clasificar.setEnabled(false);
    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if(Tabla1.getRowCount()==0)
        {
        JOptionPane.showMessageDialog(null,"No hay información y/o no haz seleccionado nada para eliminar");
        }
        else
        Eliminar();
    }//GEN-LAST:event_EliminarActionPerformed
    
       public void Eliminar()
    {   
            int fila=Tabla1.getSelectedRow();
            dtm1.removeRow(fila);
    }
    public void Agregar()
    {
        dtm1.addRow(nuevorow);
    }
    public void Clasificar()
    {
        
        if(Text.getText().length()!=0)
        {
        DecimalFormat formato = new DecimalFormat("#");
      
        float[] numeros = new float[(titulos.length)];
        
        for(int i=1;i<titulos.length;i++)
        {
            numeros[i]=(float)Float.parseFloat(titulos[i]);
        }
        
        float near= NumberNear.masCercano(numeros,(float)Float.parseFloat(Text.getText()));
        int indexOf=NumberNear.GetIndexOf(numeros, near);
        temmodelo = new DefaultTableModel();
        String[] temptitulos={"Ci","i="+formato.format(near)+"grs"};
        temmodelo.setColumnIdentifiers(temptitulos);
        Tabla4.setModel(temmodelo);
        
        String [] auxdatos={"",""};
        int f=0;
        f=Tabla1.getRowCount();
        for(int i=0;i<f;i++)
        {
            auxdatos[0]=(String)dtm2.getValueAt(i,0);
            auxdatos[1]=(String)dtm2.getValueAt(i,(indexOf));
            temmodelo.addRow(auxdatos);
        }
        float[][] valores = new float[f][2];
        
        for(int i=0;i<f;i++)
        {
            String au;
            au=(String)temmodelo.getValueAt(i,1);
            if(au.equals("0"))
            {
            valores[i][0]=0;
            valores[i][1]=i;
            }
            else
            {
            double a1=(double)Float.parseFloat((String)dtm3.getValueAt(i,2));
            double a2=(double)Float.parseFloat((String)temmodelo.getValueAt(i,1));
            valores[i][0]=(float)Math.log(a1)+(float)Math.log(a2);
            valores[i][1]=i;
            }
        }
        
        int fi=NumberNear.contar0(valores);
        float[][] valor = new float[f][2];
        valor=NumberNear.quitar0(valores, f);
        JOptionPane.showMessageDialog(null,"Pertencece a la clase: "+(String)dtm1.getValueAt(NumberNear.GetClass(valor,(f-fi)),0));
        }
        else 
            JOptionPane.showMessageDialog(null,"Intenta de nuevo campo vacio o invalido");

    }
    public void SetValues()
    {
        int fila=Tabla1.getSelectedRow();
        int columna=Tabla1.getSelectedColumn();
        Texto.setText((String)(dtm1.getValueAt(fila,columna)));
    }
    
    public void Calcular()
    {
          DecimalFormat f = new DecimalFormat("#");
          DecimalFormat f1 = new DecimalFormat("#.####");
          int filas=Tabla1.getRowCount();
          int columnas=Tabla1.getColumnCount();
          String[] aux={"","",""};
          //System.out.println("Hola:"+filas+""+(String)dtm1.getValueAt(0,0));
          float total=0;
          System.out.println("Filas:"+filas+" Columnas:"+columnas);
                 if(filas!=0)
                 {
                     for(int a=0;a<filas;a++)
                     {
                         aux[0]=(String)dtm1.getValueAt(a,0);
                            
                                for(int i=1;i<columnas;i++)
                                {
                                total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                                }       
                         aux[1]=""+f.format(total);
                         float t=Float.parseFloat(CardinalidadTotal());
                         float p=total/t;
                         aux[2]=""+f1.format(p);
                         dtm3.addRow(aux);
                         total=0;
                     }
                    Entrenamiento.setEnabled(true);
                }
                 else
                 JOptionPane.showMessageDialog(null,"Intenta de nuevo, la tabla de distribucion no tiene datos");
                 
    }
    public String CardinalidadTotal()
    {
          DecimalFormat f = new DecimalFormat("#");
          int filas=Tabla1.getRowCount();
          int columnas=Tabla1.getColumnCount();
          String aux="";
          float total=0;
                 if(filas!=0)
                 {
                     for(int a=0;a<filas;a++)
                     {      
                                for(int i=1;i<columnas;i++)
                                {
                                total=total+Float.parseFloat((String)dtm1.getValueAt(a,i));
                                }
                     }
                     aux=""+f.format(total);
                 }
                 else aux="0";
                 return aux;
    }
    public void GenerarEntrenamiento()
    {
          int filas=Tabla1.getRowCount();
          int columnas=Tabla1.getColumnCount();
          String[] aux = new String[columnas];
          DecimalFormat f1 = new DecimalFormat("#.####");
          
          if(filas!=0)
          {
              for(int a=0;a<filas;a++)
              {
                 aux[0]=(String)dtm1.getValueAt(a,0);
                    
                    for(int i=1;i<columnas;i++)
                    {
                    String b="";
                    b=(String)dtm1.getValueAt(a,i);
                        if(b.equals("0")|| b.equals("")|| b.equals(" "))
                        {
                        aux[i]="0";
                        }
                        else
                        {
                        float c=Float.parseFloat((String)dtm1.getValueAt(a,i));
                        float aac=Float.parseFloat((String)dtm3.getValueAt(a,1));
                        float ac=c/aac;
                        aux[i]=""+f1.format(ac);
                        }
                    }
                    dtm2.addRow(aux);
              }
          }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton Clasificar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Entrenamiento;
    private javax.swing.JLabel FondoB;
    private javax.swing.JButton Generar;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTable Tabla3;
    private javax.swing.JTable Tabla4;
    private javax.swing.JTextField Text;
    private javax.swing.JTextField Texto;
    private javax.swing.JLabel Titul1;
    private javax.swing.JLabel Titul2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
