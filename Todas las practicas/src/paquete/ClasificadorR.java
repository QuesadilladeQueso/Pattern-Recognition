package paquete;

import com.github.plot.Graficar;
import com.github.plot.Plot;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lbecerrils
 */
public class ClasificadorR extends javax.swing.JFrame {
    
    String [][] Datos = new String [4][3]; 
    String [] titulo = new String []{"X1","X2","Clase"};
    DefaultTableModel dtm1;
    double [] Pesos = new double [3];
    int B=-1;
    double A=0;
    double miu=0;

    public ClasificadorR(DefaultTableModel dtm1, JLabel FondoB, JTable Tabla1, JTextArea Wn, JButton jButton1, JLabel jLabel10, JLabel jLabel2, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JScrollPane jScrollPane2) throws HeadlessException {
        this.dtm1 = dtm1;
        this.FondoB = FondoB;
        this.Tabla1 = Tabla1;
        this.Wn = Wn;
        this.jButton1 = jButton1;
        this.jLabel10 = jLabel10;
        this.jLabel9 = jLabel9;
        this.jScrollPane2 = jScrollPane2;
    }

    
    public ClasificadorR() {
              initComponents();
              setTitle("Clasificador Por Regiones");
              setVisible(true);
              setResizable(false);
              setSize(850,483);
              setLocation(150,150); 

              Wn.setText("W0=0\nW1=0\nW2=0");
              dtm1 = new DefaultTableModel();
              dtm1.setColumnIdentifiers(titulo);
              Tabla1.setModel(dtm1);
              Datos[0][0]="0";Datos[0][1]="0";Datos[0][2]="1";
              Datos[1][0]="0";Datos[1][1]="1";Datos[1][2]="1";
              Datos[2][0]="1";Datos[2][1]="0";Datos[2][2]="0";
              Datos[3][0]="1";Datos[3][1]="1";Datos[3][2]="0";
              DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
              centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
              Tabla1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
              Tabla1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
              Tabla1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
              CargarD();
              jButton3.setEnabled(false);
              jButton4.setEnabled(false);
              jButton5.setEnabled(false);
              Fn.setEditable(false);
              Fn1.setEditable(false);
              
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        Miun = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        X2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Fn = new javax.swing.JTextArea();
        Fn1 = new javax.swing.JTextArea();
        Wn = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        FondoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("μ:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(120, 350, 20, 17);

        Miun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Miun);
        Miun.setBounds(140, 350, 50, 16);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("X1:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(560, 70, 30, 17);

        X1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X1);
        X1.setBounds(590, 70, 50, 16);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("X2:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(560, 100, 30, 17);

        X2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X2);
        X2.setBounds(590, 100, 50, 16);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Seccion para clasificar");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(530, 30, 170, 17);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "X1", "X2", "Clase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 240, 120);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 210, 350, 220);

        jButton5.setText("Asignar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(110, 380, 100, 23);

        jButton3.setText("Entrenar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 410, 100, 23);

        jButton2.setText("Pesos en 0`s");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 280, 120, 23);

        jButton1.setText("Generar Pesos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 280, 120, 23);

        Fn.setColumns(20);
        Fn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fn.setRows(5);
        getContentPane().add(Fn);
        Fn.setBounds(460, 160, 320, 30);

        Fn1.setColumns(20);
        Fn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fn1.setRows(5);
        getContentPane().add(Fn1);
        Fn1.setBounds(460, 180, 320, 30);

        Wn.setColumns(20);
        Wn.setRows(5);
        getContentPane().add(Wn);
        Wn.setBounds(120, 220, 80, 50);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Asignar valor de μ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 320, 140, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Wx Iniciales");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 200, 160, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Conjunto De Muestras De Aprendizaje");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 30, 270, 17);

        jButton4.setText("Clasificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(560, 130, 110, 23);

        FondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ClasificadorBS.png"))); // NOI18N
        getContentPane().add(FondoB);
        FondoB.setBounds(0, 0, 850, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Wn.setText("");
        for(int i=1;i<=3;i++)
        {
            Pesos[i-1]=GenerarW();
            Wn.append("W"+(i-1)+"="+String.format("%.2f", Pesos[i-1])+"\n");
        }
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Entranamiento();
        jButton3.setEnabled(false);
        jButton4.setEnabled(true);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Grafica.png")));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(X1.getText().equals("") || X2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Hay datos vacios y/o invalidos!!!!!"); 
        }
        else
        {
        Clasificar(Double.parseDouble(""+X1.getText()), Double.parseDouble(""+X2.getText()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Wn.setText("");
        for(int i=1;i<=3;i++)
        {
            Pesos[i-1]=0;
            Wn.append("W"+(i-1)+"=0\n");
        }
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        miu=Double.parseDouble(Miun.getText());
        Miun.setEditable(false);
        jButton5.setEnabled(false);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    
    public void Clasificar(double x, double y)
    {
        double clas=0;
        clas= (x*Pesos[0])+(y*Pesos[1])+(Pesos[2]);
        if(clas>0)
        {
            JOptionPane.showMessageDialog(null,"El patron {"+x+","+y+"} pertence a la clase 1");
        }
        else if(clas<0)
        {
            JOptionPane.showMessageDialog(null,"El patron {"+x+","+y+"} pertence a la clase 0");
        }
        Fn1.setText("fd(x)= "+clas);
    }
    public void Entranamiento ()
    {
            int k=0;
            boolean bandera = true;
            do
            {
                bandera=true;
            for(int i=0;i<Tabla1.getRowCount();i++)
            {
                k=k+1;
                
                double aux=(Pesos[0]*Double.parseDouble((String)dtm1.getValueAt(i,0)))+(Pesos[1]*Double.parseDouble((String)dtm1.getValueAt(i,1)))+(Pesos[2]*1);
                
                if(aux<=0 && Datos[i][2].equals("1"))
                {
                
                CorreccionC1(Double.parseDouble((String)dtm1.getValueAt(i,0)),Double.parseDouble((String)dtm1.getValueAt(i,1)));
                bandera=false;
                }
                else if(aux>=0 && Datos[i][2].equals("0"))
                {
                CorreccionC0(Double.parseDouble((String)dtm1.getValueAt(i,0)),Double.parseDouble((String)dtm1.getValueAt(i,1)));
                bandera=false;
                }
            }
            }
            while(bandera==false);
            JOptionPane.showMessageDialog(null,"Entrenamiento finalizado!!!!!!");
            Wn.setText("");
            jLabel10.setText("Wx Finales");
            Wn.append("W0="+String.format("%.3f", Pesos[0])+"\n");
            Wn.append("W1="+String.format("%.3f", Pesos[1])+"\n");
            Wn.append("W2="+String.format("%.3f", Pesos[2]));
            Fn.setText("fd(x)=X1*("+String.format("%.3f", Pesos[0])+") + X2*("+String.format("%.3f", Pesos[1])+") + "+String.format("%.3f", Pesos[2])+"");
    }
    public void CorreccionC0(double x,double y)
    {
        Pesos[0]=Pesos[0]-(miu*x);
        Pesos[1]=Pesos[1]-(miu*y);
        Pesos[2]=Pesos[2]-(miu*1);
    }
    
    public void CorreccionC1(double x,double y)
    {
        Pesos[0]=Pesos[0]+(miu*x);
        Pesos[1]=Pesos[1]+(miu*y);
        Pesos[2]=Pesos[2]+(miu*1);
    }
    public double GenerarW()
    {
              Random rnd = new Random();
              double w1 =rnd.nextDouble();
              return w1;
    }
    
   public void CargarD()
   {
       for(int i=0;i<4;i++)
       {
           dtm1.addRow(new Object[]{
            ""+Datos[i][0],""+Datos[i][1],""+Datos[i][2]
            });
       }
   }
   
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Fn;
    private javax.swing.JTextArea Fn1;
    private javax.swing.JLabel FondoB;
    private javax.swing.JTextField Miun;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextArea Wn;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
