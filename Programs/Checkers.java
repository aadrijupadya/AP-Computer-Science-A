import java.util.*;
public class Checkers {
    public static void display(pieces[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i][0] + " " + board[i][1] + " " + board[i][2] + " " + board[i][3] + " " + board[i][4]
                    + " " + board[i][5] + " " + board[i][6] + " " + board[i][7] + " | " + " " + i);
            System.out.println();
            if (i == 7) {
                System.out.println("_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_");
                System.out.println(0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7);
            }
        }
    }

    public static void makeMoveRight(pieces[][] board, int row, int column) {
        pieces p = board[row][column];
        if (board[row][column].canMove() && board[row+1][column+1].toString() == "-" && p.toString() == "B") {
            System.out.println(p);
            board[row][column] = new pieces(row,column,false,"-");
            p.setX(column + 1);
            p.setY(row + 1);
            board[row+1][column+1] = p;
        }
        else if (board[row][column].canMove()  &&  p.toString() == "R") {
            System.out.println(p);
            board[row][column] = new pieces(row,column,false,"-");
            p.setX(column + 1);
            p.setY(row - 1);
            board[row-1][column+1] = p;
        }
        else {
            System.out.println("Invalid move");
        }
    }

    public static void makeMoveLeft(pieces[][] board, int row, int column) {
        pieces p = board[row][column];
        if (board[row][column].canMove() && board[row+1][column-1].toString() == "-" && p.toString() == "B") {
            System.out.println(p);
            board[row][column] = new pieces(row,column,false,"-");
            p.setX(column - 1);
            p.setY(row + 1);
            board[row+1][column-1] = p;
        }
        else if (board[row][column].canMove()  &&  p.toString() == "R") {
            System.out.println(p);
            board[row][column] = new pieces(row,column,false,"-");
            p.setX(column - 1);
            p.setY(row - 1);
            board[row-1][column-1] = p;
        }
        else {
            System.out.println("Invalid move");
        }
    }


    public static pieces[][] populate(pieces[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < board[0].length; j++) {
                    if (j % 2 != 0) {
                        board[i][j] = new pieces(i,j,false,"B");
                    }
                    else {
                        board[i][j] = new pieces(i,j,false,"-");
                    }
                }       
            }  
            if (i == 1) {
                for (int j = 0; j < board[0].length; j++) {
                    if (j % 2 ==  0) {
                        board[i][j] = new pieces(i,j,false,"B");
                    }
                    else {
                        board[i][j] = new pieces(i,j,false,"-");
                    }
                }       
            }  

            if (i == 5 || i == 7) {
                for (int j = 0; j < board[0].length; j++) {
                    if (j % 2 ==  0) {
                        board[i][j] = new pieces(i,j,false,"R");
                    }
                    else {
                        board[i][j] = new pieces(i,j,false,"-");
                    }
                }       

            }  

            if (i == 6) {
                for (int j = 0; j < board[0].length; j++) {
                    if (j % 2 !=  0) {
                        board[i][j] = new pieces(i,j,false,"R");
                    }
                    else {
                        board[i][j] = new pieces(i,j,false,"-");
                    }
                }       
            }  
            if (i == 3 || i == 4) {
                for (int j = 0; j < board[0].length; j++) {
                     board[i][j] = new pieces(i,j,false,"-");
                }
            }
        }
        return board;
        
    }
    public static void main(String[] args) {
        Scanner pencil = new Scanner(System.in);
        pieces[][] pieceboard = new pieces[8][8];
        populate(pieceboard);
        boolean endgame = false;
        while (!endgame) {
            display(pieceboard);
            System.out.println("What row piece do you want to move?");
            int a = pencil.nextInt();
            System.out.println("What column piece do you want to move?");
            int b = pencil.nextInt();
            pencil.nextLine();
            System.out.println("What direction do you want to move?");
            String c = pencil.nextLine();
            if (c.equals("l")) {
                makeMoveLeft(pieceboard, a, b);
            } else if (c.equals("r")) {
                makeMoveRight(pieceboard, a, b);
            }
        }        
    }

}