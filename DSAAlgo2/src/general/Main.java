package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparatorAndComparable.LaptopImpl;
import dynamicProgramming.ServiceNowCompanyNumberOfWaysProblem;
import febWeek12023.BestTeamWithNoConflicts;
import lamdaExpression.LamdaExpressionDemo;
import linkedList.MaximumTwinSumofaLinkedList;
import pac11.ContinuousSubarraySum;
import pac11.LFUCache;
import pac11.NextPermutation;
import pac11.PartitionEqualSubsetSum;
import pac11.ReverseNodesinKGroups;
import quickSortPattern.FindtheKthLargestIntegerintheArrayImpl;
import quickSortPattern.KClosestPointstoOriginImpl;
import strings.DistinctSubsequences;
import strings.NumberofAtoms;
import strings.TextJustification;
import strings.ValidNumber;

public class Main {

	public static void main(String[] args) {
		//MaximumTwinSumofaLinkedList.method();
		//NumberofAtoms.method();
		
		List<String>list=new ArrayList<>();
		//	Arrays.f
			list.add("ab");
			list.add("ba");
			list.add("ab");
			Comparator c1=new Comparator<String>() {
				public int compare(String s1,String s2) {
					
					if(s1.compareTo(s2)>0)
						return -1;
					else
						return 1;
				}
			};
			Collections.sort(list,c1);
			for(String s:list)
				System.out.println(s);

	}

}
