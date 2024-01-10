public class App {
    public static void main(String[] args) throws Exception {
        int[] listaNumeros = new int[] { 100, 110, 50, 80, 10, 11, 15, 8, 9 };

        quickSort(listaNumeros, 0, listaNumeros.length - 1);

        for (int i = 0; i < listaNumeros.length; i++)
            System.out.println(listaNumeros[i]);
    }

    private static void quickSort(int[] list, int start, int end) {
        int i = start,
                j = end,
                half = (int) ((i + j) / 2),
                pivot = list[half];

        do {
            while (list[i] < pivot)
                i++;

            while (list[j] > pivot)
                j--;

            if (i <= j) {
                int aux = list[i];
                list[i] = list[j];
                list[j] = aux;
                i++;
                j--;
            }
        } while (j >= i);

        if (start < j)
            quickSort(list, start, j);

        if (i < end)
            quickSort(list, i, end);
    }
}