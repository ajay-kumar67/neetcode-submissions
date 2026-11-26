class Solution {
public:
    bool isValid(string s) {

        stack<char>st;

    for(char ch : s) {
        if(ch == '(' || ch == '[' || ch == '{'){
            st.push(ch);
        }
        else {
            if(st.empty()) {return false;} // s = "]" if starting ch is closing ch 

           if((ch == ')' && st.top() == '(') || (ch == '}' && st.top() == '{') || (ch == ']' && st.top() == '[')){
                 st.pop();
           }
            else {
                return false; // "(}" not opposite ch's 
            }
        }
    
    }
      return st.empty();








        
    }
};
