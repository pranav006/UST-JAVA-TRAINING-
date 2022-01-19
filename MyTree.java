class TNode
{
	int data;
	TNode left, right;
	TNode (int d)
	{
		this.data = d;
	}
}




public class MyTree
{
static void preorder(TNode r)
{
	if(r == null)
		return;
	System.out.print(r.data + " ");
	preorder(r.left);
	preorder(r.right);
	
}
 
static void inorder(TNode r)
{
	if(r == null)
		return;
	inorder(r.left);
	System.out.print(r.data + " ");
	inorder(r.right);
}
static void postorder(TNode r)
{
	if(r == null)
		return;
	postorder(r.left);
    postorder(r.right);
	System.out.print(r.data + " ");
}
public static void main (String[] args)
{
	TNode root = new TNode(1);
	root.left = new TNode(2);
	root.right = new TNode(3);
	root.left.left = new TNode(4);
	root.left.right = new TNode(5);
	root.right.left = new TNode(6);
	root.right.right = new TNode(7);
	
	System.out.println("Preorder Traversal");
	preorder(root);
	
	System.out.println("\nInorder Traversal");
	inorder(root);
	
	System.out.println("\nPostorder Traversal");
	postorder(root);
	
	
}
}
