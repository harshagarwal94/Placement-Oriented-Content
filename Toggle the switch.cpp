/*Toggle The Bulbs
There are N bulbs that are initially off. In the first round, you turn ON all the bulbs, then you turn off every second bulb in the second round. On the third round, you toggle every third bulb (turning ON if it's OFF or vice-versa). For the Ith round, you toggle every Ith bulb. For the Nth round, you only toggle the last bulb.

Return the number of bulbs that are ON after the N rounds.



Example 1:

Input: 

3

Output: 

1
*/

#include<bits/stdc++.h>
using namespace std;

int main()              //  O(log(n))
{
    int n ;
    cin >> n ;
    
    cout << (int)sqrt(n) ;

    return 0;
}
