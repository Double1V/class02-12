class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double[] arr = new double[2];
        arr[0] = (double) ((int) Math.round((x[0] + y[0] + z[0]) / 3 * 10000)) / 10000;
        arr[1] = (double) ((int) Math.round((x[1] + y[1] + z[1]) / 3 * 10000)) / 10000;
        return arr;
    }
}