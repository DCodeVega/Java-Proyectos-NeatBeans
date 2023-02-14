package ejemplosDeEstructuras;

public class Generacion_Matrices {

    // generacion de la matriz del tablero de ajedrez
    public int[][] genera_tablero_ajedrez(int n) {
        int M[][], i, j;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    M[i][j] = 1;
                } else {
                    M[i][j] = 0;
                }
            }
        }
        return M;
    }

    //generacion de la matriz del cubo magico
    public int[][] cubo_magico(int n) {
        int M[][], i;
        M = new int[n][n];
        int fila, columna;
        fila = 0;
        columna = n / 2;
        for (i = 1; i <= n * n; i++) {
            M[fila][columna] = i;
            if (i % n == 0) {
                fila++;
            } else {
                if (fila == 0) {
                    fila = n - 1;
                } else {
                    fila--;
                }
                if (columna == n - 1) {
                    columna = 0;
                } else {
                    columna++;
                }
            }
        }
        return (M);
    }

    // Generacion de la matriz Triangular Superior
    public int[][] genera_matriz_triangular_superior(int n) {
        int M[][], i, j;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i <= j) {
                    M[i][j] = 1;
                } else {
                    M[i][j] = 0;
                }
            }
        }
        return M;
    }

    // Generacion de la matriz Triangular inferior
    public int[][] genera_matriz_triangular_inferior(int n) {
        int M[][], i, j;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i >= j) {
                    M[i][j] = 1;
                } else {
                    M[i][j] = 0;
                }
            }
        }
        return M;
    }

    // Generacion de la matriz X
    public int[][] genera_matriz_X(int n) {
        int M[][], i, j;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    M[i][j] = 1;
                } else if ((i + j) == (n - 1)) {
                    M[i][j] = 1;
                } else {
                    M[i][j] = 0;
                }
            }
        }
        return M;
    }

    // Generacion de la matriz gusanito
    public int[][] genera_matriz_gusano(int n) {
        int M[][], i, j;
        int num = 1;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < n; j++) {
                    M[i][j] = num;
                    num++;
                }
            } else {
                for (j = n - 1; j >= 0; j--) {
                    M[i][j] = num;
                    num++;
                }
            }
        }
        return M;
    }

    // Generacion de la matriz de tiro al blanco
    public int[][] genera_matriz_tiro_blanco(int n) {
        int M[][], i, j;
        int num=0;
        M = new int[n][n];
        num = (n / 2) + 1;
        for (i = 0; i < n; i++) {
            for (j = i; j < n - i; j++) {
                M[i][j] = num;
            }
            for (j = i + 1; j < n - i; j++) {
                M[j][n - i - 1] = num;
            }
            for (j = n - 2 - i; j >= i; j--) {
                M[n - i - 1][j] = num;
            }
            for (j = n - 2 - i; j >= i; j--) {
                M[j][i] = num;
            }
            num = num - 1;
        }
        return M;
    }

    // Generacion de la matriz caracol
    public int[][] genera_matriz_caracol(int n) {
        int M[][], i, j;
        int num = 1;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = i; j < n - i; j++) {
                M[i][j] = num;
                num++;
            }
            for (j = i + 1; j < n - i; j++) {
                M[j][n - i - 1] = num;
                num++;
            }
            for (j = n - 2 - i; j >= i; j--) {
                M[n - i - 1][j] = num;
                num++;
            }
            for (j = n - 2 - i; j > i; j--) {
                M[j][i] = num;
                num++;
            }
        }
        return M;
    }

    // Generacion de la matriz latina
    public int[][] genera_matriz_latina(int n) {
        int M[][], i, j;
        int num = 1;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (num == n + 1) {
                    num = 1;
                }
                M[i][j] = num;
                num = num + 1;
            }
            num = i + 2;
        }
        return M;
    }

    // Generacion de la matriz las columnas de uno intercalado
    public int[][] genera_matriz_columnas_1(int n) {
        int M[][], i, j;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    M[i][j] = 1;
                } else {
                    M[i][j] = 0;
                }
            }
        }
        return M;
    }
    // Generacion de la matriz cuadrada con numeros pares la diagonal secundaria
    public int[][] genera_matriz_diagonal_secundario(int n) {
        int M[][], i, j;
        int num = 2;
        M = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    M[i][j] = num;
                    num = num + 2;
                }
            }
        }
        return M;
    }
}
