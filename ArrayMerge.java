package com.psk.ust.A1;

public class ArrayMerge {
	void merge(int array[],int l, int m,int r )
	{
		int L1=m-l+1;
		int R1 = r-m;
		
		int L[] = new int[L1];
		int R[] = new int [R1];
		
		for(int i=0;i<L1;i++)
		{
		L[i] = array[l+i];
		}
		for(int j=0;j<R1;j++)
		{
		R[j] = array[m+j+1];
		}
		int i=0,j=0;
		int k=l;
		while(i<L1 && j<R1)
        {
	if(L[i]<=R[j])
	{
		array[k] = L[i];
	    i++;
        
	}   else
        {
        	array[k]=R[j];
        	j++;
        }
        k++;
        }
        
		while(i<L1) {
			array[k]=L[i];
			i++;
			k++;
		}
	        
		while(j<R1)
		{
			array[k]=R[j];
			j++;
			k++;
		}}

}
