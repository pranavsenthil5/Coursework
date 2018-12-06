import java.util.*;
public class TreeCustom 
{   
    TreeCustomNode root=null;
    static int w,h;
    
    ArrayList <Integer> xVal= new ArrayList<Integer>();
    ArrayList <Integer> yVal= new ArrayList<Integer>();
    
    public TreeCustom()
    {
        
    }
    
    public TreeCustom(int w,int h)
    {
        this.w=w;
        this.h=h;
    }
    
    void insert(int data)
    {
        root=insertNode(root,data);
    }

    TreeCustomNode insertNode(TreeCustomNode root,int data)
    {
        if(root==null)
        {
            root=new TreeCustomNode(data);
        }
        else if(data<=root.data)
        {
            root.left=insertNode(root.left,data);
        }
        else
        {
            root.right=insertNode(root.right,data);
        }
        return root;
    }

    void printCoordinate(TreeCustomNode root,int x, int y){//Pass root, x and y value from  tre diplay
        if(root == null)
            return;

        System.out.println(root.data +" : ("+x+","+y+")");
        xVal.add(x);
        yVal.add(y);
        printCoordinate(root.left, x-1, y-1);//change the parameters here
        printCoordinate(root.right, x+1,y-1);
    }//after this function use getter to get the x and y values

    void inorder()
    {
        findInorder(root);
    }

    void Preorder()
    {
        findPreorder(root);
    }

    void Postorder()
    {
        findPostorder(root);
    }

    void findInorder(TreeCustomNode root)
    {
        if(root==null)
        {
            return;
        }

        findInorder(root.left);
        System.out.println(root.data);
        findInorder(root.right);
    }

    void findPreorder(TreeCustomNode root)
    {
        if(root==null)
        {
            return;
        }

        System.out.println(root.data);
        findInorder(root.left);
        findInorder(root.right);
    }

    void findPostorder(TreeCustomNode root)
    {
        if(root==null)
        {
            return;
        }

        findInorder(root.left);
        findInorder(root.right);
        System.out.println(root.data);
    }

    TreeCustomNode Predecessor(TreeCustomNode root)
    {
        if(root.left!=null)
        {
            root=root.left;
        }
        while(root.right!=null)
        {
            root=root.right;
        }
        return root;
    }

    TreeCustomNode Successor(TreeCustomNode root)
    {
        if(root.right!=null)
        {
            root=root.right;
        }
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    void delete(TreeCustomNode root,int val)
    {
        if(root==null)
        {
            return;
        }

        while(true)
        {
            if(root.data==val)
            {
                TreeCustomNode p=Predecessor(root);
                root.data=p.data;
                while(true)
                {
                    if(root.data>val)
                    {
                        root=root.left;
                    }
                    else
                    {
                        root=root.left;
                    }
                }
            }
            else if(root.data>val)
            {
                root=root.left;
            }
            else
            {
                root=root.left;
            }
        }
    }
}