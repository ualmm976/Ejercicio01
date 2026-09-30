//Problema 1:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;

public class estilo {
	private ArrayList<String> arr = new ArrayList<String>();
	public static void main(String[]args) {
		estilo ejemplo = new estilo();
		
		ejemplo.arr.add("3");
		
		System.out.println(ejemplo.arr.toString());
	}
}

package org.eda1.ejercicio01;

import java.util.ArrayList;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();		
		arr.add("3");
		
		System.out.println(arr.toString());
	}
}

*/
//Problema 2:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(i));
		}
		
		System.out.println(arr.toString());
	}
}

*/
//Problema 3:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			if(Math.random()<.5) arr.add(String.valueOf(i));
			else arr.add(String.valueOf(-i));
		}
		
		
		System.out.println(arr.toString());
	}
}

*/
//Problema 4:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(Math.random()<.5 ? i: -i));
		}
		
		int Neg1=0;
		//Uso del bucle for
		for(int i=0;i<arr.size();i++)
		{
			if(Integer.valueOf(arr.get(i))<0) Neg1++;
		}
		//Uso del Iterator
		int Neg2=0;
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			if(Integer.valueOf(it.next())<0) Neg2++;
		}
		//Uso del foreach
		int Neg3=0;
		for(String arrValue : arr) {
			if(Integer.valueOf(arrValue)<0) Neg3++;
		}
		
		System.out.println(arr.toString());
		System.out.println("El numero de elementos negativos Neg1 es " + Neg1);
		System.out.println("El numero de elementos negativos Neg2 es " + Neg2);
		System.out.println("El numero de elementos negativos Neg3 es " + Neg3);

	}
}

*/
//Problema 5:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(Math.random()<.5 ? i: -i));
		}
		
		System.out.println("Antes de modificar: "+arr.toString());
		
		//Uso del foreach
		for(int i=0;i<arr.size();i++) {
			if(Integer.valueOf(arr.get(i))<0) arr.set(i, String.valueOf(-Integer.valueOf(arr.get(i))));
		}
		
		System.out.println("Despues de modificar: "+arr.toString());

	}
}

*/
//Problema 6:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(Math.random()<.9 ? i: -i));
		}
		
		int i = 0;
		for(String arrValue : arr) {
			if(Integer.valueOf(arrValue) < 0) {
				System.out.println("He encontrado el primer negativo: " + arrValue);
				break;
			}
				i++;
				System.out.println("Negativo "+i);
			
		}
		
		System.out.println("Despues de modificar: "+arr.toString());

	}
}

//Mi solucion al problema 6: he añadido la numeralización de cada numero negativo: System.out.println("Negativo "+i);
*/
//Problema 7:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(Math.random()<.9 ? i: -i));
		}
		
		int i = 0;
		for(String arrValue : arr) {
			if(!(Integer.valueOf(arrValue) < 0)) {
				i++;
				System.out.println("Negativo "+i);
				continue;
			}
				
			System.out.println("He encontrado el primer negativo: " + arrValue);
			break;
		}
		
		System.out.println("Despues de modificar: "+arr.toString());

	}
}

*/
//Problema 8:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(Math.random()<.9 ? i: -i));
		}
		
		int i = 0;
		while(true) {
			if(i==arr.size())
			{
				System.out.println("No he encontrado ningun valor negativo ");
				break;
			}
			if(Integer.valueOf(arr.get(i))<0) 
			{
				System.out.println("Valor negativo encontrado: " + arr.get(i));
				break;
			}
			i++;
		}
		
		System.out.println("Despues de modificar: "+arr.toString());

	}
}
//Mi solucion al problema 8: 
/// 	public static void main(String[]args) {
/// 		ArrayList<String> arr = new ArrayList<String>();
/// 		for(int i=1;i<=50;i++)
/// {arr.add(String.valueOf(Math.random()<.9 ? i: -i));}
/// 		int i = 0;
/// while(true) {
/// 	if(Integer.valueOf(arr.get(i))<0) 
///			{
///			System.out.println("Valor negativo encontrado: " + arr.get(i));
///				break;
///			}
///			i++;
/// 
/// (i==arr.size) ? break; : continue;
/// }
/// System.out.println("No he encontrado ningun valor negativo ");
/// System.out.println("Despues de modificar: "+arr.toString());
/// }

*/
//Problema 9:
/*
package org.eda1.ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class estilo {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=1;i<=50;i++)
		{
			arr.add(String.valueOf(Math.random()<.9 ? i: -i));
		}
		
		int i = 0;
		while(true) {
			if(i==arr.size())
			{
				System.out.println("No he encontrado ningun valor negativo ");
				break;
			}
			if(!(Integer.valueOf(arr.get(i))<0)) {
				i++;
				continue; 
			}
			
				System.out.println("Valor negativo encontrado: " + arr.get(i));
			break;
		}
		
		System.out.println("Despues de modificar: "+arr.toString());

	}
}

*/


