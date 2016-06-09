class Node
{
	int freq;
	char data;
	Node left;
	Node right;
}

class Huffman
{
	Node root;

	Huffman()
	{
		root = null;
	}

	public Node newNode(char data, int freq)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.freq = freq;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

	public void decode(String S, Node root)
	{
		Node temp = root;
		int i = 0;
		do
		{
			if(temp.data != '\0')
			{
				System.out.print(temp.data);
				temp = root;
			}
			else
			{
				if(S.charAt(i) == '0')
				{
					temp = temp.left;
				}
				else
				{
					temp = temp.right;
				}
				i++;
			}
		} while(i <= S.length());
	}
}

class HuffmanDecoding
{
	public static void main(String... strings)
	{
		Huffman huffman = new Huffman();
		huffman.root = huffman.newNode('\0', 3);
		huffman.root.left = huffman.newNode('\0', 2);
		huffman.root.left.left = huffman.newNode('B', 1);
		huffman.root.left.right = huffman.newNode('C', 1);
		huffman.root.right = huffman.newNode('A', 3);
		huffman.decode("1001011", huffman.root);
	}
}