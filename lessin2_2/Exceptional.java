package lessin2_2;

import java.util.Arrays;

public class Exceptional {

    private static final class RowmismatchException extends RuntimeException {
        RowmismatchException (String message) {super("Rows Exception: "+message);}
    }

    private static final class ColumnmismatchException extends RuntimeException {
        ColumnmismatchException (String message) {super("Columns Exception: "+message);}
    }

    private static final class NumberIsNotNumberException extends RuntimeException {
        NumberIsNotNumberException (String message) {super("Not a number found: "+message);}
    }

    private static final String CORRECT_STRING = "1 3 1 2\n2 3 A 2\n5 6 7 1\n3 3 1 0";

    private static final int MATRIX_ROWS=4;
    private static final int MATRIX_COLS=4;

    private static String[][] stringToMatrix (String value){
        String [] rows = value.split("\n");
        if (rows.length!=MATRIX_ROWS){
            throw new RowmismatchException(rows.length+":\n"+value);
        }

        String [][] result = new String[MATRIX_ROWS][];
        for (int i = 0; i < result.length; i++) {
            result[i]=rows[i].split(" ");
            if (result[i].length!=MATRIX_COLS){
                throw new ColumnmismatchException(result.length+":\n"+value);
            }
        }
        return result;
    }

    private static float calcMatrix (String [][] matrix){
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    result+=Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new NumberIsNotNumberException(matrix[i][j]);
                }
            }
        }
        return result/2f;
    }

    public static void main(String[] args) {
       try {
            final String[][] matrix = stringToMatrix(CORRECT_STRING);
            System.out.println(Arrays.deepToString(matrix));
            System.out.println("Half sum= "+calcMatrix(matrix));
        } catch (NumberIsNotNumberException e) {
            System.out.println("A NumberFormatException is thrown "+e.getMessage());
        } catch (RowmismatchException|ColumnmismatchException e){
            System.out.println("A RuntimeException successor is thrown: "+e.getMessage());
        }
    }
}
