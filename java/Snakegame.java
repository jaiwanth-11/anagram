package programs;

import java.util.*;

public class Snakegame {
    public char Snakeboard[][] = null;
    public int row = 0;
    public int column = 0;

    public Snakegame(int s, int c) {
        Snakeboard = new char[s][c];
        for (int i = 0; i < s; i++) {
            Arrays.fill(Snakeboard[i], '0');
        }
        Snakeboard[1][4] = 'X';
        Snakeboard[2][3] = 'X';
        Snakeboard[4][1] = 'X';
    }

    public void game(int m, int n) {
        if (m < 0 || m >= Snakeboard.length || n < 0 || n >= Snakeboard[0].length) {
            System.out.println("GAME OVER: Out of bounds");
            System.exit(0);
        }
         else if (Snakeboard[m][n] == '.') {
            System.out.println("GAME OVER: Hit itself");
            System.exit(0);
        }
        row = m;
        column = n;
        List<Integer>a=new ArrayList<>(Arrays.asList(m,n));
    	List<List<Integer>>b=new ArrayList<>(Arrays.asList());
        if(Snakeboard[m][n]!='X') {
        	Snakeboard[m][n]='.';
        	b.add(a);
        	a.clear();
            List<Integer>c=b.get(0);
            int h=c.get(0);
            int j=c.get(0);
            space(h,j);
            b.remove(0);
        }
        else if(Snakeboard[m][n] == 'X') {
        	Snakeboard[m][n]='.';
        	b.add(a);
        	a.clear();
        }
        print();
    }
    public void space(int f,int g) {
    	Snakeboard[f][g]='0';
    }

    public void print() {
        for (int i = 0; i < Snakeboard.length; i++) {
            for (int j = 0; j < Snakeboard[i].length; j++) {
                System.out.print(Snakeboard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        Snakegame sg = new Snakegame(5, 5);

        while (true) {
            sg.print();
            String direction = g.nextLine();

            if (direction.equals("Up")) {
                sg.game(sg.row - 1, sg.column);
            } else if (direction.equals("Down")) {
                sg.game(sg.row + 1, sg.column);
            } else if (direction.equals("Right")) {
                sg.game(sg.row, sg.column + 1);
            } else if (direction.equals("Left")) {
                sg.game(sg.row, sg.column - 1);
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
	