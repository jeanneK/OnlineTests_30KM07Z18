package com.acquisio.basic.java.question06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * QUESTION 07: Debugging
 * This method remove all even number from a list.
 * But the method is not working properly.
 * Find the error and fix it.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Debugging {

    public static void main(String[] args) {
        Debugging instance = new Debugging();
        System.out.println(Arrays.toString(instance.removeEvenNumbers(1, 2, 3, 4)));
	}

	Integer[] removeEvenNumbers(Integer ... values) {
		// TODO: Fix code here.

		List<Integer> integers = new ArrayList<>(Arrays.asList(values));

		for(int i = 0; i < integers.size() ; i++)	{
			if (integers.get(i)% 2 == 0) { // remove even numbers
				integers.remove(i);
			}
		}
		return integers.toArray(new Integer[integers.size()]);
	}
}
