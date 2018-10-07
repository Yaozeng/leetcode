// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
//
// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//
//
// Example:
//
//
// Input: "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
//
//
// Note:
//
// Although the above answer is in lexicographical order, your answer could be in any order you want.
//


class Solution {
    ArrayList<String> res = new ArrayList<String>();
    HashMap<Character, String> m = new HashMap<Character, String>();
    public List<String> letterCombinations(String digits) {        
        if(digits.length() == 0) return res;
        m.put('1', "");
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");        
        helperLetter(digits, 0, new StringBuilder());
        return res;
    }
    
    public void helperLetter(String digits, int curInd, StringBuilder sb)
    {
        if(curInd < digits.length())
        {
            String s = m.get(digits.charAt(curInd));
            for(int i = 0; i < s.length(); i++)
            {
                sb.append(s.charAt(i));
                helperLetter(digits, curInd+1, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        else        
            res.add(sb.toString());    
    }
}
