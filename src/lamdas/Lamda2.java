package lamdas;

import java.text.Collator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSException;

public class Lamda2 {

	public static void main(String[] args) {

		List<Integer> ls = List.of(60,12, 11, 25);

		///////////////////////////////////////// For
		///////////////////////////////////////// Each////////////////////////////////
		ls.forEach(ele -> System.out.println(ele));

		///////////////////////////////////////// Filter/////////////////////////////////////
		List<Integer> aa = ls.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(aa);

		///////////////////////////////////////// Map/////////////////////////////////////
		List<Integer> li = ls.stream().map(ele->ele*2).collect(Collectors.toList());
		System.out.println(li);
		
		///////////////////////////////////////// Reduce/////////////////////////////////////
		
		Optional<Integer> sum = li.stream().reduce((acc,actNum)->(acc+actNum));
		System.out.println(sum);
		
///////////////////////////////////////// Reduce/////////////////////////////////////
		
		long lg = li.stream().count();
		System.out.println(lg);
		
		List<Integer> ll = li.stream().distinct().collect(Collectors.toList());
		System.out.println(ll);
		
		Optional<Integer> lk = li.stream().findFirst();
		System.out.println(lk);
		
		 List<Integer> srt = li.stream().sorted().collect(Collectors.toList());
		System.out.println(srt);
		
		
		 List<Integer> desrt = li.stream().unordered().collect(Collectors.toList());
		 
		 
		 
		 
			System.out.println(srt);
		
	}



	///////////////////////////////////////// Filter/////////////////////////////////////

}
