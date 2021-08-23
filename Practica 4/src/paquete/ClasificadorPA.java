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


public class ClasificadorPA extends javax.swing.JFrame {
    
    String [][] Datos = new String [4][4]; 
    String [] titulo = new String []{"X1","X2","Y"};
    DefaultTableModel dtm1;
    double [] Pesos = new double [3];
    int B=-1;
    double A=0;

    public ClasificadorPA(DefaultTableModel dtm1, JLabel FondoB, JTable Tabla1, JTextArea Wn, JButton jButton1, JLabel jLabel10, JLabel jLabel2, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JScrollPane jScrollPane2) throws HeadlessException {
        this.dtm1 = dtm1;
        this.FondoB = FondoB;
        this.Tabla1 = Tabla1;
        this.Wn = Wn;
        this.jButton1 = jButton1;
        this.jLabel10 = jLabel10;
        this.jLabel2 = jLabel2;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
        this.jScrollPane2 = jScrollPane2;
    }

    
    public ClasificadorPA() {
              initComponents();
              setTitle("Clasificador Perceptron");
              setVisible(true);
              setResizable(false);
              setSize(850,483);
              setLocation(150,150); 

              Wn.setText("W0=0\nW1=0\nW2=0");
              dtm1 = new DefaultTableModel();
              dtm1.setColumnIdentifiers(titulo);
              Tabla1.setModel(dtm1);
              Datos[0][0]="-1";Datos[0][1]="-1";Datos[0][2]="-1";Datos[0][3]="0";
              Datos[1][0]="-1";Datos[1][1]="1";Datos[1][2]="1";Datos[1][3]="1";
              Datos[2][0]="1";Datos[2][1]="-1";Datos[2][2]="1";Datos[2][3]="1";
              Datos[3][0]="1";Datos[3][1]="1";Datos[3][2]="1";Datos[3][3]="1";
              DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
              centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
              Tabla1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
              Tabla1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
              Tabla1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
              CargarD();
              jButton2.setEnabled(false);
              jButton3.setEnabled(false);
              jButton4.setEnabled(false);
              Hn.setEditable(false);
              
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        X2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        Hn = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Wn = new javax.swing.JTextArea();
        An = new javax.swing.JTextField();
        umbral = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Xn = new javax.swing.JLabel();
        Yn = new javax.swing.JLabel();
        Zn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        FondoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X1:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(640, 350, 30, 17);

        X1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X1);
        X1.setBounds(670, 350, 50, 16);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("X2:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(640, 380, 30, 17);

        X2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(X2);
        X2.setBounds(670, 380, 50, 16);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seccion para clasificar");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 370, 170, 17);

        Resultado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Resultado);
        Resultado.setBounds(710, 150, 100, 20);

        w2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(w2);
        w2.setBounds(550, 140, 40, 20);

        w1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(w1);
        w1.setBounds(550, 90, 40, 20);

        w3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(w3);
        w3.setBounds(550, 210, 40, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("α:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 380, 20, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("B:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 350, 20, 17);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "X1", "X2", "Y"
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

        Hn.setBackground(new java.awt.Color(0, 0, 0));
        Hn.setColumns(20);
        Hn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Hn.setRows(5);
        getContentPane().add(Hn);
        Hn.setBounds(380, 300, 410, 40);

        jButton1.setText("Generar Pesos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 280, 120, 23);

        jButton3.setText("Entrenar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 360, 100, 23);

        Wn.setColumns(20);
        Wn.setRows(5);
        getContentPane().add(Wn);
        Wn.setBounds(120, 220, 80, 50);

        An.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(An);
        An.setBounds(130, 380, 50, 16);

        umbral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(umbral);
        umbral.setBounds(130, 350, 50, 16);

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 410, 90, 23);

        Xn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Xn.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Xn);
        Xn.setBounds(430, 50, 40, 30);

        Yn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Yn.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Yn);
        Yn.setBounds(430, 140, 40, 40);

