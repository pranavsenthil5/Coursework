import java.util.*;
public class TreeCustom 
/**
 * Binary tree Is a data structure where an object can be connected to 1 to 3 different objects. 
   */
{   
    TreeCustomNode root=null;
    static int w,h,hInc;
    
    ArrayList <Integer> xVal= new ArrayList<Integer>();
    ArrayList <Integer> yVal= new ArrayList<Integer>();
    
    public TreeCustom()
    {
        
    }
    
    ArrayList<Integer> getX()
    {
        return xVal;
    }
    
    ArrayList<Integer> getY()
    {
        return yVal;
    }
    
    public TreeCustom(int w,int h, int hInc)//Initiate
    {
        this.w=w;
        this.h=h;
        this.hInc=hInc;
    }
    
    void insert(int data)//Inserts a node
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
    
    void setCoordinates()//For displaying nodes graphically
    {
        Coordinate(root,w,h);
    }

    void Coordinate(TreeCustomNode root,int x, int y){
        if(root == null)
            return;

        System.out.println(root.data +" : ("+(x/2)+","+(y)+")");
        xVal.add(x/2);
        yVal.add(y);
        Coordinate(root.left,x/2, y+hInc);
        Coordinate(root.right, x+(x/2),y+hInc);
    }

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