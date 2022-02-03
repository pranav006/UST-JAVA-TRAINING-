package com.psk.ust.A1;

public class ArraySort extends ArrayMerge{
	public void sort(int array[], int l, int r)
	{
		if(l<r)
		{
			int m = (r+l)/2;
			sort(array,l,m);
			sort(array,m+1,r);
			
			merge(array,l,m,r);
		}
	}

	
}
