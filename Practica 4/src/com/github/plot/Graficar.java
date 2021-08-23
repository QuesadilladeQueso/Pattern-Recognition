package com.github.plot;

import com.github.plot.Plot.Line;
import java.awt.Color;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * The first plot example
 * 
 * @author Yuriy Guskov
 * 
 */
public class Graficar {
            
        static double[] Xx;
        static double[] Xy;
        static double[] Yx;
        static double[] Yy;
        static double x,a,c;
        static double y,b,d;
        String nombre;
    public Graficar(double[] Xx,double[] Xy,double[] Yx,double[] Yy,double x,double y,String nombre,double a,double b, double c, double d)
            {
                   this.Xx=Xx;
                   this.Xy=Xy;
                   this.Yx=Yx;
                   this.Yy=Yy;
                   this.x=x;
                   this.y=y;
                   this.nombre=nombre;
                   this.a=a;
                   this.b=b;
                   this.c=c;
                   this.d=d;
            }
    public Graficar(double[] Xx,double[] Xy,double[] Yx,double[] Yy,String nombre)
            {
                   this.Xx=Xx;
                   this.Xy=Xy;
                   this.Yx=Yx;
                   this.Yy=Yy;
                   this.nombre=nombre;
            }
     public Graficar(double[] Xx,double[] Xy,double[] Yx,double[] Yy,String nombre,Double x,Double y)
            {
                   this.Xx=Xx;
                   this.Xy=Xy;
                   this.Yx=Yx;
                   this.Yy=Yy;
                   this.x=x;
                   this.y=y;
                   this.nombre=nombre;
            }
     public void Pintar(String Clase, String Clase2) throws IOException
     {
     
            // configuring plot options
		Plot plot = Plot.plot(Plot.plotOpts().
				title("Grafica").
				legend(Plot.LegendFormat.BOTTOM)).
			xAxis("x1", Plot.axisOpts().
				range(0, 10)).
			yAxis("x2", Plot.axisOpts().
				range(0, 10));
                
                    
                    plot.series(""+Clase, Plot.data().
				xy(Xx,Xy),
				Plot.seriesOpts().
					line(Line.NONE).
					color(Color.BLACK).
					marker(Plot.Marker.CIRCLE).
					markerColor(Color.YELLOW).
					markerSize(12));
                    plot.series(""+Clase2, Plot.data().
				xy(Yx,Yy),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.CYAN));
                    plot.series("X?", Plot.data().
				xy(x,y),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.RED));
                    plot.series("Z1", Plot.data().
				xy(a,b),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.GREEN));
                    plot.series("Z2", Plot.data().
				xy(c,d),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.BLUE));
                
               
		plot.save(""+nombre, "png");
                
                JOptionPane.showMessageDialog(null,"Se guardo correctamente la grafica con el nombre: "+nombre+".png");
     
     }
   
public void Pintar2(String Clase, String Clase2, int rangox, int rangoy) throws IOException
     {
            int ranx=rangox*-1;
            int rany=rangoy*-1;
            // configuring plot options
		Plot plot = Plot.plot(Plot.plotOpts().
				title("Grafica").
				legend(Plot.LegendFormat.BOTTOM)).
			xAxis("x1", Plot.axisOpts().
				range(ranx, rangox)).
			yAxis("x2", Plot.axisOpts().
				range(rany, rangoy));
                
                    
                    plot.series(""+Clase, Plot.data().
				xy(Xx,Xy),
				Plot.seriesOpts().
					line(Line.NONE).
					color(Color.BLACK).
					marker(Plot.Marker.CIRCLE).
					markerColor(Color.YELLOW).
					markerSize(12));
                    plot.series(""+Clase2, Plot.data().
				xy(Yx,Yy),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.CYAN));
               
		plot.save(""+nombre, "png");
                
                JOptionPane.showMessageDialog(null,"Se guardo correctamente la grafica con el nombre: "+nombre+".png");
     
     }     

public void Pintar3(String Clase, String Clase2, int rangox, int rangoy) throws IOException
     {
            int ranx=rangox*-1;
            int rany=rangoy*-1;
            // configuring plot options
		Plot plot = Plot.plot(Plot.plotOpts().
				title("Grafica").
				legend(Plot.LegendFormat.BOTTOM)).
			xAxis("x1", Plot.axisOpts().
				range(ranx, rangox)).
			yAxis("x2", Plot.axisOpts().
				range(rany, rangoy));
                
                    
                    plot.series(""+Clase, Plot.data().
				xy(Xx,Xy),
				Plot.seriesOpts().
					line(Line.NONE).
					color(Color.BLACK).
					marker(Plot.Marker.CIRCLE).
					markerColor(Color.YELLOW).
					markerSize(12));
                    plot.series(""+Clase2, Plot.data().
				xy(Yx,Yy),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.CYAN));
                    plot.series("X?", Plot.data().
				xy(x,y),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.RED));
                    plot.series("Z1", Plot.data().
				xy(a,b),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.GREEN));
                    plot.series("Z2", Plot.data().
				xy(c,d),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.BLUE));
                
               
		plot.save(""+nombre, "png");
                
                JOptionPane.showMessageDialog(null,"Se guardo correctamente la grafica con el nombre: "+nombre+".png");
     
     }

public void Pintar4(String Clase, String Clase2) throws IOException
     {
            
            // configuring plot options
		Plot plot = Plot.plot(Plot.plotOpts().
				title("Grafica").
				legend(Plot.LegendFormat.BOTTOM)).
			xAxis("x", Plot.axisOpts().
				range(0, 10)).
			yAxis("y", Plot.axisOpts().
				range(0, 10));
                
                    
                    plot.series(""+Clase, Plot.data().
				xy(Xx,Xy),
				Plot.seriesOpts().
					line(Line.NONE).
					color(Color.BLACK).
					marker(Plot.Marker.CIRCLE).
					markerColor(Color.YELLOW).
					markerSize(12));
                    plot.series(""+Clase2, Plot.data().
				xy(Yx,Yy),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.CYAN));
               
		plot.save(""+nombre, "png");
                
                JOptionPane.showMessageDialog(null,"Se guardo correctamente la grafica con el nombre: "+nombre+".png");
     
     }  
public void Pintar5(String Clase, String Clase2, int rangox, int rangoy) throws IOException
     {

            // configuring plot options
		Plot plot = Plot.plot(Plot.plotOpts().
				title("Grafica").
				legend(Plot.LegendFormat.BOTTOM)).
			xAxis("x1", Plot.axisOpts().
				range(0, rangox)).
			yAxis("x2", Plot.axisOpts().
				range(0, rangoy));
                
                    
                    plot.series(""+Clase, Plot.data().
				xy(Xx,Xy),
				Plot.seriesOpts().
					line(Line.NONE).
					color(Color.BLACK).
					marker(Plot.Marker.CIRCLE).
					markerColor(Color.YELLOW).
					markerSize(12));
                    plot.series(""+Clase2, Plot.data().
				xy(Yx,Yy),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.SQUARE).
					markerColor(Color.CYAN));
                    plot.series("X?", Plot.data().
				xy(x,y),
				Plot.seriesOpts().
					line(Line.NONE).
					marker(Plot.Marker.DIAMOND).
					markerColor(Color.RED));
               
		plot.save(""+nombre, "png");
                
                JOptionPane.showMessageDialog(null,"Se guardo correctamente la grafica con el nombre: "+nombre+".png");
     
     }
        
	
}
