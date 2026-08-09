class Solution {
    public int evalRPN(String[] tokens) {
        Stack <String> st = new Stack<>();

        for (String s : tokens){
            switch(s){
                
                case "+":{
                    int val2 = Integer.parseInt(st.pop());
                    int val1 = Integer.parseInt(st.pop());
                    int res = val1 + val2;
                    st.push(Integer.toString(res));
                    break;
                } 
                case "-":{
                    int val2 = Integer.parseInt(st.pop());
                    int val1 = Integer.parseInt(st.pop());
                    int res = val1-val2;
                    st.push(Integer.toString(res));
                    break;
                }
                case "/":{
                    int val2 = Integer.parseInt(st.pop());
                    int val1 = Integer.parseInt(st.pop());
                    int res = val1/val2;
                    st.push(Integer.toString(res));
                    break;
                }
                case "*":{
                    int val2 = Integer.parseInt(st.pop());
                    int val1 = Integer.parseInt(st.pop());
                    int res = val1*val2;
                    st.push(Integer.toString(res));
                    break;
                }
                default: st.push(s);
            }

        }
        return Integer.parseInt(st.pop());
        
    }

    
}
