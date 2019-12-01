import java.sql.SQLException;
import java.util.Iterator;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

public class IteratorExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector<Integer> v = new MyVector<Integer>();
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		
		//External Complete (Standard Java)
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		//1. Internal Complete w/ sum functor
		SumFunctor<Integer, Integer> sumfunc = new SumFunctor<Integer, Integer>();
		System.out.println(v.doAll(sumfunc));
		
		//1.b Internal Complete w/ average functor
		AverageFunctor<Integer, Integer> avgfunc = new AverageFunctor<Integer, Integer>();
		System.out.println(v.doAll(avgfunc));
		
		//2. External Selective (repeat last two, w/ selection)
		BiggerThan2<Integer> test = new BiggerThan2<Integer>();
		it = v.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int n = it.next();
			if(test.test(n)) sum += n; 
		}
		System.out.println(sum);
		
		//3. Internal Selective
		SumFunctor<Integer, Integer> sumfunc2 = new SumFunctor<Integer, Integer>();
		System.out.println(v.doAll(test, sumfunc2));
	}

}
