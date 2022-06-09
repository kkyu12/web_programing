package j;

public class Algo2 {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int R = sc.nextInt();

  int N = sc.nextInt();
  int[] x = new int[N];
  int[] y = new int[N];
  for (int i = 0; i < N; i++) {
    x[i] = sc.nextInt();
    y[i] = sc.nextInt();
  }
  for (int i = 0; i < N; i++) {
    if (Math.pow(x[i] - a, 2) + Math.pow(y[i] - b, 2) >= Math.pow(R, 2)) {
      System.out.println("silent");
    } else {
      System.out.println("noisy");
    }
  }
}
