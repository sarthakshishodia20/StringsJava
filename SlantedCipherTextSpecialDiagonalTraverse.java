class Solution {
    // phle encoded text ko matrix ke andr put kro and diagonal traverse krke word ko print krao 
    // diagonal traverse ke liye top left to bottom right jana hai toh row toh saari traverse honi hai baari baari loop ke andr column ko increase krte jao required jb tk na ho puri
    public String decodeCiphertext(String encodedText, int rows) {
        int cols=encodedText.length()/rows;
        int index=0;
        char[][] matrix=new char[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=encodedText.charAt(index++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int col=0;col<cols;col++){
            int row=0;
            int currentColumn=col;
            while(row<rows && currentColumn<cols){
                sb.append(matrix[row][currentColumn]);
                row++;
                currentColumn++;
            }
        }
        while(sb.length()>0 && sb.charAt(sb.length()-1)==' '){
                sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
