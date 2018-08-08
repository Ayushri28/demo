package Assign;


import java.util.Scanner;

public class Mergesort {
	
	/*void merge(int a[], int l,int m, int h)
	{
		int i=l, j=m+1, k=l;
		int[] ar=new int[h+1];
		while(i<=m && j<=h)
		{
			if(a[i]<a[j])
			{
			ar[k]=a[i];
			k++;
			}
			else
				if(a[i]>a[j])
					
					{
					ar[k]=a[j];
					k++;
					}
		}
		
		while(j<h)
		{
			ar[k]=ar[i];
			i++;
			k++;
		}
		while(i<m)
		{
			ar[k]=ar[j];
			k++;
			j++;
		}
		
		
	}
	
	void mergesort(int a[], int l, int h)
	{
		if(l<h)
		{
			int m=(l+h)/2;
			
			mergesort(a,l,m);
			mergesort(a,m+1,h);
			
			
			merge(a,l,m,h);
		}
	}
	*/
	
	void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void mergesort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            mergesort(arr, l, m);
            mergesort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
	
	static void printarray(int a[], int n)
	{
		for(int i=0; i<n;i++)
		{
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
		int n=input.nextInt();
		int[] arr1=new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr1[i]=input.nextInt();
		}
		
		Mergesort obj= new Mergesort();
		obj.mergesort(arr1,0,n-1);
		
        printarray(arr1,n);
	}

}
