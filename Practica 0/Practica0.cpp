/*
Becerril Saldivar Luis Alejandro
Practica 0
Reconocimiento de patrones
*/

// Librerias correspondientes para la implementacion de 
//funciones dentro del programa
#include <stdio.h>
#include <string.h>
#include <dirent.h> 
#include <windows.h>
#include <conio2.h>
#include <time.h>
#include <stdlib.h>

//Funciones Personalizadas

/*
Funcion: CrearClases
Recibe un parametro entero, dicha funcion te permite crear la clase
y se almacena en un archvio de texto plano txt
*/
void CrearClases(int Numclases);

/*
Funcion: Listar
Muestra una lista de clases creadar en el directorio donde este corriendo el 
programa
*/
void Listar();
/*Funcion: Menú
Desgloza las opciones con las cuales puede interacctuar el usuario
retornando un valor entero
*/
int Menu();
/*Funcion:  NumClases
Funcionq que retonar cuentas clases se crean
*/
int NumClases();
/*Funcion: MenuOp
Desgloza el menú de las operaciones que se pueden realziar entre las clases
y retona un valor entero
*/
int MenuOp();
/*Funcion: Operaciones
Funcion que realiza las 3 operaciones resta, suma y multiplicacion.
Solo se aplican a una clase individual
*/
void Operaciones();
/*Funcion:  Plano
Dibujo en cosola un plano XY
*/
void Plano();
/*Funcion: Setpoint
Dibuja un punto en el plano con sus coordenadas XY. 
*/
void Setpoint(int x,int y); 
/*Funcion: SetpointArray
Dibuja en el plano mas de un vector con sus coordenas XY. 
*/
void SetpointArray(int vectores[], int indice); 
/*Funcion: SetpointArray
Funcion que permite graficar clases independientes
*/
void Graficar();

/*Funcion principal del programa*/
int main()
{
   int opc;
   /*
   Men principal donde interactua el usuario
   */
   Inicio:
          system("cls");
   switch (Menu())
   {      
          case 1: CrearClases(NumClases()); goto Inicio;break;
          case 2: Listar(); Sleep(2000);goto Inicio; break;
          case 3: Operaciones();goto Inicio;break;
          case 4: Graficar();goto Inicio; break;
          case 5: goto Salir; break;
          default: printf("\n opcion incorrecta");goto Inicio; break;
   }
   Salir:
   return 0;
}

/*
Funcion: CrearClases
Recibe un parametro entero, dicha funcion te permite crear la clase
y se almacena en un archvio de texto plano txt
*/

void CrearClases(int Numclases)
{
     //Limpiamos buffer para que el apuntador del archivo no presente problemas
     fflush( stdin );
     char nombre[]="default.txt"; 
     //Ciclo que se repite N veces de acuerdo a las clasesa que vamos a crear
     for(int i=0;i<Numclases;i++)
     {
     char *puntero=nombre;     
     printf("\n Ingresa el nombre de la clase %d -->  ",(i+1));        
     gets(puntero); //Asignamos el nombre al archvio que represetara la clase
     strcat(puntero,".txt");//Concatenamos la extension para el archivo
     FILE *fichero; //Punto para el archivo
     fichero = fopen(puntero,"a"); // Creamos el fichero en modo de escritura y si no esta lo crea
                                  if (fichero == NULL){ //En caso de que no se pueda crear mandamos el
                                                        //mensaje de error
                                  printf("\n No se creo la clase");
			                      }else //Caso contrario soliciarmos cuantos patrones tendra la clase
			                      {   int Nump=0;
                                      printf(" Cuantos patrones tendra esta clase? --> ");
                                      scanf("%d",&Nump);
                                      fflush( stdin );
                                      for(int i=0;i<Nump;i++) //dentro del fichero colocamos los patrones
                                      {
                                              int x1=0,x2=0;
                                              printf("\n Ingresa el par numero %d (Rango entre 0 y 9)",(i+1));
                                              printf("\n Ingresa x1 ->");scanf("%d",&x1);
                                              fflush( stdin );
                                              printf(" Ingresa x2 ->");scanf("%d",&x2);
                                              fflush( stdin );
                                              if(i==0){fprintf(fichero,"%d %d",x1,x2);}
                                              else{fprintf(fichero,"\n%d %d",x1,x2);}
                                              
                                      }
                                  }
     fclose(fichero);        //Cerramos el fichero
     printf(" \n\n\t##### Clase(s) creada(s) con sus patrones con exito #####\n\n\n");
     Sleep(500); //Confirmamos que el fichero se creo correctamente
     }
     

     
}

