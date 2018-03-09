package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		num.stream().filter(n->n!=3).map(n->n*n).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Sum="+num.stream().reduce(0,Integer::sum));
	}
}
