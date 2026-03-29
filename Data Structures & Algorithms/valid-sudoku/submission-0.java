class Solution {
    public boolean isGridValid(int r,int c,char[][] b){
        HashMap<Character,Integer>map=new HashMap<>();
        char curr;
        for (int i=r;i<r+3;i++){
            for (int j=c;j<c+3;j++){
                curr=b[i][j];
                if (curr=='.'){
                    continue;
                }
                else{
                map.put(curr,(map.getOrDefault(curr,0))+1);
                if ((map.get(curr))>1){return false;}}
            }
        }
        return true;}
        //did a grid set
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer>map=new HashMap<>();
        char curr;
        for (int i=0;i<=8;i++){
            for (int j=0;j<=8;j++){
                curr=board[i][j];
                if (curr=='.'){
                    continue;
                }
                else{
                map.put(curr,(map.getOrDefault(curr,0))+1);
                if ((map.get(curr))>1){return false;}}
            }
            map.clear();
        }
        //did rows
        for (int i=0;i<=8;i++){
            for (int j=0;j<=8;j++){
                curr=board[j][i];
                if (curr=='.'){
                    continue;
                }
                else{
                map.put(curr,(map.getOrDefault(curr,0))+1);
                if ((map.get(curr))>1){return false;}}
            }
            map.clear();
        }
        //did columns
        for (int row=0;row<7;row+=3){
            for (int column=0;column<7;column+=3){
                if (isGridValid(row,column,board)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        //grid shifting
        



    return true;}
}