void Listar()
{
        
DIR *d; // Se crea un punto a una estructura de tipo direcctorio para listar los archvivos
  struct dirent *dir;
  d = opendir(".");
  
  if (d) // si se localiza directorio listamos los mismos
  {
        printf(" \n\n\t\t ###### Lista de clases creadas ###### \n\n ");
    while ((dir = readdir(d)) != NULL)
    {
      //string[position+c-1];
      if(strlen(dir->d_name)>4)
      {
            char aux[strlen(dir->d_name)];
            strcpy(aux,dir->d_name);
            for(int i=0;i<strlen(dir->d_name);i++)
            {
            if(aux[i]=='.')
            {
               if( aux[i+1]=='t' && aux[i+2]=='x' && aux[i+3]=='t') //Aplicamos un filtro y solo
               //mostrara archivos txt 
               {
                   
                   for(int a=0;a<strlen(dir->d_name);a++)
                   {
                     if(aux[a]!='.'){printf("%c",aux[a]);}  
                     else {printf("\n ");break;};     
                   }
                   
               }           
            }
            }
           //printf("%s\n", dir->d_name);
      }
    }

    closedir(d);
  }
        
}

/*
Funcion menú que no brinda las opciones en las que puede interacturar el usuario
*/
int Menu () 
{
   int opc;
   textcolor(15);
   printf("\n\t\t\t\t #### Menu ####\n\n");
   printf("\n\t\t\t 1- Crear clase(s)");
   printf("\n\t\t\t 2- Ver clase(s) creadas");
   printf("\n\t\t\t 3- Operaciones con clases");
   printf("\n\t\t\t 4- Graficar clase(s)");
   printf("\n\t\t\t 5- Salir");     
   printf("\n\t\t\t --> ");scanf("%d",&opc);
   return opc;
}

/*
Funcion NumClases, solo los regresa un valor entero que son las clases que se crearan
*/
int NumClases()
{
 int opc;
 printf("\n\t\t Ingresa cuentas clases deseas crear -> "); 
 scanf("%d",&opc);
 return opc;  
    
}

