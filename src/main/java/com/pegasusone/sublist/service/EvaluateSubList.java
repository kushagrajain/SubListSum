package com.pegasusone.sublist.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pegasusone.sublist.controller.MainController;

@Component
public class EvaluateSubList {

    static boolean[][] isSubsetEligible;
    static List<List<Integer>> outputList = new ArrayList<List<Integer>>();
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
    
    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }
      
    /*
     *  This recursive method will identify subsets eligible and save the same to outputList.
     */
    static void printSubsetsRec(int arr[], int i, int sum, ArrayList<Integer> p)
    {
        if (i == 0 && sum != 0 && isSubsetEligible[0][sum])
        {
            p.add(arr[i]);
            saveSubset(p);
            p.clear();
            return;
        }
      
        // If sum becomes 0, then save to subset
        if (i == 0 && sum == 0)
        {
        	saveSubset(p);
            p.clear();
            return;
        }
      
        if (isSubsetEligible[i-1][sum])
        {
            // Create a new vector to store path
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(p);
            printSubsetsRec(arr, i-1, sum, b);
        }
      
        // If given sum can be achieved after considering current element
        if (sum >= arr[i] && isSubsetEligible[i-1][sum-arr[i]])
        {
            p.add(arr[i]);
            printSubsetsRec(arr, i-1, sum-arr[i], p);
        }
    }
    
    static void saveSubset(ArrayList<Integer> subList)
    {
    	logger.info(subList.toString());
    	outputList.add(new ArrayList(subList));
    }
      
    // Returns all subsets of arr[0..n-1] with given sum.
    public static List<List<Integer>> printAllSubsets(List<Integer> inputList, int n, int sum)
    {
    	int arr[] = convertIntegers(inputList);
    	outputList = new ArrayList<List<Integer>>();
        if (n == 0 || sum <= 0)
           return outputList;
      
        // Sum 0 can always be achieved with 0 elements
        isSubsetEligible = new boolean[n][sum + 1];
        for (int i=0; i<n; ++i)
        {
            isSubsetEligible[i][0] = true;  
        }
      
        // Sum arr[0] can be achieved with single element
        if (arr[0] <= sum)
           isSubsetEligible[0][arr[0]] = true;
      
        // Fill rest of the entries in isSubsetEligible[][]
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < sum + 1; ++j)
                isSubsetEligible[i][j] = (arr[i] <= j) ? (isSubsetEligible[i-1][j] ||
                                           isSubsetEligible[i-1][j-arr[i]])
                                         : isSubsetEligible[i - 1][j];
        if (isSubsetEligible[n-1][sum] == false)
        {
            logger.info("There are no subsets with" + " sum "+ sum);
            return outputList;
        }
      
        // Now recursively traverse isSubsetEligible[][] to find all paths from isSubsetEligible[n-1][sum]
        ArrayList<Integer> p = new ArrayList<>();
        printSubsetsRec(arr, n-1, sum, p);
        return outputList;
    }
}
