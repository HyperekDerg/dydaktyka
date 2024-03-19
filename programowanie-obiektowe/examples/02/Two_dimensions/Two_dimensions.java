public class Two_dimensions {
    private int arr_[][];
    
    public Two_dimensions(int size_x, int size_y) {
        arr_ = new int[size_x][size_y];
    }
    
    public int at(int x, int y) {
        return arr_[x][y];
    }
    
    public void at(int x, int y, int val) {
        arr_[x][y] = val;
    }
    
    public int size_x() {
        return arr_.length;
    }
    
    public int size_y() {
        return arr_[0].length;
    }
    
    public static void main(String[] args) {
        Two_dimensions td = new Two_dimensions(2, 3);
        System.out.println("Program wykorzystuje tablicę "
                           + td.size_x() + " x " + td.size_y() + ".");
        
        for (int i = 0; i < td.size_x(); ++i) {
            for (int j = 0; j < td.size_y(); ++j) {
                td.at(i, j, (i + 1) * (j + 2));
            }
        }

        for (int i = 0; i < td.size_x(); ++i) {
            for (int j = 0; j < td.size_y(); ++j) {
                System.out.print(td.at(i, j) + " ");
            }
            System.out.println();
        }
    }
}