void Operaciones () // Operaciones que puede realizar el usuario
{
               
               char nombre[]="default.txt";
               char *puntero=nombre; //Creamos un puntero para abrir las clases y efectuar las operaciones
                                    int x1=0,x2=0;
                                    int aux=0;
                                    int a=0;
              FILE *archivo;
              char caracter;
              char auxcaracter;
              int vectores[30];
              int escalar=0,numv=0;
       Listar();
       TryAgain:
       switch (MenuOp())
   {
          case 1:
               fflush( stdin );
               printf("\n Ingresa el nombre de la clase a operar-->  ");        
               gets(puntero);
               strcat(puntero,".txt");
               
               /////// Suma -- Abrimos el archivo
                        	archivo = fopen(puntero,"r");
                        	if (archivo == NULL)
                                {
                                    printf("\n Error de apertura de la clase. \n\n");
                                }
                                else
                                {
                                    //Ingreso a la clase con exito

                                    while((caracter = fgetc(archivo)) != EOF)
                        	    {   //Mientras no sea el fin del archivo obtenemos el caracter
                        		    //printf("\n--> %c <--",caracter);
                                    if(caracter!=' ' && '\n' != caracter && aux==0) //Mientras no sea un espacio o salto de linea tomamos el caracter
                        		    {
                                          x1=x1+(caracter - '0'); //Comvertimos de char a int mediante ANSCII
                                          aux=aux+1;
                                          //printf("\n valor x1: %d",(caracter - '0'));
                                          
                                    }
                                    
                                    else if(caracter!=' ' && '\n' != caracter && aux==1)
                        		    {
                                          x2=x2+(caracter - '0');
                                          aux=aux-1;
                                          //printf("\n valor x2: %d",(caracter - '0'));
                                    }
                        	    }
                                }
                                fclose(archivo);
                                //Cerramos el archivo  y mostramos el resultado
                                printf(" \n\t\t Resultado X1:%d ; x2:%d ",x1,x2);     
                                fflush( stdin );            
                                printf(" \n\t\t Graficar el punto? Si-1 No-0 -->");int z;scanf("%d",&z);
                                if(z==1){Sleep(500);system("cls");Plano();Setpoint(x1,x2);getch();}
                                //Si el usuario lo desea se grafica el resultado
               ////// ##### Fin archivo
          break;
          case 2:
          
            fflush( stdin );
               printf("\n Ingresa el nombre de la clase a operar-->  ");        
               gets(puntero);
               strcat(puntero,".txt");
               
               /////// #### Archvio resta

                        	archivo = fopen(puntero,"r");
                        	if (archivo == NULL)
                                {
                                    printf("\n Error de apertura de la clase. \n\n");
                                }
                                else
                                {
                                    //Ingreso a la clase con exito

                                    while((caracter = fgetc(archivo)) != EOF)
                        	    {
                        		    //printf("\n--> %c <--",caracter);
                                    if(caracter!=' ' && '\n' != caracter && aux==0)
                        		    {     
                                          x1=x1-(caracter - '0'); 
                                          if(a==0){x1=x1*-1;a++;}
                                          aux=aux+1;
                                          //printf("\n valor x1: %d",(caracter - '0'));
                                          
                                    }
                                    
                                    else if(caracter!=' ' && '\n' != caracter && aux==1)
                        		    {     
                                          x2=x2-(caracter - '0');
                                          if(a==1){x2=x2*-1;a++;}
                                          aux=aux-1;
                                          //printf("\n valor x2: %d",(caracter - '0'));
                                    }
                        	    }
                                }
                                fclose(archivo);
                                
                                printf(" \n\t\t Resultado X1:%d ; X2:%d ",x1,x2);
                                fflush( stdin );            
                                printf(" \n\t\t Graficar el punto? Si-1 No-0 -->");int zz;scanf("%d",&zz);
                                if(zz==1){Sleep(500);system("cls");Plano();Setpoint(x1,x2);getch();}
               ////// ##### Fin archivo
               
               
          break;
          case 3:
          	
          	printf("\n Ingresa un escalar ");scanf("%d",&escalar);
          	fflush( stdin );
               printf("\n Ingresa el nombre de la clase a operar-->  ");        
               gets(puntero);
               strcat(puntero,".txt");
               
               /////// #### Archvio escalar
                        	
                        	archivo = fopen(puntero,"r");
                        	if (archivo == NULL)
                                {
                                    printf("\n Error de apertura de la clase. \n\n");
                                }
                                else
                                {
                                    //Ingreso a la clase con exito

                                    while((caracter = fgetc(archivo)) != EOF)
                        	    {
                        		    //printf("\n--> %c <--",caracter);
                                    if(caracter!=' ' && '\n' != caracter && aux==0)
                        		    {
                                          x1=(caracter - '0')*escalar; 
                                          aux=aux+1;
                                          vectores[numv]=x1;
                                          numv++;
                                          printf("\n\t\t X1: %d",x1);
                                          
                                    }
                                    
                                    else if(caracter!=' ' && '\n' != caracter && aux==1)
                        		    {
                                          x2=(caracter - '0')*escalar;
                                          aux=aux-1;
                                          vectores[numv]=x2;
                                          numv++;
                                          printf("\n\t\t X2: %d",x2);
                                    }
                        	    }
                                }
                                fclose(archivo);
                                
                                printf(" \n\t\t Resultado numv:%d ",numv);
                                system("cls");
                                Plano();
                                SetpointArray(vectores,numv);
                                getch();
                                system("cls");
               ////// ##### Fin archivo
               
          break;
           default: printf("\n opcion incorrecta");goto TryAgain; break;
   }
        
}

