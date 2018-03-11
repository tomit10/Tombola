
import java.util.Scanner;
public class Tombola_20 
{public static void main(String args[]) 
	{boolean tab[] = new boolean [91]; int i; int cont1=0,cont2=0,cont3=0;int num;
	 boolean ambo=false, terno=false, quaterna=false, cinquina=false; 
	 int riga1[]= new int [6];int riga2[]=new int[6]; int riga3[]= new int [6];
	 final int MAX= 90;
		     
			Scanner leggi= new Scanner(System.in);
			for (i=1;i<91;i++)//Caricamento vettore Tabellone
			    {tab[i]= false;}
			System.out.println("Inserisci numeri della riga 1: "); 
			for (i=1;i<6;i++)// Caricamento vettore riga 1
			    {riga1[i]= leggi.nextInt();}
			System.out.println("Inserisci numeri della riga 2: ");
			for (i=1;i<6;i++)// Caricamento vettore riga 2
			    {riga2[i]= leggi.nextInt();}  
			System.out.println("Inserisci numeri della riga 3: ");
			for (i=1;i<6;i++)// Caricamento vettore riga 3
			    {riga3[i]= leggi.nextInt();}  
			do{
			     do{
				    num= (int)(Math.random()*MAX)+1;
				   }while(tab[num]==true);  
				tab[num]=true;
				System.out.println(num);
				 for(i=1;i<6;i++)
				  {if (num== riga1[i])
				    {cont1= cont1+1;}
				   if (num== riga2[i])
				    {cont2= cont2+1;}
				   if (num== riga3[i])
				    {cont3= cont3+1;}
				  } 
				 if ((cont1==2 || cont2==2 || cont3==2 ) && (ambo==false))
				   {System.out.println("Ambo"); 
				    ambo=true;}
				 if ((cont1==3 || cont2==3 || cont3==3 ) && (terno==false))
			           {System.out.println("Terno");
				    terno=true;}
				 if ((cont1==4 || cont2==4 || cont3==4 ) && (quaterna==false))
				   {System.out.println("Quaterna");
				    quaterna=true;}
				 if ((cont1==5 || cont2==5 || cont3==5 ) && (cinquina==false))  
				   {System.out.println("Cinquina");
				    cinquina=true;}
			   }while (!(cont1==5 && cont2==5 && cont3==5));
		           System.out.println("Tombola");
	}
}
