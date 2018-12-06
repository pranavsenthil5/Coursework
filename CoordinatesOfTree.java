class CoordinatesOfTree{
    static int length;
    static int xVal[]=new int[length];
    static int yVal[]=new int[length];
    static class Tree{
        int data;
        Tree left = null;
        Tree right = null;

        public Tree(int data){
            this.data = data;
        }

        //create minimal bst
        public static Tree createBST(int []a, int left, int right){
            if(right < left)
                return null;

            int mid = (left + right)/2;
            Tree root = new Tree(a[mid]);
            root.left = createBST(a, left, mid - 1);
            root.right = createBST(a, mid + 1, right);

            return root;
        }
    }

    static void printCoordinate(Tree root,int x, int y){
        if(root == null)
            return;

        System.out.println(root.data +" : ("+x+","+y+")");
        printCoordinate(root.left, x-1, y-1);
        printCoordinate(root.right, x+1,y-1);
    }

    public static void main(String... args){
        int[]arr = {1,2,3,4,5,6,7};
        Tree root = Tree.createBST(arr, 0,arr.length-1);
        printCoordinate(root,0, 0);
    }
}