/*
Funcion muestra y retorna la opcion del menù
*/
int MenuOp()
{
 
 int opc;
   textcolor(10);printf("\n\t\t\t\t #### Menu ####\n\n");
   printf("\n\t\t\t 1- Suma");
   printf("\n\t\t\t 2- Resta");
   printf("\n\t\t\t 3- Multiplicacion por escalar");
   printf("\n\t\t\t --> ");scanf("%d",&opc);
   return opc;
     
}
/*
Funcion que dibuja un plano 2D en consola
*/
void Plano()
{          
            for(int i=0;i<40;i++)
            {
            gotoxy(60,i);printf("%c\n",197);
            }
            for(int i=0;i<120;i++){gotoxy(i,20);printf("%c\n",197);}
            //gotoxy(80,20);printf("%c",197);
}
/*
Funcion que coloca el punto en el plano
*/
void Setpoint(int x,int y)
{
      //textcolor(12);gotoxy(x,y);printf("%c",254);     
      //Centro x= 60 , y=20
      if(x>=1 && y>=1)//Primer cuadrante
      {
      textcolor(14);gotoxy((60+x),(20-y));printf("%c",254);
      }
      if(x<0 && y>=1)//Segundo cuadrante
      {
      textcolor(14);gotoxy((60+x),(20+y));printf("%c",254);
      }
      if(x<0 && y<0)//Tecer cuadrante
      {
      textcolor(14);gotoxy((60+x),(20+y));printf("%c",254);
      }
      if(x>=1 && y<0)//Cuarto cuadrante
      {
      textcolor(14);gotoxy((60+x),(20+y));printf("%c",254);
      }

}
/*
Funcion que coloca varios puntos en el plano
*/
void SetpointArray(int vectores[], int indice)
{
     int x=0,y=0;
     for(int i=0;i<indice;i=i+2)
     {
             x=vectores[i];
             y=vectores[i+1];
             
      if(x>=1 && y>=1)//Primer cuadrante
      {
      textcolor(14);gotoxy((60+x),(20-y));printf("%c",254);
      }
      if(x<0 && y>=1)//Segundo cuadrante
      {
      textcolor(14);gotoxy((60+x),(20+y));printf("%c",254);
      }
      if(x<0 && y<0)//Tecer cuadrante
      {
      textcolor(14);gotoxy((60+x),(20+y));printf("%c",254);
      }
      if(x>=1 && y<0)//Cuarto cuadrante
      {
      textcolor(14);gotoxy((60+x),(20+y));printf("%c",254);
      }
      if(x==0 && y==0)//Centro
      {
      textcolor(14);gotoxy((60),(20));printf("%c",254);
      }
      
      
     }          
}

/*
Funcion que abrir una clase "Arhcivo txt" y grafica sus puntos
*/
void Graficar()
{
     char nombre[]="default.txt";
               char *puntero=nombre;
                                    int x1=0,x2=0;
                                    int aux=0;
                                    int a=0;
              FILE *archivo;
              char caracter;
              char auxcaracter;
              int vectores[30];
              int escalar=1,numv=0;
              Listar();
               fflush(stdin);
               printf("\n Ingresa el nombre de la clase a operar-->  ");        
               gets(puntero);
               strcat(puntero,".txt");
               
               /////// #### Archvio escalar
                        	
                        	archivo = fopen(puntero,"r");
                        	if (archivo == NULL)
                                {
                                    printf("\n Error de apertura de la clase. \n\n");
                                }
                                else
                                {
                                    //Ingreso a la clase con exito

                                    while((caracter = fgetc(archivo)) != EOF)
                        	    {
                        		    //printf("\n--> %c <--",caracter);
                                    if(caracter!=' ' && '\n' != caracter && aux==0)
                        		    {
                                          x1=(caracter - '0')*escalar; 
                                          aux=aux+1;
                                          vectores[numv]=x1;
                                          numv++;
                                          printf("\n\t\t X1: %d",x1);
                                          
                                    }
                                    
                                    else if(caracter!=' ' && '\n' != caracter && aux==1)
                        		    {
                                          x2=(caracter - '0')*escalar;
                                          aux=aux-1;
                                          vectores[numv]=x2;
                                          numv++;
                                          printf("\n\t\t X2: %d",x2);
                                    }
                        	    }
                                }
                                fclose(archivo);
                                
                                printf(" \n\t\t Resultado numv:%d ",numv);
                                system("cls");
                                Plano();
                                SetpointArray(vectores,numv);
                                getch();
                                system("cls");
               ////// ##### Fin archivo
            
}
