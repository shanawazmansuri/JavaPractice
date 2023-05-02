package lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LamdaBasics {

	public static void main(String[] args) {

		LamFI lam = () -> System.out.println("I am inside timeout");

		Consumer<String> con = name -> System.out.println("My Name is " + name);
		Consumer<String> con2 = name -> System.out.println("My Last is " + name);
		Consumer<Integer> conag = age -> System.out.println("My Age is " + age);

		lam.timeOut();
		con.accept("Shanawaz");
		conag.accept(37);

		con.andThen(con2).accept("Shanawaz");
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * List<Integer> lista = new ArrayList<Integer>(); lista.add(2); lista.add(1);
		 * lista.add(3);
		 * 
		 * 
		 * Consumer<List<Integer>> modify = (list) -> { for (int i = 0; i < list.size();
		 * i++) list.set(i, 2 * list.get(i)); };
		 * 
		 * // Consumer to display a list of numbers Consumer<List<Integer> > dispList =
		 * (list) -> list.stream().forEach(a -> System.out.print(a + " "));
		 * 
		 * 
		 * 
		 * modify.accept(lista);
		 * 
		 * dispList.accept(lista);
		 */
		
		Consumer<List<Integer>> li = lis->
		{
			for(int i=0;i<lis.size();i++)
			{
				lis.set(i, 2*
						lis.get(i));
			}
		};
		
		  
		 Consumer<List<Integer>> fe = (lst)->lst.forEach(ele->System.out.println("Value is "+ele));
		 
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(2);
		 list.add(10);
		 list.add(15);
		 
		 li.accept(list);
		 fe.accept(list);
		 
		 
		System.out.println(list); 
		
		list.forEach(e->System.out.println(e));
		 

	}
}