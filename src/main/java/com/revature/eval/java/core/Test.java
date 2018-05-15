package com.revature.eval.java.core;

public class Test {
	public static void main(String[] args) {
		final EvaluationService evaluationService = new EvaluationService();
		EvaluationService.Triangle triangle = new EvaluationService.Triangle(5, 5, 4);

		System.out.println(triangle.isEquilateral());
		System.out.println(triangle.isIsosceles());
		System.out.println(triangle.isScalene());
		
		System.out.println(evaluationService.cleanPhoneNumber("123-abc-7890"));

	}
}
