package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.Month;

public class Test {
	public static void main(String[] args) {
		final EvaluationService evaluationService = new EvaluationService();
		EvaluationService.Triangle triangle = new EvaluationService.Triangle(5, 5, 4);

		System.out.println(triangle.isEquilateral());
		System.out.println(triangle.isIsosceles());
		System.out.println(triangle.isScalene());
		
		System.out.println(evaluationService.acronym("Complementary metal-oxide semiconductor"));
		System.out.println(evaluationService.cleanPhoneNumber("3524567897"));
		System.out.println((evaluationService.wordCount("one,\ntwo,\nthree")));
		System.out.println(evaluationService.toPigLatin("quick fast run"));
		System.out.println(evaluationService.isArmstrongNumber(9474));
		System.out.println(evaluationService.calculatePrimeFactorsOf(9L));
		EvaluationService.RotationalCipher rc = new EvaluationService.RotationalCipher(13);
		rc.rotate("The quick brown fox jumps over the lazy dog.");
		System.out.println(evaluationService.calculateNthPrime(1));
		EvaluationService.AtbashCipher.encode("Testing,1 2 3, testing.");
		EvaluationService.AtbashCipher.decode("gvhgr mt123 gvhgr mt");
		evaluationService.isValidIsbn("3-598-21508-8");
		System.out.println( evaluationService.isPangram("a quick movement of the enemy will jeopardize five gunboats") );
		evaluationService.getGigasecondDate(LocalDate.of(1977, Month.JUNE, 13));
		evaluationService.solveWordProblem("What is -3 multiplied by 25?");
		evaluationService.isLuhnValid("4539 1488 0343 6467");
		int[] set = { 5, 6, 8 };
		evaluationService.getSumOfMultiples(150, set);
	}
}
