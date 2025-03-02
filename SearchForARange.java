class Solution 
{
static class pair 
{ 
	int first, second; 
	public pair(int first, int second) 
	{ 
		this.first = first; 
		this.second = second; 
	} 
} 

static int findNumber(pair a[], 
					int n, int K)
{

	for (int i = 0; i < n; i++)
	{

		if (K >= a[i].first && 
			K <= a[i].second)
			return i;
	}

	return -1;
}

public static void main(String[] args)
{
	pair a[] = {new pair(1, 3 ), 
				new pair(4, 7 ),
				new pair(8, 11 )};
	int n = a.length;
	int k = 6;
	int index = findNumber(a, n, k);
	if (index != -1)
		System.out.println(index);
	else
		System.out.println(-1);
}
}
