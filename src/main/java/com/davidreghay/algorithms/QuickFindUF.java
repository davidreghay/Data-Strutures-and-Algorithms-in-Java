package com.davidreghay.algorithms;

public class QuickFindUF implements UF {

	private int[] id;
	private int count;
	
	public QuickFindUF(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	@Override
	public void union(int p, int q) {
		int pID = find(p);
		int qID = find(q);
		
		if(pID == qID) {
			return;
		}
		
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pID) {
				id[i] = qID;
			}
		}
		
		count--;
	}

	@Override
	public int find(int p) {
		return id[p];
	}

	@Override
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	@Override
	public int count() {
		return count;
	}

}
