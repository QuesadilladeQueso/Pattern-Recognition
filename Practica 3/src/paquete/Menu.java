package paquete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        
        initComponents();
              setTitle("Pattern Recognition");
              setVisible(true);
              setResizable(false);
              setSize(340,550);
              setLocation(500,150);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        Boton5 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        FondoBlanco4 = new javax.swing.JLabel();
        FondoBlanco3 = new javax.swing.JLabel();
        FondoBlanco2 = new javax.swing.JLabel();
        FondoBlanco1 = new javax.swing.JLabel();
        FondoBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(-30, 10, 420, 290);

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clasificador5.png"))); // NOI18N
        Boton5.setBorder(null);
        Boton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5);
        Boton5.setBounds(10, 390, 320, 20);

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clasificador4.png"))); // NOI18N
        Boton4.setBorder(null);
        Boton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4);
        Boton4.setBounds(10, 360, 320, 20);

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clasificador2.png"))); // NOI18N
        Boton2.setBorder(null);
        Boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2);
        Boton2.setBounds(30, 330, 280, 20);

        FondoBlanco4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBlanco.png"))); // NOI18N
        getContentPane().add(FondoBlanco4);
        FondoBlanco4.setBounds(0, 130, 300, 400);

        FondoBlanco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBlanco.png"))); // NOI18N
        getContentPane().add(FondoBlanco3);
        FondoBlanco3.setBounds(40, 140, 300, 400);

        FondoBlanco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBlanco.png"))); // NOI18N
        getContentPane().add(FondoBlanco2);
        FondoBlanco2.setBounds(0, 70, 290, 400);

        FondoBlanco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBlanco.png"))); // NOI18N
        getContentPane().add(FondoBlanco1);
        FondoBlanco1.setBounds(50, 0, 290, 400);

        FondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBlanco.png"))); // NOI18N
        getContentPane().add(FondoBlanco);
        FondoBlanco.setBounds(0, 0, 290, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
            
            String[] titulos;
            String[] nuevorow = null;
            int Numclases;
            int Numpesos;
            int f=0;
            String patron ="^[0-9]+([.]?[0-9]+)?$";
            String patro1="^[1-9]";
            String patro2="^1|^2";
            Matcher mat;
            Pattern pat = Pattern.compile(patron);
            Pattern pato = Pattern.compile(patro1);
            Pattern patoo = Pattern.compile(patro2);
            String aux="";
            JOptionPane.showMessageDialog(null,"Bienvenido al Clasificador Bayesiano Simple");
                            do
                            {
                                aux=JOptionPane.showInputDialog("Ingresa una opcion \n1-Ingresar datos de forma manual \n2-Datos precargados");
                                mat = patoo.matcher(aux);
                            }while(mat.matches()==false);
            String opcion=aux;
            aux="";
                if(opcion.equals("2"))
                {
                titulos=new String[]{"Ci \\ grs","70","75","80","85","90","95","100"};
                nuevorow= new String[]{"-","0","0","0","0","0","0","0"};
                f=1;
                }
                    else
                        {
                                    aux="";
                                    do
                                    {
                                         aux=JOptionPane.showInputDialog("Cuantas divisiones habra");
                                         mat = pato.matcher(aux);
                                         System.out.println("Valor: "+aux+" otro:"+mat.matches());
                                    }while(mat.matches()==false);
                                    Numpesos=Integer.parseInt(aux);

                        titulos  = new String[1+Numpesos];
                        nuevorow = new String[1+Numpesos];
                        titulos[0]="Ci \\ grs";
                        nuevorow[0]="-";
                                for(int i=1;i<=Numpesos;i++)
                                {
                                aux="";
                                    do
                                    {
                                         aux=JOptionPane.showInputDialog("Ingresa la medida #"+(i));
                                         mat = pat.matcher(aux);
                                         System.out.println("Valor: "+aux+" otro:"+mat.matches());
                                    }while(mat.matches()==false);
                                titulos[i]=aux;
                                aux="";
                                nuevorow[i]="0";
                                }
                        }
        ClasificadorBY ClasificadorB = new ClasificadorBY(titulos,nuevorow,f);
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        ClasificadorBE Clasificador = new ClasificadorBE();
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        ClasificadorEPAS Clasificador = new ClasificadorEPAS();
    }//GEN-LAST:event_Boton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoBlanco;
    private javax.swing.JLabel FondoBlanco1;
    private javax.swing.JLabel FondoBlanco2;
    private javax.swing.JLabel FondoBlanco3;
    private javax.swing.JLabel FondoBlanco4;
    // End of variables declaration//GEN-END:variables
}
