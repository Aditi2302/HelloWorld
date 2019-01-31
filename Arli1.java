import java.util.*;
class Arli1
{
public static void main(String[]args)
{
ArrayList<Integer>al=new ArrayList<>();
al.add(10);
al.add(20);
al.add(30);
al.add(70);
al.add(90);
al.add(45);
ArrayList<Integer>al1=new ArrayList<>();
al1.add(20);
al1.add(30);
al1.add(40);
al1.add(50);

for(int i=0;i<al.size();i++)
{
int b=al1.get(i);
	if(al.contains(b))
	{
		System.out.println(al.add(al1.indexOf(b)));
	}
	else
	{
		al.add(al1.get(i));

	}
//System.out.println(al);
}
//System.out.println(al);
}




}

