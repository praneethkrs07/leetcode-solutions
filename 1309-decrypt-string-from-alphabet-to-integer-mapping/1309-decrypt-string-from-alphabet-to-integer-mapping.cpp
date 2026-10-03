#include <string>
using namespace std;

class Solution {
public:
    string freqAlphabets(string s) {
        string ans = "";

        for (int i = 0; i < s.length(); i++) {

            // 10# to 26#
            if (i + 2 < s.length() && s[i + 2] == '#') {

                string num = s.substr(i, 2);

                int n = stoi(num);

                ans += char('a' + n - 1);

                i += 2;
            }

            // 1 to 9
            else {
                int n = s[i] - '0';

                ans += char('a' + n - 1);
            }
        }

        return ans;
    }
};