package assignment_s1;

import java.util.Scanner;


class Node{
	int data;
	Node left, right;
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
		
	}
	
	
	
}

public class BST {
	
	static Node root;
	
/*	
	void inorder(Node root)
	{
		Node curr, prev;
		
		if(root==null)
		{
			return;
		}
		
		curr=root;
		while(curr!=null)
		{
			if(curr.left==null)
			{
				System.out.println(curr.data+ " ");
				curr=curr.right;
			}
			else
			{
				prev=curr.left;
				while(prev.right!=null && prev.right!=curr)
					prev=prev.right;
				
				if(prev.right==null)
				{
					prev.right=curr;
					curr=curr.left;
					
				}
				
				else
				{
					 prev.right=null;
					 System.out.println(curr.data + " ");
					 curr=curr.right;
				}
				
			}
		}
	}
	*/
	
	void storeInorder(Node root, int temp[], int k)
	{
		if(root==null)
			return;
		
		storeInorder(root.left,temp,k);
		
		temp[k]=root.data;
		k++;
		
		storeInorder(root.right,temp,k);
	}
	
	int cNode(Node root){
		
		//int count=0;
		
		if(root==null)
			return 0;
		
		
		
			
			return cNode(root.left)+ cNode(root.right)+1;
			
		
		
	}
	
	void arraychangeBST(Node root, int temp[], int k)
	{
		if(root==null)
			return;
		
		arraychangeBST(root.left, temp, k);
		
		temp[k]=root.data;
		k++;
		
		arraychangeBST(root.right, temp, k);
	}
	void binarychangeBST(Node root)
	{
		if(root==null)
			return;
		
		int n=cNode(root);
		
		int temp[]=new int[n];
		int k=0;
		storeInorder(root,temp,k);
		
		//SORING USING BUBBLE SORT
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n-i-1); j++)
			{
				if(temp[j]>temp[j+1])
				{
					int temp1=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=temp1;
				}
			}
		}
		
        k=0;
		arraychangeBST(root,temp,k);
		
		disp(root);	
	}
	
	static void disp(Node root)
	{
		if(root==null)
			return;
		
		disp(root.left);
		
		System.out.print(root.data + " ");
		
		//System.out.println("Binary Search tree :");
	
		disp(root.right);
	}
	
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("enter range of the elements in the tree");
		int n=input.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter elements");
		
		for(int i=0; i<n ;i++)
			
		{
			arr[i]=input.nextInt();
		}  
		
		
		BST ob= new BST();
		
		ob.root=new Node(arr[0]);
		
		
		
		
		
		ob.root.left=new Node(arr[1]);
		
		
		
			ob.root.right=new Node(arr[2]);
		
		
		
		
		
			ob.root.left.left=new Node(arr[3]);
		
		
			ob.root.left.right=new Node(arr[4]);
		
		
		ob.binarychangeBST(ob.root);
		
		
		
		
		
		//disp(root);
		
		

	}

}
