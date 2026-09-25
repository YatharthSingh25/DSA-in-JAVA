class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> result = parse(expression, 0, expression.length() -1);
        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);
        return ans;
        
    }
    private Set<String> parse(String s, int l, int r){
        Set<String> result = new HashSet<>();
        Set<String> current = new HashSet<>();
        current.add("");

        int i=l;

        while(i<=r){
            if(Character.isLetter(s.charAt(i))){
            Set<String> temp = new HashSet<>();
            for (String str : current){
                temp.add(str+s.charAt(i));
            }

            current = temp;
            i++;
        }

        else if(s.charAt(i)=='{'){
            int start = i+1;
            int count = 1;
                i++;

                while (count != 0) {
                    if (s.charAt(i) == '{') {
                        count++;
                    } else if (s.charAt(i) == '}') {
                        count--;
                    }
                    i++;
        }
            Set<String> inside = parse(s, start, i - 2);

                Set<String> temp = new HashSet<>();

                for (String a : current) {
                    for (String b : inside) {
                        temp.add(a + b);
                    }
                }

                current = temp;
        }

        else if (s.charAt(i) == ',') {
                result.addAll(current);
                current = new HashSet<>();
                current.add("");
                i++;
            }
        }

        result.addAll(current);

        return result;
}
}