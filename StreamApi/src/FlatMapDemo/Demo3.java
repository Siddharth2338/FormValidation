package FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		
		List<String> team1 = Arrays.asList("Rahul","Rohit","Bum");
		List<String> team2 = Arrays.asList("Rashid","Samira","Khna");
		List<String> team3 = Arrays.asList("Balla","Max","Lee");
		
		//List<String> teams=new ArrayList<String>();
		List<List<String>> teams123=Arrays.asList(team1,team2,team3);
		
//		teams.addAll(team1);
//		teams.addAll(team2);
//		teams.addAll(team3);
		//System.out.println(teams123);
		
//		for(List<String> tem:teams123)
//		{
//			System.out.println(tem);
//			for(String name:tem)
//			{
//				System.out.println(name);
//			}
//		}
		
		List<String>finalTeam=teams123.stream().flatMap(ftem->ftem.parallelStream()/*stream()*/).collect(Collectors.toList());
		System.out.println(finalTeam);							
	}

}
