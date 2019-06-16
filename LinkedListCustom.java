
class LinkedListCustom 
{
	LinkedListCustomNode first, last;
	LinkedListCustomNode first1, last1;
    void insert(int x)//Inserting the node at the right place, the nodes should be sorted
    {
    	LinkedListCustomNode nptr=new LinkedListCustomNode(x);
        boolean done = false;
        if(first==null)
        {
            first=nptr;
            last=nptr;
        }
        else if(x<first.data)
        {
            nptr.next=first;
            first=nptr;
        }
        else if(x>first.data)
        {
        	LinkedListCustomNode prev,curr;
            curr=first;

            prev=curr;
            curr=curr.next;

            while(curr!=null)
            {
                if(x>prev.data && x<curr.data)
                {
                    prev.next=nptr;
                    nptr.next=curr;
                    done=true;
                    break;
                }

                else
                {
                    prev=curr;
                    curr=curr.next;
                }
            }
            if(done!=true)
            {
                last.next=nptr;
                last=nptr;
            }
        }
        else
        {
            nptr.next=first;
            first=nptr;
        }
    }

    void display() {//Displays the nodes
    	LinkedListCustomNode curr= first;
        while (curr!= null) {
            System.out.println(curr.data);
            curr= curr.next;
        }
        //System.out.println(curr.data);
    }

    void delete(int x)//Deletes a node by value
    {
        if(first==null)
            return;

        else
        {
        	LinkedListCustomNode prev,curr;
            curr=first;

            prev=curr;
            curr=curr.next;

            while(curr!=null)
            {
                if(curr.data==x)
                {
                    prev.next=curr.next;
                    break;
                }
                else
                {
                    prev=curr;
                    curr=curr.next;
                }
            }

        }

    }

    void deleteBy(int x)
    {
        if(first==null)
            return;

        else
        {
        	LinkedListCustomNode prev,curr;
            curr=first;
            boolean check=false;
            prev=curr;
            curr=curr.next;

            while(curr!=null)
            {
                if(curr.data==x)
                {
                    check=true;
                    prev.next=curr.next;
                }
                else if(check==true)
                {
                    break;
                }
                prev=curr;
                curr=curr.next;

            }
        }
    }

    void reverseData()//Reverses the linked list
    {
        String temp="";
        if(first==null)
            return;

        else
        {
        	LinkedListCustomNode curr;
            curr=first;

            while(curr!=null)
            {
                temp=""+curr.data;
                curr.data=rev(temp);
                curr=curr.next;
            }
        }
    }

    int rev(String y)
    {
        int x=Integer.parseInt(y);
        int temp=0;
        for(int i=0;i<y.length();i++)
        {
            temp=temp*10+(x%10);
            x=x/10;
        }
        return temp;
    }

    void reverseNode()
    {
    	LinkedListCustomNode curr;
        curr=first;
        int temp;
        while(curr!=null)
        {
            temp=curr.data;
            LinkedListCustomNode tempCurr=curr;
            revNode(curr);
            curr=tempCurr;
            curr=curr.next;
        }
        first=first1;
    }

    void revNode(LinkedListCustomNode nptr1)
    {
        nptr1.next=null;
        boolean done = false;
        if(first1==null)
        {
            first1=nptr1;
            last1=nptr1;
        }
        else if(nptr1.data>first1.data)
        {
            nptr1.next=first1;
            first1=nptr1;
        }
        else if(nptr1.data<first1.data)
        {
        	LinkedListCustomNode prev1,curr1;
            curr1=first1;

            prev1=curr1;
            curr1=curr1.next;

            while(curr1!=null)
            {
                if(nptr1.data<prev1.data && nptr1.data>curr1.data)
                {
                    prev1.next=nptr1;
                    nptr1.next=curr1;
                    done=true;
                    break;
                }

                else
                {
                    prev1=curr1;
                    curr1=curr1.next;
                }
            }
            if(done!=true)
            {
                last1.next=nptr1;
                last1=nptr1;
            }
        }
        else
        {
            nptr1.next=first1;
            first1=nptr1;
        }
        
    }
}
