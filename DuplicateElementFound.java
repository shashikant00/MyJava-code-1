import java.util.*;
class DuplicateElementFound
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5,1,2,6,7,1,2,3,8,5};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num :arr)
		{
			Integer count=map.get(num);
			if(count==null)
			{
			  map.put(num,1);	
			}else{
				count=count+1;
				map.put(num,count);
			}
		}
		System.out.println(map);
		
		//find only duplicate number 
	}
}