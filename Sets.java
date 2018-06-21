package Collection1;

import java.util.HashSet;

class Sets
{
    public static void main(String args [])
	{
        HashSet<Integer> H1 = new HashSet<Integer>();
        H1.add(1);
        H1.add(2);
        H1.add(3);
        H1.add(4);
        H1.add(5);
        
        HashSet<Integer> H2 = new HashSet<Integer>();
        H2.add(2);
        H2.add(3);
        H2.add(4);
        H2.add(10);
        
		System.out.print("Elements of first Set:  ");
        System.out.println(H1);
        
		System.out.print("Elements of Second Set:  ");
        System.out.println(H2);
        
        H2.retainAll(H1);
        
        System.out.print("Element COmmon in Both First and Second Set:  ");
        System.out.println(H2);
    }
}