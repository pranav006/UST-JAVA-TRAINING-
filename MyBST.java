

class TLNode 
{
	int data;
	TLNode left,right;
	
	TLNode(int d)
	{
		data = d;
	}
	
}


public class MyBST 
{
	TLNode root;
	TLNode insert(int d, TLNode root)
	{  if(root == null)
		root = new TLNode(d);
	else if(d<= root.data)
	{
		root.left = insert(d,root.left);
	}
	else
	{
		root.right = insert(d,root.right);
	}
		return root;
	}
	TLNode search(int d, TLNode root)
	{
		if(root.data ==d)
			return root;
		else if(root.data>d)
		{
			return search(d,root.left);
		
		}
		else
			return search(d,root.right);
	}
	TLNode delete (int d, TLNode root)
	{
		if(root== null)
			return root;
		if(d<root.data)
			root.left = delete(d,root.left);
		else if(d>root.data)
			root.right = delete(d, root.right);
		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = minValue(root.right);
			root.right = delete(root.right,root.data);
			
		}	
		return root;
}
 private TLNode delete(TLNode right, int data) {
		// TODO Auto-generated method stub
		return null;
	}
int minValue(TLNode right) {
		int min = root.data;
		while(root.left!=null)
		{
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
 
 void inorder(TLNode r)
 {
	 if (r == null)
		 return;
	 inorder(r.left);
	 System.out.println(r.data);
	 inorder(r.right);
 }
 
public static void main (String[] args)
{
	MyBST treeObj = new MyBST();
	treeObj.root=treeObj.insert(50, treeObj.root);
	treeObj.root=treeObj.insert(20, treeObj.root);
	treeObj.root=treeObj.insert(60, treeObj.root);
	treeObj.root=treeObj.insert(80, treeObj.root);
	treeObj.root=treeObj.insert(70, treeObj.root);
	treeObj.root=treeObj.insert(60, treeObj.root);
	treeObj.root=treeObj.insert(40, treeObj.root);
	treeObj.root=treeObj.insert(10, treeObj.root);
	
	System.out.println("----Inorder traversal-----"+ treeObj.root.data);
	treeObj.inorder(treeObj.root);
	
	 TLNode nodeFound = treeObj.search(60,treeObj.root);
     if (nodeFound == null)
       System.out.println("Not found");
       
   else
        System.out.println("\nFound" + nodeFound.data );
     treeObj.root = treeObj.delete(50,treeObj.root);
     System.out.println("\n ----Inorder traversal----" + treeObj.root.data);
     treeObj.inorder(treeObj.root);
}

}
