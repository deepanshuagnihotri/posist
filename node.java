import java.util.Date;
class Node {
    private Date timestamp;
    private String data;
    private int nodeNumber;
    private String nodeId;
    private String referenceNodeId;        
    private String childReferenceNodeId;
    private String genesisReferenceNodeId;
    private String HashValue;
    Node left, right;

	public Date gettimestamp(Date date)
{
return date;
}

	public Date settimestamp(Date date)
{
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

}


	
	public String getData(String data)
{
    return data;
}

	public String setdata(String data)
{
    this.data= data;
}


	int getnodeNumber(int nodeNumber)
{
    return nodeNumber;
}


	public int setnodeNumber(int nodeNumber)
{
    this.nodeNumber=nodeNumber;
}

	public String getnodeId(String nodeId)
{
    return nodeId;
}



	public String setnodeId(String nodeId)
{
    this.nodeId=nodeId;
}


	public String getchildReferenceNodeId(String childReferenceNodeId)
{
    return childReferenceNodeId;
}

	public String setchildReferenceNodeId(String childReferenceNodeId)
{
    this.childReferenceNodeId=childReferenceNodeId;
}


	public String getgenesisReferenceNodeId(String genesisReferenceNodeId)
{
    return genesisReferenceNodeId;
}




	public String setgenesisReferenceNodeId(String genesisReferenceNodeId)
{
    this.genesisReferenceNodeId=genesisReferenceNodeId;
}


	public String gethashValue(String hashValue)
{
    return hashValue;
}


	public String sethashValue(String hashValue)
{
    this.hashValue=hashValue;
}

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
class BinarySearchTree {
 
    Node root;
 
    BinarySearchTree()
    {
        root = null;
    }
 
  
  
    public void insert(int data)
    {
        this.root = this.insertRec(this.root, data);
    }
     
    Node insertRec(Node node, int data)
    {   

        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }
 
       
        if (data <= node.data) {
            node.left = this.insertRec(node.right, data);
        } else {
            node.right = this.insertRec(node.left, data);
        }
        return node;
    }

    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
         
        
        tree.insert(30);
        tree.insert(17);
        tree.insert(10);
        tree.insert(3);
        
     }
}