#include <iostream>
#include <vector>

const int N = 40;

using namespace std;

inline void sum(int* p, int n, vector<int> d) {
	*p = 0;
	for (int i = 0; i < n; ++i) {
		*p = *p + d[i];

	}
}

int main() {
	int i;
	int accum = 0;
	vector<int> data;
	for (int i = 0; i < N; ++i)
	{
		data.push_back(i);
	}

	sum(&accum, N, data);
	cout << "sum is " << accum << endl;
	return 0;
}