package ashbankingv1;
		import java.util.ArrayList;
import java.util.Collections;
		import java.util.HashSet;
import java.util.List;
import java.util.Set;
		public class ss {
			public static void main(String[] args){
				String[] fruits = {"Apple", "Orange", "Banana","Orange"};
				for (int i = 0; i < fruits.length; i++) {
					System.out.println(fruits[i]);
				}
				Set<String> fruitsSet = new HashSet<>();
				Collections.addAll(fruitsSet, fruits);
				System.out.println(fruitsSet);	
				fruitsSet.remove("Orange");
			}
		}


