package in.StreamAppi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Api {

	public static void main(String[] args) 
	{
		List<Integer> list1 = Arrays.asList(10,15,20,25,30);
		ArrayList<Integer> evenList = new ArrayList();
		
		/*for(int i:list1)
		{
			if(i % 2 == 0)
			{
				evenList.add(i);
			}
		}
		System.out.println("EvenList:"+list1);*/
		
//		evenList=(ArrayList<Integer>) list1.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evenList);
		
		list1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));	
		}

}