        Zn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Zn.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Zn);
        Zn.setBounds(430, 240, 40, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Valor del umbral y de alpha");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 320, 200, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Wx Iniciales");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 200, 160, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Esqueleto.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 10, 440, 300);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Compuerta OR");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 10, 110, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salidas");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 40, 50, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entradas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 40, 70, 17);

        jButton4.setText("Clasificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(640, 410, 110, 23);

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
        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(An.getText().equals("") || umbral.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Hay datos vacios y/o invalidos!!!!!");
        }
        else
        {
        Zn.setText("");
        B = Integer.parseInt(""+umbral.getText());
        Zn.setText(""+B);
        Xn.setText("?");
        Yn.setText("?");
        A = Double.parseDouble(""+An.getText());
        umbral.setEditable(false);
        An.setEditable(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Entranamiento();
        jButton3.setEnabled(false);
        jButton4.setEnabled(true);
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
    
    public void Clasificar(double x, double y)
    {
        double clas=0;
        clas= (x*Pesos[0])+(y*Pesos[1])+(B*Pesos[2]);
        if(clas>=0)
        {
            JOptionPane.showMessageDialog(null,"El patron {"+x+","+y+"} pertence a la clase 1");
        }
        else if(clas<0)
        {
            JOptionPane.showMessageDialog(null,"El patron {"+x+","+y+"} pertence a la clase 0");
        }
        Resultado.setText(""+String.format("%.3f",clas));
    }
    public void Entranamiento ()
    {
            boolean bandera = true;
            do
            {
                bandera=true;
            for(int i=0;i<Tabla1.getRowCount();i++)
            {
                double aux=(Pesos[0]*Double.parseDouble((String)dtm1.getValueAt(i,0)))+(Pesos[1]*Double.parseDouble((String)dtm1.getValueAt(i,1)))+(Pesos[2]*B);
                if(aux<0 && Datos[i][3].equals("1"))
                {
                CorreccionC1(Double.parseDouble((String)dtm1.getValueAt(i,0)),Double.parseDouble((String)dtm1.getValueAt(i,1)),B);
                bandera=false;
                }
                else if(aux>=0 && Datos[i][3].equals("0"))
                {
                CorreccionC0(Double.parseDouble((String)dtm1.getValueAt(i,0)),Double.parseDouble((String)dtm1.getValueAt(i,1)),B);
                bandera=false;
                }
            }
            }
            while(bandera==false);
            JOptionPane.showMessageDialog(null,"Entrenamiento finalizado!!!!!!");
            Wn.setText("");
            w1.setText(String.format("%.3f", Pesos[0]));Wn.append("W0="+String.format("%.3f", Pesos[0])+"\n");
            w2.setText(String.format("%.3f", Pesos[1]));Wn.append("W1="+String.format("%.3f", Pesos[1])+"\n");
            w3.setText(String.format("%.3f", Pesos[2]));Wn.append("W2="+String.format("%.3f", Pesos[2]));
            Hn.setText("h="+String.format("%.3f", Pesos[0])+"*X1 + "+String.format("%.3f", Pesos[1])+"*X2 + "+String.format("%.3f", (B*Pesos[2])));
            jLabel10.setText("Wx Actualizados");
    }
    public void CorreccionC0(double x,double y,int b)
    {
        Pesos[0]=Pesos[0]-(2*A*x);
        Pesos[1]=Pesos[1]-(2*A*y);
        Pesos[2]=Pesos[2]-(2*A*b);
    }
    
    public void CorreccionC1(double x,double y,int b)
    {
        Pesos[0]=Pesos[0]+(2*A*x);
        Pesos[1]=Pesos[1]+(2*A*y);
        Pesos[2]=Pesos[2]+(2*A*b);
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
    private javax.swing.JTextField An;
    private javax.swing.JLabel FondoB;
    private javax.swing.JTextArea Hn;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextArea Wn;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JLabel Xn;
    private javax.swing.JLabel Yn;
    private javax.swing.JLabel Zn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField umbral;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    // End of variables declaration//GEN-END:variables
}
